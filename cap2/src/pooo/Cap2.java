package pooo;
import java.util.Scanner; // programa utiliza a classe Scanner
/*
 * 1) aqui podemos observar uma unica classe  Capitulo02, e o unico metodo no momento e o metodo main, aqui seria o primeiro 
 * programa como um famoso "wello word".
 * 
 * 2) mudei a jre 1.8 para a jdk 14.0.1 de dei um run, na jre ele nao estava encontrando o metodo main tentei arrumar mas nao consegui entao contornei o probleme 
 *  a saida foi Welcome to Java Programming!
 *  
 *  3) public class Cap2 
 *  public static void main(String[] args) {
		System.out.println("Bem-vindo"+ " \nkleber danylo" + "\n20191Y6-RC0346");
		  System.out.print("! Saudações!\n");
	}	
}
 *  4) public class Cap2
 *  public static void main(String[] args) {
	String x = "Bem-vindo kleber danylo 20191Y6-RC0346 !Saudações!";
		
		  System.out.print(x);	  }	
}
 *  5)
 *  public class Cap2
 *  public static void main(String[] args) {
	String x = "Bem-vindo \nkleber danylo \n20191Y6-RC0346\n!Saudações!";
		
		  System.out.print(x);	  }	
 *  
 * 
 * 6)public class Cap2  {

	public static void main(String[] args) {
	String x = "Bem-vindo\tkleber danylo\t20191Y6-RC0346\t!Saudações!";
		
		  System.out.print(x);
		  
		  
	}

	

}
7)	public static void main(String[] args) {
	String x = "\"Bem-vindo\" \t \"kleber danylo\"  \t \"20191Y6-RC0346\" \t!Saudações!";
		
		  System.out.print(x);
		  
		  
	}

	

}


8)	public static void main(String[] args) {
	String x = "kleber danylo";
	String y = "20191Y6-RC0346";
	String a= "09/10/20, 17:40";
	String z= "quando a saudade invade o coraçao da gente";
		
	
		  System.out.printf(x +"\n" + y +"\n" + a + "\n" + z);
		  
		  
	}

	

}

9)	
public class Cap2  {

		
		 public static void main(String[] args)
		 {
		
		 Scanner input = new Scanner(System.in);  // ao intanciar essa funçao o programa ira pedir para
		 //importar a biblioteca java util, input e o nome que eu do a variavel que poderia se x y ou z
		 
		 //aqui declaraçao de atributos nessa caso o progama faz soma de 2 numero 
		 int num1; 
		 int num2; 
		 int soma; 
		 
     System.out.print("digite o primeiro numero: "); // um print normal
       num1 = input.nextInt(); // aqui a gente ta atribuindo a variael num1 a funçao
       //input que faz ler oq vai ser digitado apos digitar input. a biblioteca da uma serie de funçoes que pode ser utilizada 
       // nesse caso como vamos trabalhar com int selecionei o nextint
		
System.out.print("digite o segundo numero: ");
		num2 = input.nextInt(); // lê o segundo número fornecido pelo usuário 
	
		soma = num1 + num2; // soma os números, depois armazena o total em sum
	
		System.out.printf("a soma e  %d %n", soma); // exibe a soma 
		//%d  subistitui a variavel soma  
		} 
		} 


10) ao intanciar essa funçao o programa ira pedir para
		 importar a biblioteca java util, input e o nome que eu do a variavel que poderia se x y ou z
		 
 * 
 * 11)import java.util.Scanner; // estou importando um biblioteca nesse caso a scanner
sem essa linha o copilador ira pedir para fazer o import dessa biblioteca ira acender
uma lampada vermelha e nao ira copilar

 * 12)	
 * public class Cap2  {

		//aqui nesse codigo podemos obiserver um comparador de 2 inteiros 
	//o programa pega 2 numeros inteiros e compra dizendo se e maior menor ou igual 
		 public static void main(String[] args)
		 {
		
			// cria Scanner para obter entrada a partir da linha de comando
			 Scanner input = new Scanner(System.in);
			 
			  int number1; // primeiro número a comparar
			  int number2; // segundo número a comparar
			 
			  System.out.print("Enter first integer: "); // mensagem para o usuario retorna um numero 
			 number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
			 
			System.out.print("Enter second integer: "); //mensagem para o usuario retorna um numero 
       number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
			 
if (number1 == number2) 
System.out.printf("%d == %d%n", number1, number2);
			 if (number1 != number2) 
	System.out.printf("%d != %d%n", number1, number2);

if (number1 < number2) 
	System.out.printf("%d < %d%n", number1, number2); 
		
	 if (number1 > number2) 
		 System.out.printf("%d > %d%n", number1, number2); 
			
		if (number1 <= number2) 
			 System.out.printf("%d <= %d%n", number1, number2);
			
		if (number1 >= number2) 
		 System.out.printf("%d >= %d%n", number1, number2);

		} 
		} 
		
		
		13)public class Cap2  {

		//aqui nesse codigo podemos obiserver um comparador de 2 inteiros 
	//o programa pega 2 numeros inteiros e compra dizendo se e maior menor ou igual 
		 public static void main(String[] args)
		 {
		
			// cria Scanner para obter entrada a partir da linha de comando
			 Scanner input = new Scanner(System.in);
			 
			  int number1; // primeiro número a comparar
			  int number2; // segundo número a comparar
			 int soma, divisao, subtraçao, resto ,multiplicaçao = 0;
			 
			 
			// if(number1 == 0) {
				 
			// }
			 
			  System.out.print("Enter first integer: "); // mensagem para o usuario retorna um numero 
			 number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
			 
			System.out.print("Enter second integer: "); //mensagem para o usuario retorna um numero 
       number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
       
       soma = number1 + number2;
		System.out.printf("O resultado %d + %d => %d, uhú! funciona esse treco\n", number1, number2, soma);
		
		subtraçao = number1 - number2;
		System.out.printf("O resultado %d - %d => %d, uhú! funciona esse treco\n", number1, number2, subtraçao);

		multiplicaçao = number1 * number2;

		System.out.printf("O resultado %d * %d => %d, uhú! funciona esse treco\n", number1, number2, multiplicaçao);
		divisao = number1 / number2;

	       
		System.out.printf("O resultado "+ number1 + "/" + number2 +"=>"+ divisao +", uhú! funciona esse treco\n");
		
		
		resto = number1 % number2;
		  
		System.out.printf("O resultado "+ number1 + " %%" + number2 +"=>"+ resto +", uhú! funciona esse treco\n");
		

		
       
		if (number1 == number2) 
			System.out.printf("%d == %d%n", number1, number2);
						 if (number1 != number2) 
				System.out.printf("%d != %d%n", number1, number2);

			if (number1 < number2) 
				System.out.printf("%d < %d%n", number1, number2); 
					
				 if (number1 > number2) 
					 System.out.printf("%d > %d%n", number1, number2); 
						
					if (number1 <= number2) 
						 System.out.printf("%d <= %d%n", number1, number2);
						
					if (number1 >= number2) 
					 System.out.printf("%d >= %d%n", number1, number2);


		} 
		} 
		  
	
		
		14)diferente do c ele nao copila e dar os seguintes erros, ele nao aceita o tipo de entrada  
		Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at pooo/pooo.Cap2.main(Cap2.java:249)

	
	15)ocorreu um erro logico na divisao por 0 na 2 entrada 
	Enter first integer: 2
Enter second integer: 0
O resultado 2 + Exception in thread "main" 0 => 2, uhú! funciona esse treco
O resultado 2 - 0 => 2, uhú! funciona esse treco
O resultado 2 * 0 => 0, uhú! funciona esse treco
java.lang.ArithmeticException: / by zero
	at pooo/pooo.Cap2.main(Cap2.java:268)
	aqui o programa quebro na hora da divisao uma das soluçoes possiveis seria usar o tipo float
	mas aqui preferir usar um if como o solicitado.
	
	public class Cap2  {

		//aqui nesse codigo podemos obiserver um comparador de 2 inteiros 
	//o programa pega 2 numeros inteiros e compra dizendo se e maior menor ou igual 
		 public static void main(String[] args)
		 {
		
			// cria Scanner para obter entrada a partir da linha de comando
			 Scanner input = new Scanner(System.in);
			 
			  int number1; // primeiro número a comparar
			  int number2; // segundo número a comparar
			 int soma, divisao, subtraçao, resto ,multiplicaçao = 0;
			 
		
			 
			 
			  System.out.print("Enter first integer: "); // mensagem para o usuario retorna um numero 
			 number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
			 
			System.out.print("Enter second integer: "); //mensagem para o usuario retorna um numero 
       number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
       
       if (number2 == 0) {System.out.println("invalido");
		
		}else {
       
       soma = number1 + number2;
		System.out.printf("O resultado %d + %d => %d, uhú! funciona esse treco\n", number1, number2, soma);
		
		subtraçao = number1 - number2;
		System.out.printf("O resultado %d - %d => %d, uhú! funciona esse treco\n", number1, number2, subtraçao);

		multiplicaçao = number1 * number2;

		System.out.printf("O resultado %d * %d => %d, uhú! funciona esse treco\n", number1, number2, multiplicaçao);
		divisao = number1 / number2;

	       
		System.out.printf("O resultado "+ number1 + "/" + number2 +"=>"+ divisao +", uhú! funciona esse treco\n");
		
		
		resto = number1 % number2;
		  
		System.out.printf("O resultado "+ number1 + " %%" + number2 +"=>"+ resto +", uhú! funciona esse treco\n");
		

		
       
		if (number1 == number2) 
			System.out.printf("%d == %d%n", number1, number2);
						 if (number1 != number2) 
				System.out.printf("%d != %d%n", number1, number2);

			if (number1 < number2) 
				System.out.printf("%d < %d%n", number1, number2); 
					
				 if (number1 > number2) 
					 System.out.printf("%d > %d%n", number1, number2); 
						
					if (number1 <= number2) 
						 System.out.printf("%d <= %d%n", number1, number2);
						
					if (number1 >= number2) 
					 System.out.printf("%d >= %d%n", number1, number2);
		}

		} 
		} 
		
		
		16)
		
		
		
	
	
 * 
 */                     

	
