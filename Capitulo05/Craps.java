package Capitulo06;

/*
 *  16) implementado
 *  
 *  A) Modificado
 *  
 *  B) Substituido
 *  
 *  C) Para declarar um conjunto de constantes (static final)
 *  
 *  
 *  17) Utilizar constantes de palavras, ao contrario de numeros, torna o c�digo mais facil de ser 
 *  compreendido.
 */

import java.security.SecureRandom;

public class Craps {

	private static final SecureRandom randomNumbers = new SecureRandom();

	// tipo enum com constantes que representam o estado do jogo�
	private enum Status {
		CONTINUE, WON, LOST
	};

	// constantes que representam lan�amentos comuns dos dados
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	// joga uma partida de craps
	public static void main(String[] args) {
		int myPoint = 0; // pontos se n�o ganhar ou perder na 1� rolagem
		Status gameStatus; // pode conter CONTINUE, WON ou LOST�

		int sumOfDice = rollDice(); // primeira rolagem dos dados�

		// determina o estado do jogo e a pontua��o com base no primeiro lan�amento
		switch (sumOfDice) {
		case SEVEN: // ganha com 7 no primeiro lan�amento �
		case YO_LEVEN: // ganha com 11 no primeiro lan�amento�
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES: // perde com 2 no primeiro lan�amento�
		case TREY: // perde com 3 no primeiro lan�amento �
		case BOX_CARS: // perde com 12 no primeiro lan�amento �
			gameStatus = Status.LOST;
			break;
		default: // n�o ganhou nem perdeu, portanto registra a pontua��o�
			gameStatus = Status.CONTINUE; // jogo n�o terminou�
			myPoint = sumOfDice; // informa a pontua��o �
			System.out.printf("Pontos � %d%n", myPoint);
			break;
		}

		// enquanto o jogo n�o estiver completo
		while (gameStatus == Status.CONTINUE) // nem WON nem LOST
		{
			sumOfDice = rollDice(); // lan�a os dados novamente�

			// determina o estado do jogo
			if (sumOfDice == myPoint) // vit�ria por pontua��o
				gameStatus = Status.WON;
			else if (sumOfDice == SEVEN) // perde obtendo 7 antes de atingir a pontua��o
				gameStatus = Status.LOST;
		}

		// exibe uma mensagem ganhou ou perdeu
		if (gameStatus == Status.WON)
			System.out.println("Jogador ganhou");
		else
			System.out.println("Jogador perdeu");
	}

	// lan�a os dados, calcula a soma e exibe os resultados
	public static int rollDice() {
		// seleciona valores aleat�rios do dado
		int die1 = lancaDado();
		int die2 = lancaDado();

		int sum = die1 + die2; // soma dos valores dos dados

		// exibe os resultados desse lan�amento
		System.out.printf("Jogador rolou %d + %d = %d%n", die1, die2, sum);

		return sum;
	}

	private static int lancaDado() {
		
		int dado = 1 + randomNumbers.nextInt(6);
		
		return dado;
	}
	
}

