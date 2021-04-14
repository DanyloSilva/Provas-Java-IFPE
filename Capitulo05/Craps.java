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
 *  17) Utilizar constantes de palavras, ao contrario de numeros, torna o código mais facil de ser 
 *  compreendido.
 */

import java.security.SecureRandom;

public class Craps {

	private static final SecureRandom randomNumbers = new SecureRandom();

	// tipo enum com constantes que representam o estado do jogoÿ
	private enum Status {
		CONTINUE, WON, LOST
	};

	// constantes que representam lançamentos comuns dos dados
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	// joga uma partida de craps
	public static void main(String[] args) {
		int myPoint = 0; // pontos se não ganhar ou perder na 1ª rolagem
		Status gameStatus; // pode conter CONTINUE, WON ou LOSTÿ

		int sumOfDice = rollDice(); // primeira rolagem dos dadosÿ

		// determina o estado do jogo e a pontuação com base no primeiro lançamento
		switch (sumOfDice) {
		case SEVEN: // ganha com 7 no primeiro lançamento ÿ
		case YO_LEVEN: // ganha com 11 no primeiro lançamentoÿ
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES: // perde com 2 no primeiro lançamentoÿ
		case TREY: // perde com 3 no primeiro lançamento ÿ
		case BOX_CARS: // perde com 12 no primeiro lançamento ÿ
			gameStatus = Status.LOST;
			break;
		default: // não ganhou nem perdeu, portanto registra a pontuaçãoÿ
			gameStatus = Status.CONTINUE; // jogo não terminouÿ
			myPoint = sumOfDice; // informa a pontuação ÿ
			System.out.printf("Pontos é %d%n", myPoint);
			break;
		}

		// enquanto o jogo não estiver completo
		while (gameStatus == Status.CONTINUE) // nem WON nem LOST
		{
			sumOfDice = rollDice(); // lança os dados novamenteÿ

			// determina o estado do jogo
			if (sumOfDice == myPoint) // vitória por pontuação
				gameStatus = Status.WON;
			else if (sumOfDice == SEVEN) // perde obtendo 7 antes de atingir a pontuação
				gameStatus = Status.LOST;
		}

		// exibe uma mensagem ganhou ou perdeu
		if (gameStatus == Status.WON)
			System.out.println("Jogador ganhou");
		else
			System.out.println("Jogador perdeu");
	}

	// lança os dados, calcula a soma e exibe os resultados
	public static int rollDice() {
		// seleciona valores aleatórios do dado
		int die1 = lancaDado();
		int die2 = lancaDado();

		int sum = die1 + die2; // soma dos valores dos dados

		// exibe os resultados desse lançamento
		System.out.printf("Jogador rolou %d + %d = %d%n", die1, die2, sum);

		return sum;
	}

	private static int lancaDado() {
		
		int dado = 1 + randomNumbers.nextInt(6);
		
		return dado;
	}
	
}

