import javax.swing.JFrame;

/*
 * Exercicio 4.1.b: DrawPanelTest.java
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 .
 */

public class DrawPanelTest_4_1_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cria um painel que contém nosso desenho
		DrawPanel_4_1_b panel = new DrawPanel_4_1_b();
		
		// cria um novo quadro/janela para armazenar o painel
		JFrame application = new JFrame();
		
		// configura o frame para ele ser encerrado quando a janela fechar
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		
		application.add( panel ); // adiciona o painel ao frame
		application.setSize( 250, 250); // configura o tamanho do frame
		application.setVisible( true ); // torna o frame visível
		
	} // fim do main

} // fim da classe DrawPanelTest
