package Capitulo06;

/*
 *  14) Implementado
 *  
 *  A) É necessario pois o ao chamar o método que trás um numero aleatorio, ele informa de 0 até 5, contudo
 *  não temos o lado 0 em um dado, então é necessario somar +1 para que não caia 0.
 *  
 *  B) int face = + randomNumbers.nextInt(12);
 */



import java.security.SecureRandom;

public class RandomIntegers {

	public static void main(String[] args) {
		// o objeto randomNumbers produzirá números aleatórios segurosÿ
		SecureRandom randomNumbers = new SecureRandom();

		// faz o loop 20 vezes
		for (int counter = 1; counter <= 20; counter++) {
			// seleciona o inteiro aleatório entre 1 e 6
			int face = 1 + randomNumbers.nextInt(6);

			System.out.printf("%d ", face); // exibe o valor gerado

			// se o contador for divisível por 5, inicia uma nova linha de saída
			if (counter % 5 == 0)
				System.out.println();
		}
	}

}
