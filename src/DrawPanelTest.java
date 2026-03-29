/*
 * Figura 4.19: DrawPanelTest.java
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 .
 */

import javax.swing.JFrame;

public class DrawPanelTest {

	public static void main(String[] args) {

		// cria um painel que contém nosso desenho
		DrawPanel panel = new DrawPanel();
		
		// cria um novo quadro/janela para armazenar o painel
		JFrame application = new JFrame();
		
		// configura o frame para ele ser encerrado quando a janela fechar
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );		
		
		application.add( panel ); // adiciona o painel ao frame
		application.setSize( 250, 250); // configura o tamanho do frame
		application.setVisible( true ); // torna o frame visível
		
	} // fim do main

} // fim da classe DrawPanelTest
