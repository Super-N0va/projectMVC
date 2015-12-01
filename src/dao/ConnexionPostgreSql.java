package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionPostgreSql {
	public static Connection getInstance(){
		Connection connect = null;
		String url = "jdbc:postgresql://172.16.99.2:5432/sgilbert";
		String user = "s.gilbert";
		String passwd = "trgb3zbj";
		
		if(connect == null){
			try {
				connect=DriverManager.getConnection(url,user,passwd);
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		return connect;
	}
}

