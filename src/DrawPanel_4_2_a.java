/*
 * Exercicio 4.2.a: DrawPanel.java
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 .
 */

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel_4_2_a extends JPanel{

	// desenha um X a partir dos cantos do painel
	public void paintComponent( Graphics g ) {
		
		// chamaPaintComponent para garantir que o painel seja exibido corretamente
		super.paintComponent( g );
		
		int width = getWidth(); // largura total
		int height = getHeight(); // altura total

		int i = 0;
		
		while ( i < height ) {
			g.drawLine( 0, 0, width - i , i);
			i += 15;
		}
		
	} // fim do método paintComponente
	
} // fim da classe DrawPanel
