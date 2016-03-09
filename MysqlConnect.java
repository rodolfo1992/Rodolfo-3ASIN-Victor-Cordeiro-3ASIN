import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*Pacote de classes DAO + Classes de Negócio + 
 * ConnectionFactory baseado na aula 02b
 */

public class MysqlConnect {
	
	public Connection conn;
	
	   public MysqlConnect() {
	        conn            = null;
		    String url      = "jdbc:mysql://localhost:3306/";       
            String dbName  = "mydb";                 
	        String driver   = "com.mysql.jdbc.Driver";   
	        String userName = "root";                    
	        String password = "root";                    
	        try {
	            Class.forName(driver);
	            conn = DriverManager.getConnection(url + dbName, userName, password);
	        }
	        catch (Exception e) {
	            JOptionPane.showMessageDialog(
	                     null,
	                    "Erro no Banco de Dados!\n\nContate seu Administrador do Sistema!",
	                    "Erro...",
	                    JOptionPane.WARNING_MESSAGE
	            );
	        }
	    }
	    
	    public void closeConnection() {
	        try                { conn.close(); }
	        catch(Exception e) { e.printStackTrace(); }
	    } 
}