/*public class Cap2  {

		//aqui nesse codigo podemos obiserver um comparador de 2 inteiros 
	//o programa pega 2 numeros inteiros e compra dizendo se e maior menor ou igual 
		 public static void main(String[] args)
		 {
		
			// cria Scanner para obter entrada a partir da linha de comando
			 Scanner input = new Scanner(System.in);
			 
			  int number1; // primeiro número a comparar
			  int number2; // segundo número a comparar
			 int soma, divisao, subtraçao, resto ,multiplicaçao = 0;
			 
		
			 
			 
			  System.out.print("Enter first integer: "); // mensagem para o usuario retorna um numero 
			 number1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
			 
			System.out.print("Enter second integer: "); //mensagem para o usuario retorna um numero 
       number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
       
       if (number2 == 0) {System.out.println("invalido");
		
		}else {
       
       soma = number1 + number2;
		System.out.printf("O resultado %d + %d => %d, uhú! funciona esse treco\n", number1, number2, soma);
		
		subtraçao = number1 - number2;
		System.out.printf("O resultado %d - %d => %d, uhú! funciona esse treco\n", number1, number2, subtraçao);

		multiplicaçao = number1 * number2;

		System.out.printf("O resultado %d * %d => %d, uhú! funciona esse treco\n", number1, number2, multiplicaçao);
		divisao = number1 / number2;

	       
		System.out.printf("O resultado "+ number1 + "/" + number2 +"=>"+ divisao +", uhú! funciona esse treco\n");
		
		
		resto = number1 % number2;
		  
		System.out.printf("O resultado "+ number1 + " %%" + number2 +"=>"+ resto +", uhú! funciona esse treco\n");
		

		
       
		if (number1 == number2) 
			System.out.printf("%d == %d%n", number1, number2);
						 if (number1 != number2) 
				System.out.printf("%d != %d%n", number1, number2);

			if (number1 < number2) 
				System.out.printf("%d < %d%n", number1, number2); 
					
				 if (number1 > number2) 
					 System.out.printf("%d > %d%n", number1, number2); 
						
					if (number1 <= number2) 
						 System.out.printf("%d <= %d%n", number1, number2);
						
					if (number1 >= number2) 
					 System.out.printf("%d >= %d%n", number1, number2);
		}

		} 
		} 
		  
*/	
	


