package Capitulo06;

/*
 * 1) Modulos � a divis�o do programa em m�todos e classes.
 * 
 * Dividir para conquistar � construir o programa em partes menores, e depois juntar essas partes.
 * 
 * Muitas fun��es j� vem prontas na java API, realizar a reutiliza��o desses codigos fazem o programador
 * ganhar tempo e mais eficiencia no trabalho.
 * 
 * Acredito que reutiliza��o � diferente de repeti��o. Ao reotilizar um m�todo, voc� n�o o escreve novamente
 * voc� reutiliza a fun��o daquele m�todo. Ao contrario de repeti��o, onde ai sim, o c�digo seria escrito novamente.
 * 
 * 2) Utilizando nomes nos m�todos de facil compreen��o, e fazendo com que o m�todo tenha uma fun��o bem definida.
 *Caso um m�todo fa�a diversas tarefas, � necessario criar m�todos menores e com nomes bem definidos.
 *
 * 3) Funciona com um chamador realizando uma chamada a um m�todo, e esse m�todo para realizar o retorno esperado, ele chama
 * outros m�todos. Assim dividindo sua fun��o em pequenas partes, para entregar o resultado esperado.
 * 
 * 4) Nomedaclasse.nomedometodoestatico(argumentos);
 *
 * 5) abs: Informa o valor absoluto de X
 * cos: Calcula o cosseno de x
 * max: Calcula o maior valor entre duas variaveis.
 *
 * 6) Variaveis estaticas, os objetos compartilham apenas uma copia dessa variavel, ou seja, ao alterar o valor dessa variavel
 * em um objeto, todos os outros, teram o valor alterado.
 * 
 * Variaveis de instancia, s�o as variaveis fora dos m�todos que guardam atributos de uma classe que ser� passada para um objeto.
 * 
 * variaveis locais, est�o dentro de m�todos, e s�o usadas apenas dentro deles.
 * 
 * 
 * 7) A) Funciona
 * 
 * B) Criado.
 *
 * 8) Ao confundir o operador + de soma, com o + de concatenar string, pode gerar resultados inesperados
 * o recomendando � isolador com parentes as express�es para que n�o ocorra esse erro.
 * 
 * 9) Usando o proprio nome do m�todo para chamalo dentro da mesma classe.
 *  Usar uma variavel que contem referencia a um objeto, acrescentar um ponto(.) e o nome do m�todo n�o estatico.
 * Utilizar o nomedaclasse.Metodoestatico(argumentos);
 * 
 * A) Na primeira forma, � possivel se uma classe � filha, ent�o chama super.NomeDoMetodoPai
 * na segunda, � possivel atrav�s do tipo de dado que ser� referenciado o objeto.
 * 
 * B) this referencia a um m�todo ou variavel dentro da classe que voc� estar trabalhando.
 * 
 * 
 * 10) O m�todo n�o retornar resultado, fechando o fluxo do m�todo.
 * Retorna um resultado
 * Avalia uma express�o e retorna o resultado.
 * 
 * 11) A pilha de chamadas serve para armazenas referencias dos m�todos, enquanto vai entrando em um m�todo dentro do outro,
 * Para que ap�s a execu��o possa retornar para o inicio.
 * 
 * A) Serve para organizar uma chamada de m�todos.
 * 
 * B) Os quadros de pilha armazenam os par�metros de cada m�todo chamado, e esperam um dado do tipo indicado.
 * 
   C) As variaveis de instancia de um objeto n�o est�o no quadro de pilha, pois esses quadros s�o chamadas de m�todos com suas variaveis locais,
 * existiram apenas, caso um objeto seja declarado dentro de um m�todo que estar dentro dessa pilha, e esse objeto deixara de existir quando essa
 * pilha eliminar o m�todo que o mesmo � declarado
 * 
 * D) Varaveis locais tamb�m s� existem enquanto a pilha armazena a referencia a o m�todo que essas variaveis est�o.
 * 
 * E) Variaveis estaticas caso declaradas em um m�todo dentro da pilha, funciona da mesma maneira que as variaveis locais.
 * 
 * 
 * 12) Promo��o s�o regras para converter um valor do argumento, no tipo em que o m�todo chamado espera receber.
 * 
 * 
 * A) long, float ou double
 * 
 * B) N�o
 * 
 * 
 * 13) A) Force classes fundamentais para o design da lingaugem.Como a classe object, math, etc.
 * 
 * B) Classes que permitem os programas gerar entra e saida de dados.
 * 
 * C) Classes que fornencem suporte para interfaces graficas portaveis.
 * 
 * D) Permitem armazenar e processar grandes quantidade de dados.
 * 
 * E) Para trabalhar com banco de dados
 * 
 * 
 */

import java.util.Scanner;

public class MaximumFinder {

	public static void main(String[] args) {
		// cria Scanner para entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		// solicita e insere tr�s valores de ponto flutuante
		System.out.print("Insira 3 valores de ponto flutuante, separados por espa�o: ");
		double number1 = input.nextDouble(); // l� o primeiro double
		double number2 = input.nextDouble(); // l� o segundo double
		double number3 = input.nextDouble(); // l� o terceiro double

		// determina o valor m�ximo
		double result = maximum_versao2(number1, number2, number3);

		// exibe o valor m�ximo
		System.out.println("O maior �: " + result);
	}

	// retorna o m�ximo dos seus tr�s par�metros de double �
	public static double maximum(double x, double y, double z) {
		double maximumValue = x; // sup�e que x � o maior valor inicial�

		// determina se y � maior que maximumValue ��
		if (y > maximumValue)
			maximumValue = y;

		// determina se z � maior que maximumValue � �
		if (z > maximumValue)
			maximumValue = z;

		return maximumValue;
	}

	public static double maximum_versao2(double x, double y, double z) {
		double result=0;
		
		result = Math.max(x, y);
		result = Math.max(result, z);
		
		return result;
	}
	
}
