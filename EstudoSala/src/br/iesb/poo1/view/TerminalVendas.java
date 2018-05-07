package br.iesb.poo1.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TerminalVendas {
    //Iniciando as variaveis da tela
    JFrame jframeterminal;
    JPanel paneilCardapio;
    JPanel paneilLancador;
    JPanel paneilBoleta;
    JPanel paneilRodape;
    JLabel labelInput;
    JTextField jtextInput;
    JTextArea jtextaeraBoleta;
    JScrollPane barraRolagem;
    JTable tabela;
    //Criando oas dados que serão insertados
    
    Object [][] dados = {
        
        {"070", "Cerveja", "8,00"},
        {"010", "Cocha de Frango", "2,00"},
        {"012", "Coca-Cola", "4,00"}
                        };
    //Variaveis
    String [] colunas = {"Codigo", "Nome", "Preco"}; 
    
    public TerminalVendas(){
        //Criando uma tabela e uma barra de rolagem
        tabela = new JTable(dados, colunas);
        barraRolagem = new JScrollPane(tabela);
        
        jframeterminal = new JFrame("Terminal de Vendas");
        jframeterminal.setLayout(new BorderLayout());
        
        paneilBoleta = new JPanel();
        paneilBoleta.setBackground(Color.red);
        
        paneilLancador = new JPanel();
        paneilLancador.setBackground(Color.yellow);
                
        paneilCardapio = new JPanel();
        paneilCardapio.setBackground(Color.blue);
        paneilCardapio.add(barraRolagem);
        
        labelInput = new JLabel("Código & QTD");
        jtextInput = new JTextField(40);

        paneilLancador.add(labelInput);
        paneilLancador.add(jtextInput);
        
        paneilRodape = new JPanel();
        paneilRodape.setBackground(Color.green);
        
        jtextaeraBoleta = new JTextArea(10, 60);
        paneilBoleta.add(jtextaeraBoleta);
                        
        jframeterminal.add(BorderLayout.NORTH, paneilLancador);
        jframeterminal.add(BorderLayout.WEST, paneilCardapio);
        jframeterminal.add(BorderLayout.CENTER, paneilBoleta);
        jframeterminal.add(BorderLayout.SOUTH, paneilRodape);
        
        
        jframeterminal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframeterminal.setVisible(true);
        jframeterminal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        
        
    }
    
    public static void main(String args[]){
        new TerminalVendas();
    }
    
    
    
}
