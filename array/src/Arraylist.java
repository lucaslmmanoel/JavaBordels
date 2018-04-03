
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Arraylist implements ActionListener{
    //Criando os tipos de elementos para serem insertados na tela
    
    JFrame tela;
    JLabel label;
    JTextField texto;
    JButton botao;
    JTextArea area;
    public Arraylist(){
     // Definindo os elementos que usaremos na tela
     
        tela = new JFrame("Usando o arrayList");
        tela.setLayout(new FlowLayout());
        label = new JLabel("Nome");
        texto = new JTextField(20);
        botao = new JButton("ADD");
        area = new JTextArea(0,20);
     
        //insertando os objetos na tela
        
        tela.add(label);
        tela.add(texto);
        tela.add(botao);
        tela.add(area);
        tela.pack();
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        botao.addActionListener(this);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        //criando os elementos para receber os elementos
        String elemento="";
        String elementos="";
        
        elemento = area.getText();
        elemento = elemento + texto.getText();
        area.setText(elemento);
        
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add(texto.getText());
        
        for(String nome: nomes){
        elementos +=nome;
        }
        area.setText(elemento);
    }
    public static void main(String[] args) {
        new Arraylist();
    }

   
}
