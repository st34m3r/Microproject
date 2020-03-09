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


public class Authentification extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection=null;
	
	public Authentification() {
        super();
    }
    public void init() throws ServletException
    {
    	try {
		Connection connection = DBConnection.getDBConnection();
		log("connection effectué !");

		}
    	catch (SQLException e) {
			log("connection non effectué !");
		}
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.getRequestDispatcher("/identifier.jsp").forward(request, response);	

	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Client client = DBConnection.FindClientByEmail(request.getParameter("email"));
			if(client !=null)
			{
				if(client.pass.equals((String)request.getParameter("pass")))
				{
					request.setAttribute("client", client);
					request.getRequestDispatcher("/index.jsp").forward(request, response);	

				}
				else
				{
					request.getRequestDispatcher("/identifier.jsp").forward(request, response);	

				}
				
			}
			else
			{
			  response.getWriter().print("no email");
			}
		} catch (SQLException e) {
			log(""+e);
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
