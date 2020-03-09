package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	private static String driver="com.mysql.cj.jdbc.Driver";
	private static String port="3309";
    private static String url = "jdbc:mysql://localhost:"+port+"/microprojet";
    private static String username = "root";
    private static String password = "";
    private static Connection connection;
 
	
	static public Connection getDBConnection() throws SQLException {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username, password);

			return connection;
		} catch (Exception ex) {
			throw new SQLException(ex.getMessage());
		}
	}

	public static void closeConnection() throws SQLException {
			connection.close();
	}
	static private PreparedStatement statement ;
	static private ResultSet res;
	static private String insertIntoClientRequest ="INSERT INTO `clients` (`Email`, `Nom`, `Prenom`, `Adresse`, `CodePostal`, `Ville`, `Tel`, `MotPasse`) VALUES (?,?,?,?,?,?,?,?);";
	public static void insertIntoClient(Client client) throws SQLException
	{
		
		statement = connection.prepareStatement(insertIntoClientRequest);
		try {
			statement.setString(1,client.email);
			statement.setString(2,client.nom);
			statement.setString(3,client.prenom);
			statement.setString(4,client.adresse);
			statement.setString(5,client.code);
			statement.setString(6,client.ville);
			statement.setString(7,client.tel);
			statement.setString(8,client.pass);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static boolean isEmailExist(Client client) throws SQLException
	{
		String SelectCountAllEmailsQuery="select * from clients where Email='"+client.email+"';";
		boolean notexist=true;
		Statement st = connection.createStatement();
		res = st.executeQuery(SelectCountAllEmailsQuery);
		int count = 0;
	      while (res.next()) {
	        count++;
	      } 
		if(count==0) notexist=false;
		return notexist;
		
	}
	public static Client FindClientByEmail(String email) throws SQLException
	{
		String Query="select * from clients where Email='"+email+"';";
		Client client = new Client();
		Statement st = connection.createStatement();
		res = st.executeQuery(Query);
		
		
	      while (res.next()) {
	        client.id = res.getString("Id");
	        client.email = res.getString("Email");
	        client.nom = res.getString("Nom");
	        client.prenom = res.getString("Prenom");
	        client.adresse = res.getString("Adresse");
	        client.code = res.getString("CodePostal");
	        client.ville = res.getString("ville");
	        client.tel = res.getString("tel");
	        client.pass = res.getString("MotPasse");
	        return client;
	      } 
		
		return null;
		
	}
	
}

