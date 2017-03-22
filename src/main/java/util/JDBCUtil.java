package util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
public class JDBCUtil {
  
 
 public static Connection getConnection() {
	 Connection con = null;
	 try{
      Class.forName("oracle.jdbc.driver.OracleDriver");
     con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr", "hr");     
     }catch(Exception e){
      e.printStackTrace();
     }
     return con ;
   
 }
  

 public static void close(PreparedStatement stmt, Connection conn) {
  try{       
      if(stmt!=null) stmt.close();
      if(conn!=null)conn.close();
     }catch(Exception e){
      e.printStackTrace();
     }
 }

 public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
  try{
      if(rs!=null) rs.close();
      if(stmt!=null) stmt.close();
      if(conn!=null)conn.close();
     }catch(Exception e){
      e.printStackTrace();
     }
 }
 
  
}

 

       
  
 

      
