package Capitulo06;
/*
 * 18) criado
 * 
 * A) 7 - Variavel de classe estatica.
 * 11- método main
 * 22- Imprime a variavel local x do main
 * 32- Soma pré incremento variavel local x do useLocalVariable
 * 42- Multiplica variavel local x do UseField
 * 
 */
public class Scope {

	// campo acessível para todos os métodos dessa classeÿ
	private static int x = 1;

	// O método main cria e inicializa a variável local x
	// e chama os métodos useLocalVariable e useField
	public static void main(String[] args) {
		int x = 5; // variável local x do método sombreia o campo xÿ

		System.out.printf("local x no main é %d%n", x);

		useLocalVariable(); // useLocalVariable tem uma variável local x
		useField(); // useField utiliza o campo x da classe Scope
		useLocalVariable(); // useLocalVariable reinicializa a variável local x
		useField(); // campo x da classe Scope retém seu valor

		System.out.printf("%nlocal x no main é %d%n", x);
	}

	// cria e inicializa a variável local x durante cada chamada
	public static void useLocalVariable() {
		int x = 25; // inicializada toda vez que useLocalVariable é chamadoÿ

		System.out.printf("%nlocal x ao entrar no método useLocalVariable é %d%n", x);
		++x; // modifica a variável local x desse métodoÿ
		System.out.printf("local x ao sair do método useLocalVariable é %d%n", x);
	}

	// modifica o campo x da classe Scope durante cada chamada
	public static void useField() {
		System.out.printf("%ncampo x ao entrar no método useField é %d%n", x);
		x *= 10; // modifica o campo x da classe Scopeÿ
		System.out.printf("campo x ao sair método useField é %d%n", x);
	}

}
