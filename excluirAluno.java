import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class excluirAluno extends JFrame
{
//private AlunoDAO cdao;
	
	private JButton botao,botao1,botao2;
	private JLabel rotuloValor1, rotuloValor2, rotuloValor3, rotuloValor4, rotuloValor5, rotuloValor6, rotuloValor7, rotuloValor8;
	private JTextField textoValor1, textoValor2, textoValor3, textoValor4, textoValor5, textoValor6, textoValor7, textoValor8;


public excluirAluno()
{



JPanel caixa = new JPanel();
caixa.setLayout(new FlowLayout());


// Instancia��o de objetos



botao = new JButton("Salvar");
botao1 = new JButton("Cancelar");

rotuloValor1 = new JLabel("Ra");
textoValor1 = new JTextField(20);
rotuloValor2 = new JLabel("Nome");
textoValor2 = new JTextField(20);
rotuloValor3 = new JLabel("Endere�o");
textoValor3 = new JTextField(20);
rotuloValor4 = new JLabel("Telefone");
textoValor4 = new JTextField(20);
rotuloValor5 = new JLabel("E-mail");
textoValor5 = new JTextField(20);
rotuloValor6 = new JLabel("RG");
textoValor6 = new JTextField(20);
rotuloValor7 = new JLabel("CPF");
textoValor7 = new JTextField(20);
rotuloValor8 = new JLabel("Data Nascimento");
textoValor8 = new JTextField(20);

// Inclus�o no container
caixa.add(rotuloValor1);
caixa.add(textoValor1);
caixa.add(rotuloValor2);
caixa.add(textoValor2);
caixa.add(rotuloValor3);
caixa.add(textoValor3);
caixa.add(rotuloValor4);
caixa.add(textoValor4);
caixa.add(rotuloValor5);
caixa.add(textoValor5);
caixa.add(rotuloValor6);
caixa.add(textoValor6);
caixa.add(rotuloValor7);
caixa.add(textoValor7);
caixa.add(rotuloValor8);
caixa.add(textoValor8);



caixa.add(botao);
caixa.add(botao1);
caixa.add(botao2);



add(caixa, BorderLayout.CENTER);
add(caixa, BorderLayout.CENTER);

botao.addActionListener( 

 new ActionListener()

 { 


 public void actionPerformed( ActionEvent evento ) 

 { 

if(evento.getSource() == botao)
{

AlunoDAO cdao = new AlunoDAO();  
String CodMatricula = textoValor1.getText();
CodMatricula = CodMatricula.trim();
         //CodMatricula = CodMatricula.trim();
         
         if (CodMatricula.length() > 0) {
         
         AlunoTO cTO = new AlunoTO();
         cTO = cdao.procurar(Integer.parseInt(textoValor1.getText()));
         
          if (cTO.getId() != -1) {
               
               textoValor2.setText(cTO.getNome());
               textoValor7.setText(cTO.getCPF());         
               textoValor6.setText(cTO.getRG());         
               textoValor3.setText(cTO.getEndereco());
               textoValor5.setText(cTO.getEmail());
               textoValor8.setText(cTO.getdtNasc());
               textoValor4.setText(cTO.getTelefone());                                             
               
               
                 
               textoValor2.setEditable(false); 
               textoValor3.setEditable(false);  
               textoValor4.setEditable(false);            
               textoValor5.setEditable(false);      
               textoValor6.setEditable(false);  
               textoValor7.setEditable(false);  
               textoValor8.setEditable(false);  
               
               botao2.setEnabled(true);  
               botao.setEnabled(false);
               
                    
                    
         }
         }
         else
         {
            JOptionPane.showMessageDialog(
                     null,
                     "C�digo da matr�cula em branco!",
                     "Inclus�o de Matricula!",
                     JOptionPane.WARNING_MESSAGE); 
                     
                      
            
         }
      }

      }

});



botao2.addActionListener( 

 new ActionListener()

 { 


 public void actionPerformed( ActionEvent evento ) 

 { 

if(evento.getSource() == botao2)
{

AlunoDAO cdao = new AlunoDAO();  
cdao.excluir(Integer.parseInt(textoValor1.getText()));

               textoValor1.setEditable(true);
               textoValor2.setEditable(false); 
               textoValor3.setEditable(false);  
               textoValor4.setEditable(false);            
               textoValor5.setEditable(false);      
               textoValor6.setEditable(false);  
               textoValor7.setEditable(false);  
               textoValor8.setEditable(false);  
               
               botao2.setEnabled(false);  
               botao.setEnabled(true);
               
               textoValor1.setText("");
               textoValor2.setText("");
               textoValor3.setText("");
               textoValor4.setText("");
               textoValor5.setText("");
               textoValor6.setText("");
               textoValor7.setText("");
               textoValor8.setText("");
               
               
               
               

         }
         }


      

});






botao1.addActionListener( 

 new ActionListener()

 { 


 public void actionPerformed( ActionEvent evento ) 

 { 

if(evento.getSource() == botao1)
{
dispose();
}
}

     

});


// Registro no listener dos objetos controlados
//botao.addActionListener(this);
// Ajustes finais do frame
setTitle("Pesquisa Aluno");
setSize(235,489);
setVisible(true);
}



public static void main( String args[] )
{
try {  
    UIManager.setLookAndFeel(new com.jtattoo.plaf.hifi.HiFiLookAndFeel());  
} catch (UnsupportedLookAndFeelException ex) {  
    ex.printStackTrace();  
} 
   
excluirAluno application = new excluirAluno();
application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
application.setLocationRelativeTo(null);
application.setResizable(false);

}
}



