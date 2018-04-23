
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class telaSwing {

    //Criando os elementos que irão compor a tela
    JFrame tela;
    JPanel fundo;
    JPanel navbar;
    JPanel menu;
    JButton add;
    JTable comanda;
    JLabel comidas,bebidas,sobremesas;

    telaSwing() {
        //Criando os elementos da tela

        tela = new JFrame();
        fundo = new JPanel();
        navbar = new JPanel();
        menu = new JPanel();
        //Criando um fundo
        fundo.setBackground(new Color(255, 200, 90));
        fundo.setLayout(new BorderLayout());

        //Criando uma navbar
        
        navbar.setLayout(new BorderLayout());
        navbar.setBackground(new Color(55, 35, 35));
        navbar.add(new JLabel("JAVAHUNGRY"));
        navbar.add(new JButton("ADD"), BorderLayout.EAST);
        //Criando um menu
        menu.setLayout(new FlowLayout());
        
        menu.setBackground(new Color(55, 35, 35));
        
        
        comidas = new JLabel("Comidas");
        comidas.setForeground(Color.white);

        bebidas = new JLabel("Bebidas");
        bebidas.setForeground(Color.white);

        sobremesas = new JLabel("Aperitivos");
        sobremesas.setForeground(Color.white);
        
        menu.add(comidas);
        menu.add(bebidas);
        menu.add(sobremesas);
        
        //Inserindo os elementos no fundo
        
        fundo.add(navbar, BorderLayout.NORTH);
        fundo.add(menu, BorderLayout.WEST);

        //Caracteristicas da tela
        tela.setSize(900, 600);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        tela.setVisible(true);
        tela.add(fundo);
    }

    public static void main(String[] args) {
        new telaSwing();
    }

}
