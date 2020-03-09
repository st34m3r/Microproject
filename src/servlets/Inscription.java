package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Client;
import beans.DBConnection;


public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection=null;
	
	public Inscription() {
        super();
    }
    public void init() throws ServletException
    {
    	try {
			Connection connection = DBConnection.getDBConnection();
			log("connection effectué !");
	
		} catch (SQLException e) {
			log("connection non effectué !");
		}
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("/inscrire.jssp").forward(request, response);	

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Client client = new Client();
		client.nom = request.getParameter("nom");
		client.prenom = request.getParameter("prenom");
		client.adresse = request.getParameter("adresse");
		client.code = request.getParameter("code");
		client.ville = request.getParameter("ville");
		client.tel = request.getParameter("tel");
		client.email = request.getParameter("email");
		client.pass = request.getParameter("pass");	
		
		
		try {
			if(DBConnection.isEmailExist(client))
			{
				boolean wrongEmail = true;
				request.setAttribute("wrongEmail",wrongEmail);
				request.getRequestDispatcher("/inscrire.jsp").forward(request, response);	
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
			boolean wrongEmail = false;


		try {
			DBConnection.insertIntoClient(client);
			log("client  inseré");
			
		} catch (Exception e) {
			log("client non inseré");
		}
	}
	
	public void  destroy(){
			try {
				DBConnection.closeConnection();
				log("connection closed");
			}			
			catch (SQLException e) {
				log("connection still open due to some exception");
			}

	}
	}
