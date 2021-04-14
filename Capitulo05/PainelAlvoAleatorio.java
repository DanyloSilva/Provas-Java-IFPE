package Capitulo06;

/*
 * 21) A)B)C)D)E)F) 
 * Experiencia muito legal, tive que ir ajustando o quando o canto superior esquerdo
 * iria ajustar a cada novo circulo, mas após chegar no valor corretor, deu o resultado esperado.
 */

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class PainelAlvoAleatorio extends JPanel{

	
	private Color cor1;
	private Color cor2;
	
	public PainelAlvoAleatorio() {
		
		SecureRandom randomNumbers = new SecureRandom();
		
		
		int x,y,z;
		
		x = 1 + randomNumbers.nextInt(255);
		y = 1 + randomNumbers.nextInt(255);
		z = 1 + randomNumbers.nextInt(255);
		
		cor1 = new Color(x,y,z);
		
		x = 1 + randomNumbers.nextInt(255);
		y = 1 + randomNumbers.nextInt(255);
		z = 1 + randomNumbers.nextInt(255);
		
		cor2= new Color(x,y,z);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int a=250, b= 50, c=25;
		for(int i=0;i<3;i++) {
			
	       g.setColor(cor1);
	       g.fillOval(b, c, a, a);
	       a-=50;
	       b+=25;
	       c+=25;
	       
	       g.setColor(cor2);
	       g.fillOval(b, c, a, a);
	       a-=50;
	       b+=25;
	       c+=25;
		}   
	}
	
	
}
