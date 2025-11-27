package base;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexion1 {    
      Connection cone;   
   public Conexion1(){       
       try {  
           cone=DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");           
       }catch (Exception e){
           System.err.println("No se pudo establcer conecion con la base de datos. Error: "+e);
       }
   }
   public Connection getConnection() {
       return cone; 
   }
    
}
