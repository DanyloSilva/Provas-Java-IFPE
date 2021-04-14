package Capitulo06;

/*
 *  14) Implementado
 *  
 *  A) � necessario pois o ao chamar o m�todo que tr�s um numero aleatorio, ele informa de 0 at� 5, contudo
 *  n�o temos o lado 0 em um dado, ent�o � necessario somar +1 para que n�o caia 0.
 *  
 *  B) int face = + randomNumbers.nextInt(12);
 */



import java.security.SecureRandom;

public class RandomIntegers {

	public static void main(String[] args) {
		// o objeto randomNumbers produzir� n�meros aleat�rios seguros�
		SecureRandom randomNumbers = new SecureRandom();

		// faz o loop 20 vezes
		for (int counter = 1; counter <= 20; counter++) {
			// seleciona o inteiro aleat�rio entre 1 e 6
			int face = 1 + randomNumbers.nextInt(6);

			System.out.printf("%d ", face); // exibe o valor gerado

			// se o contador for divis�vel por 5, inicia uma nova linha de sa�da
			if (counter % 5 == 0)
				System.out.println();
		}
	}

}
