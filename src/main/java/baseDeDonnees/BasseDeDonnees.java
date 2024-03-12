package baseDeDonnees;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class  BasseDeDonnees {
	private static Statement statement = null;
	public BasseDeDonnees() {
		
	}

	private static Connection connection() {
		String 			url			= "jdbc:mysql://localhost:3306/Restaurant", password = "Badjo12Mysql",
						username 	= "root";
		Connection  connection = null;
		try {
			 		Class.forName("com.myslq.jdbc.Driver");
			 		connection = DriverManager.getConnection(url,username,password);
		}catch(Exception e) {
			connection = null;
		}
		return connection;
	}
	
	public static boolean ajouter(String nomTable,String value1,float value2,String value3,Date value4) {
		
		boolean		 resultat	 = true;
		String 		requete= null;
		Connection 	connection	 = BasseDeDonnees.connection();
		if(nomTable.equals("Commande"))
					 	requete		 = "INSERT INTO " + nomTable + "('nom','prix','localisation','dateAchat')" + " VALUES("+ value1 + "," + value2  + "," + value3 +","+value4 + ")";
		if(nomTable.equals("Produit"))
		 				requete		 = "INSERT INTO " + nomTable + "('nom_produit','image_','prix_produit')" + " VALUES("+ value1 + "," + value2 + "," + value3 +")";
		
			try {
				statement 		= connection.createStatement();
								  statement.executeQuery(requete);
				
			} catch (SQLException e) {
					resultat	= false;
			}
		return resultat;
	}
	
	public static boolean supprimer(String nomTable,String nom, Date date) {
		boolean		 resultat	 = true;
		Connection 	connection	 = BasseDeDonnees.connection();
		String 		requete		 = "DELETE FROM " + nomTable + "WHERE nom =" + nom + "AND date="+ date;
		
					try {
						statement	 = connection.createStatement();
									   statement.executeUpdate(requete);
					} catch (SQLException e) {
										resultat = false;
					}
		
		return 		resultat;
	}
	
	public static ResultSet rechercher(String nomTable,String nom) {
		
		ResultSet	 tableau	 = null;
		Connection 	connection	 = BasseDeDonnees.connection();
		String 		requete		 = "SELECT * FROM " + nomTable + "WHERE nom = " + nom;
		
					try {
						statement	 = connection.createStatement();
						tableau	 	 = statement.executeQuery(requete);
					} catch (SQLException e) {
						
					}
					return 		tableau;
	}
	
	public static boolean modifier( String Nvalue, String Evalue) {
		boolean		 resultat	 = true;
		Connection 	connection	 = BasseDeDonnees.connection();
		String 		requete		 = "UPDATE Commande SET";
		
					try {
						statement    = connection.createStatement();
						
						requete  	 = requete + "nom="+Nvalue + "WHERE nom =" + Evalue;
						resultat	 =statement.execute(requete);
						
					} catch (SQLException e) {
						resultat = false;
					}
		
		
		return 		resultat;
	}
	public static ResultSet afficher(String nomTable) {
		
		ResultSet result = null;
		Connection 	connection	 = BasseDeDonnees.connection();
		String 			requete	 = "select * from " + nomTable;
					try {
						statement    = connection.createStatement();
						result		 = statement.executeQuery(requete);
					} catch (SQLException e) {
						e.printStackTrace();
					} 	
		return 		result;
	}
}
