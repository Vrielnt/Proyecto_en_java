package base;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion2 {    
      Connection conc;   
   public Conexion2(){       
       try {  
           conc=DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");           
       }catch (Exception e){
           System.err.println("No se pudo establcer conecion con la base de datos. Error: "+e);
       }
   }
   public Connection getConnection() {
       return conc; 
   }
    
}
