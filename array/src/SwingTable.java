import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SwingTable {
    JFrame tela = new JFrame("Swing Table");
    JTable tabela = new JTable();
    
    SwingTable(){
        
        //Criando uma tabela
        //Primeiramente criando um array de strings pro cabeçalho
       
        //Criando a estrutura  
        String[] cabecalho = {
        "Primeiro",
        "Segundo",
        "Terceiro",
        "Quarto",
        };
        Object[][] itens = {{
        "001",
        "002",
        "003",
        "004"}
        };
         
        tabela = new JTable(itens,cabecalho);
        
        //Tela caracterisiticas
        tela.setSize(900, 600);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tela.setVisible(true);
        tela.add(tabela);
    }
    public static void main(String[] args) {
        new SwingTable();
    }
}
