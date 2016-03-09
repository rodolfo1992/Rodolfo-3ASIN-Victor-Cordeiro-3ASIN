import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

/*Pacote de classes DAO + Classes de Negócio + 
 * ConnectionFactory baseado na aula 02b
 */



@SuppressWarnings("serial")
public class incluirAluno extends JFrame
{
//private AlunoDAO cdao;

private JButton botao,botao1;
private JLabel rotuloValor1, rotuloValor2, rotuloValor3, rotuloValor4, rotuloValor5, rotuloValor6, rotuloValor7, rotuloValor8;
private JTextField textoValor1, textoValor2, textoValor3, textoValor4, textoValor5, textoValor6, textoValor7, textoValor8;


public incluirAluno()
{



JPanel caixa = new JPanel();
caixa.setLayout(new FlowLayout());


// Instanciação de objetos
botao = new JButton("Salvar");
botao1 = new JButton("Cancelar");

rotuloValor1 = new JLabel("Ra");
textoValor1 = new JTextField(20);
rotuloValor2 = new JLabel("Nome");
textoValor2 = new JTextField(20);
rotuloValor3 = new JLabel("Endereço");
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

// Inclusão no container
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
String RA = textoValor1.getText();
RA = RA.trim();
         
         
         if (RA.length() > 0) {
         
         AlunoTO cTO = new AlunoTO();
         
         int ra = Integer.parseInt(textoValor1.getText());
         String NOME = textoValor2.getText();
         String ENDERECO = textoValor3.getText();
         String TELEFONE = textoValor4.getText();
         String EMAIL = textoValor5.getText();
         String RG = textoValor6.getText();
         String CPF = textoValor7.getText();
         String DTNASC = textoValor8.getText();
         cTO.setId(ra);
         cTO.setNome(NOME);
         cTO.setEndereco(ENDERECO);
         cTO.setTelefone(TELEFONE);
         cTO.setEmail(EMAIL);
         cTO.setRG(RG);
         cTO.setCPF(CPF);
         cTO.setdtNasc(DTNASC);
         
         
         cdao.incluir(cTO);
         
         }
         else
         {
            JOptionPane.showMessageDialog(
                     null,
                     "CPF em branco!",
                     "Inclusão de Cliente!",
                     JOptionPane.WARNING_MESSAGE); 
                     
                      
            
         }
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
setTitle("Incluir Aluno");
setSize(250,480);
setVisible(true);
}



public static void main( String args[] )
{
try {  
    UIManager.setLookAndFeel(new com.jtattoo.plaf.hifi.HiFiLookAndFeel());  
} catch (UnsupportedLookAndFeelException ex) {  
    ex.printStackTrace();  
} 

 incluirAluno application = new incluirAluno();
application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
application.setLocationRelativeTo(null);
application.setResizable(false);

}
}
