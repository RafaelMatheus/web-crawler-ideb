package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Object getConexao() {
	     Connection connection = null;         
	     try {
	     String driverName = "com.mysql.jdbc.Driver";                        
	     Class.forName(driverName);
	                 String serverName = "localhost";   
	                 String mydatabase = "mysql";        
	                 String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
	                 String username = "root";           
	                 String password = "123456";     
	                 connection = DriverManager.getConnection(url, username, password);
	                 if (connection != null) {
	                     System.out.println("STATUS--->Conectado com sucesso!");
	                 } else {
	                     System.out.println("STATUS--->Não foi possivel realizar conexão");
	                 }
	                 return connection;
	             } catch (ClassNotFoundException e) {  //Driver não encontrado
	                 System.out.println("O driver expecificado nao foi encontrado.");
	                 return null;
	             } catch (SQLException e) {
	                 System.out.println("Nao foi possivel conectar ao Banco de Dados.");
	                 return null;
	      
	             }
	}
}
