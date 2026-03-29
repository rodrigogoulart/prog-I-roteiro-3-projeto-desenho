/*
 * Exemplo 4.18: DrawPanel.java
 * Implementa o enunciado do exercício de DEITEL, Paul J.; Deitel, 
 * Harvey M. Java: como programar - 8ª edição. Pearson 1178 
 * ISBN 9788576055631 .
 */

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{

	// desenha um X a partir dos cantos do painel
	public void paintComponent( Graphics g ) {
		
		// chamaPaintComponent para garantir que o painel seja exibido corretamente
		super.paintComponent( g );
		
		int width = getWidth(); // largura total
		int height = getHeight(); // altura total
		
		// desenha uma linha a partir do canto superior esquerdo até o canto inferior direito
		g.drawLine( 0, 0, width, height); 
		
		// desenha uma linha a partir do canto inferiro esquerdo até o canto superior direito
		g.drawLine(0, height, width, 0);
		
	} // fim do método paintComponente
	
} // fim da classe DrawPanel
