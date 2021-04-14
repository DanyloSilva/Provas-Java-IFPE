package Capitulo06;

/*
 * 1) Modulos é a divisão do programa em métodos e classes.
 * 
 * Dividir para conquistar é construir o programa em partes menores, e depois juntar essas partes.
 * 
 * Muitas funções já vem prontas na java API, realizar a reutilização desses codigos fazem o programador
 * ganhar tempo e mais eficiencia no trabalho.
 * 
 * Acredito que reutilização é diferente de repetição. Ao reotilizar um método, você não o escreve novamente
 * você reutiliza a função daquele método. Ao contrario de repetição, onde ai sim, o código seria escrito novamente.
 * 
 * 2) Utilizando nomes nos métodos de facil compreenção, e fazendo com que o método tenha uma função bem definida.
 *Caso um método faça diversas tarefas, é necessario criar métodos menores e com nomes bem definidos.
 *
 * 3) Funciona com um chamador realizando uma chamada a um método, e esse método para realizar o retorno esperado, ele chama
 * outros métodos. Assim dividindo sua função em pequenas partes, para entregar o resultado esperado.
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
 * Variaveis de instancia, são as variaveis fora dos métodos que guardam atributos de uma classe que será passada para um objeto.
 * 
 * variaveis locais, estão dentro de métodos, e são usadas apenas dentro deles.
 * 
 * 
 * 7) A) Funciona
 * 
 * B) Criado.
 *
 * 8) Ao confundir o operador + de soma, com o + de concatenar string, pode gerar resultados inesperados
 * o recomendando é isolador com parentes as expressões para que não ocorra esse erro.
 * 
 * 9) Usando o proprio nome do método para chamalo dentro da mesma classe.
 *  Usar uma variavel que contem referencia a um objeto, acrescentar um ponto(.) e o nome do método não estatico.
 * Utilizar o nomedaclasse.Metodoestatico(argumentos);
 * 
 * A) Na primeira forma, é possivel se uma classe é filha, então chama super.NomeDoMetodoPai
 * na segunda, é possivel através do tipo de dado que será referenciado o objeto.
 * 
 * B) this referencia a um método ou variavel dentro da classe que você estar trabalhando.
 * 
 * 
 * 10) O método não retornar resultado, fechando o fluxo do método.
 * Retorna um resultado
 * Avalia uma expressão e retorna o resultado.
 * 
 * 11) A pilha de chamadas serve para armazenas referencias dos métodos, enquanto vai entrando em um método dentro do outro,
 * Para que após a execução possa retornar para o inicio.
 * 
 * A) Serve para organizar uma chamada de métodos.
 * 
 * B) Os quadros de pilha armazenam os parâmetros de cada método chamado, e esperam um dado do tipo indicado.
 * 
   C) As variaveis de instancia de um objeto não estão no quadro de pilha, pois esses quadros são chamadas de métodos com suas variaveis locais,
 * existiram apenas, caso um objeto seja declarado dentro de um método que estar dentro dessa pilha, e esse objeto deixara de existir quando essa
 * pilha eliminar o método que o mesmo é declarado
 * 
 * D) Varaveis locais também só existem enquanto a pilha armazena a referencia a o método que essas variaveis estão.
 * 
 * E) Variaveis estaticas caso declaradas em um método dentro da pilha, funciona da mesma maneira que as variaveis locais.
 * 
 * 
 * 12) Promoção são regras para converter um valor do argumento, no tipo em que o método chamado espera receber.
 * 
 * 
 * A) long, float ou double
 * 
 * B) Não
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

		// solicita e insere três valores de ponto flutuante
		System.out.print("Insira 3 valores de ponto flutuante, separados por espaço: ");
		double number1 = input.nextDouble(); // lê o primeiro double
		double number2 = input.nextDouble(); // lê o segundo double
		double number3 = input.nextDouble(); // lê o terceiro double

		// determina o valor máximo
		double result = maximum_versao2(number1, number2, number3);

		// exibe o valor máximo
		System.out.println("O maior é: " + result);
	}

	// retorna o máximo dos seus três parâmetros de double ÿ
	public static double maximum(double x, double y, double z) {
		double maximumValue = x; // supõe que x é o maior valor inicialÿ

		// determina se y é maior que maximumValue ÿÿ
		if (y > maximumValue)
			maximumValue = y;

		// determina se z é maior que maximumValue ÿ ÿ
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
