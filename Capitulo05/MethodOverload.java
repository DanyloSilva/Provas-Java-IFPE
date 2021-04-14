package Capitulo06;

/*
 * 19) Criado
 * 
 * A) Executa codigos diferentes, pois um chama um m�todo que recebe int, e o outro
 * chama um m�todo que recebe double
 * 
 * B) Utilizado para criar m�todos com o mesmo nome, que realizam a mesma tarefa ou tarefas semelhantes,
 * mas sobre tipos diferentes ou numeros diferentes de argumentos.
 * 
 * C) Ambos executam a mesma tarefa, ou semelhante, no fim � esperado que retornem um dado de um jeito semelhante
 * em ambos m�todos.
 * 
 * D) Sim, pois podem possuir tipo de argumentos diferentes, e cada tipo pode ter uma maneira de lidar.
 * 
 * E) O tipo de retorno diferente n�o influencia a deixar de ser um m�todo sobrecarregado,
 * mas influencia em qual m�todo ser� chamado.
 * 
 * F) Declarar m�todos com a mesma quantidade e tipos de par�metros gera um erro, independente
 * que o tipo do retorno seja diferente.
 */

public class MethodOverload {

	// teste de m�todos square sobrecarregados
	public static void main(String[] args) {
		System.out.printf("Square of integer 7 is %d%n", square(7));
		System.out.printf("Square of double 7.5 is %f%n", square(7.5));
	}

	// m�todo square com argumento de int
	public static int square(int intValue) {
		System.out.printf("%nCalled square with int argument: %d%n", intValue);
		return intValue * intValue;
	}

	// m�todo square com argumento double
	public static double square(double doubleValue) {
		System.out.printf("%nCalled square with double argument: %f%n", doubleValue);
		return doubleValue * doubleValue;
	}

}
