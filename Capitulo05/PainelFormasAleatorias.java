package Capitulo06;

/*
 * 22) A)B)C)D)E) Gostei do resultado, a experiência da questão anterior ajudou bastante para fazer essa.
 * Resultado ficou bem semelhante.
 * 
 */
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class PainelFormasAleatorias extends JPanel{

	public Color sortear() {
		
        SecureRandom randomNumbers = new SecureRandom();
		
		
		int x,y,z;
		
		x = 1 + randomNumbers.nextInt(255);
		y = 1 + randomNumbers.nextInt(255);
		z = 1 + randomNumbers.nextInt(255);
		
		Color cor = new Color(x,y,z);
		
		return cor;
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	
		 SecureRandom randomNumbers = new SecureRandom();
		 Color cor;
		 
		 int esquerdo1, esquerdo2, altura, largura;
		 
		for(int i= 0; i<10; i++) {
			
			int forma = 1 + randomNumbers.nextInt(2);
			
			altura = randomNumbers.nextInt(230);
			largura = randomNumbers.nextInt(230);
			
			esquerdo1 = altura/2;
			esquerdo2= altura/2;
			
			if(forma == 1) {
				cor = sortear();
				g.setColor(cor);
				g.fillOval(esquerdo1, esquerdo2, largura, altura);
				
			}else{
				cor = sortear();
				g.setColor(cor);
				g.fillRect(esquerdo1, esquerdo2, largura, altura);
				
			}
			
			
		}
		
	}
	
}
