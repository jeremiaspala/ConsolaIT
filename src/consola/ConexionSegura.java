package consola;

/*
 * Conexion.java
 *
 * Created on 10 de noviembre de 2007, 02:00 am
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author ISC David Garduño Gómez
 */

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
public class ConexionSegura {
    public String host,puerto,base,usuario,pass;
    public Connection Conec;
    public Statement St;
    public ResultSet reg;
    public PreparedStatement ps;
    /** Creando la instania de conexion */
    public ConexionSegura() {
        ClaseDESBase64 cs = new ClaseDESBase64("lafabriGordisima@@");
            try{
                Properties p = new Properties();
                p.load(new FileInputStream("config.ini"));
                this.base=cs.desencriptar(p.getProperty("db"));
                this.host=cs.desencriptar(p.getProperty("server"));
                this.usuario=cs.desencriptar(p.getProperty("user"));
                this.pass =cs.desencriptar(p.getProperty("pass"));
            }catch(Exception e) {
             System.out.println("error al leer el archivo .ini:"+ e.getMessage());
            }
                         try
			  {
			      Class.forName("org.gjt.mm.mysql.Driver");
			      String url =  "jdbc:mysql://"+host+":3306/"+base+
                                            "?verifyServerCertificate=false"+
                                            "&useSSL=true&useServerPrepStmts=true";
                              Conec = DriverManager.getConnection( url, usuario, pass );

			   }

			   catch(Exception ex)
			   {
				   System.out.println("Error: " + ex.getMessage());
			   }

			  }

		//Setear el PreparedStatement cargando la consulta sql. Luego cargar los paramétros en la variable.
		  public String setPs(String sql)
		  {
		   String error="";
		   try
		   {
		      this.ps = Conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		   }

		   catch(Exception ex)
		   {
		     error = ex.getMessage();
                     System.out.println("Error: " + ex.getMessage());
		   }

		  return(error);
		  }



		//Metodo para las consultas a la base de datos
		public ResultSet consulta(String sql)
		  {
		    String error="";
                    try
                       {
                          reg = ps.executeQuery();
                       }

                   catch(Exception ex)
                       {
                         error = ex.getMessage();
                         System.out.println("Error: " + ex.getMessage());
                       }
		    return(reg);
		  }
                //Cerrar la conexión
                public void cerrar(){
                    String error="";
                    try{
                      this.ps.clearParameters();
                      Conec.close();  
                    }catch(Exception ex)
                       {
                         error = ex.getMessage();
                         System.out.println("Error: " + ex.getMessage());
                       }
                    
                }

    }


