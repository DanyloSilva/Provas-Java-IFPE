package Capitulo06;

import javax.swing.JFrame;

public class TestePainelFormasAleatorias {

	public static void main(String[] args) {
		PainelFormasAleatorias panel = new PainelFormasAleatorias();
		JFrame application = new JFrame();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(460, 500);
		application.setVisible(true);
	}
	
}
