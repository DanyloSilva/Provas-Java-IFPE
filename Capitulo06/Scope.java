package Capitulo06;
/*
 * 18) criado
 * 
 * A) 7 - Variavel de classe estatica.
 * 11- m�todo main
 * 22- Imprime a variavel local x do main
 * 32- Soma pr� incremento variavel local x do useLocalVariable
 * 42- Multiplica variavel local x do UseField
 * 
 */
public class Scope {

	// campo acess�vel para todos os m�todos dessa classe�
	private static int x = 1;

	// O m�todo main cria e inicializa a vari�vel local x
	// e chama os m�todos useLocalVariable e useField
	public static void main(String[] args) {
		int x = 5; // vari�vel local x do m�todo sombreia o campo x�

		System.out.printf("local x no main � %d%n", x);

		useLocalVariable(); // useLocalVariable tem uma vari�vel local x
		useField(); // useField utiliza o campo x da classe Scope
		useLocalVariable(); // useLocalVariable reinicializa a vari�vel local x
		useField(); // campo x da classe Scope ret�m seu valor

		System.out.printf("%nlocal x no main � %d%n", x);
	}

	// cria e inicializa a vari�vel local x durante cada chamada
	public static void useLocalVariable() {
		int x = 25; // inicializada toda vez que useLocalVariable � chamado�

		System.out.printf("%nlocal x ao entrar no m�todo useLocalVariable � %d%n", x);
		++x; // modifica a vari�vel local x desse m�todo�
		System.out.printf("local x ao sair do m�todo useLocalVariable � %d%n", x);
	}

	// modifica o campo x da classe Scope durante cada chamada
	public static void useField() {
		System.out.printf("%ncampo x ao entrar no m�todo useField � %d%n", x);
		x *= 10; // modifica o campo x da classe Scope�
		System.out.printf("campo x ao sair m�todo useField � %d%n", x);
	}

}
