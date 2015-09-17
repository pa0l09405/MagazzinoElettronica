package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

	protected final static String dburl = "jdbc:h2:./magazzinoDB";
    protected static Connection connection;
    
    public static Connection getConnectionDB() {
    try{
        if( connection == null){
        	Class.forName("org.h2.Driver");
        	connection = DriverManager.getConnection(dburl, "utente" , "utente");
        }
    	}catch( Exception e){
    		System.out.println("Connessione al database non stabilita. Riprova...");
    	}
    	return connection;
    }

    public static void closeConnection() {

    		if (connection != null) {
    			try {
					connection.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
    			connection = null;
    		}
    	}

}


