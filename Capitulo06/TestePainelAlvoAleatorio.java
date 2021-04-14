package Capitulo06;


import javax.swing.JFrame;

public class TestePainelAlvoAleatorio {

	public static void main(String[] args) {
		PainelAlvoAleatorio panel = new PainelAlvoAleatorio();
		JFrame application = new JFrame();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(460, 500);
		application.setVisible(true);
	}
	
}
