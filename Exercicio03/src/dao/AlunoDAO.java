package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import factory.MysqlConnect;
import to.AlunoTO;



/*Pacote de classes DAO + Classes de Negócio + 
 * ConnectionFactory baseado na aula 02b
 */

public class AlunoDAO extends MysqlConnect {
	
   public PreparedStatement st;
   
	
   public AlunoDAO() {
      super();
     this.st = null;
  
   }
	   
   public void incluir(AlunoTO cTO) {
      
      try {
                  
         String sql     = "insert into Aluno (ra,nome,endereco,dtnasc,email,telefone,rg,cpf) values (?, ?, ?, ?, ?, ?, ?, ?)";
      
         this.st = this.conn.prepareStatement(sql);              
         this.st.setInt    (1, cTO.getId());
         this.st.setString (2, cTO.getNome());
         this.st.setString (3, cTO.getEndereco());
         this.st.setString (4, cTO.getdtNasc());
         this.st.setString (5, cTO.getEmail());
         this.st.setString (6, cTO.getTelefone());
         this.st.setString (7, cTO.getRG());
         this.st.setString (8, cTO.getCPF());               
         this.st.executeUpdate();
         this.st.close();

            
            
                  JOptionPane.showMessageDialog(
                     null,"Aluno Cadastrado !");  
                  
        
      }

   
         catch(Exception e) {
         JOptionPane.showMessageDialog(
                           null,
                          "erro no BD"
                          
                          
                  );
      }
   }
   
   
   public AlunoTO procurar(int id) {
      AlunoTO cTO = null;
      ResultSet    rs  = null;
      try {
         String sql     = "select * from Aluno where ra = ?";
         this.st = this.conn.prepareStatement(sql);
         this.st.setInt(1, id);
         rs      = this.st.executeQuery();
         
         if (rs.next()) {
            cTO = new AlunoTO();
            cTO.setNome     (rs.getString("nome"));
            cTO.setEndereco (rs.getString("endereco"));
            cTO.setTelefone (rs.getString("telefone"));
            cTO.setEmail    (rs.getString("email"));
            cTO.setRG    (rs.getString("rg"));
            cTO.setCPF     (rs.getString("cpf"));
            cTO.setdtNasc  (rs.getString("dtnasc"));
            cTO.setId      (rs.getInt("id"));
         }  
          
         else{
            
            cTO = new AlunoTO();
            cTO.setId(-1);      
            

            
            
            JOptionPane.showMessageDialog(
                    null,
                    "Aluno nao encontrado"
               );
                        
         }
            
         this.st.close();
      }

            
                  catch(Exception e) {
         JOptionPane.showMessageDialog(
                     null, "OK"
            );
      }
      return cTO;
   }
   
   public void alterar(AlunoTO cTO){       
      try {
         String sql     = "update Aluno set nome = ?, endereco = ?, telefone = ?, email = ?, rg = ?, cpf = ?, dtnasc = ? where ra = ?";
         this.st = this.conn.prepareStatement(sql);
         this.st.setString(1, cTO.getNome());
         this.st.setString(2, cTO.getEndereco());
         this.st.setString(3, cTO.getTelefone());
         this.st.setString(4, cTO.getEmail());
         this.st.setString(5, cTO.getRG());
         this.st.setString(6, cTO.getCPF());
         this.st.setString(7, cTO.getdtNasc());
         this.st.setInt   (8, cTO.getId());
         this.st.executeUpdate();
         this.st.close();
         

            
        JOptionPane.showMessageDialog(
                     null,
                    "Aluno alterado"
                    
            );            
      
      }
                 catch(Exception e) {
         JOptionPane.showMessageDialog(
                     null, "erro no bd"
            );
      }
   }
   
   public void excluir(int id) {
      try {
         String sql     = "delete from Aluno where ra = ?";
         this.st = this.conn.prepareStatement(sql);
         this.st.setInt(1, id);
         this.st.executeUpdate();
         this.st.close();
         

            
           JOptionPane.showMessageDialog(
                     null,
                    "Aluno Excluido"
            );   
      }

            
                    catch(Exception e) {
         JOptionPane.showMessageDialog(
                     null, "OK"
            );

      }
   }
   
   



}
