package capitulo04;

import java.util.Scanner;

/*1) E uma serie finitas  em uma ordem especifica e nao ambigua de açoes uma pessoa ordena o computador a executar  e obtem ou nao retorno 
 * 2) a)
 * public class Cap4 {

	public static void main(String[] args) {
  ExemplosCap04 TestPos = new ExemplosCap04();
  TestPos.exemplosSelecao(5);

  Scanner input = new Scanner(System.in);
  
 // System.out.println("digite um valor para saber se ele e positivo:");
 // int TestPos.exemplosSelecao(); = input.nextInt(); 

  
  
  
	}

}
package capitulo04;

public class ExemplosCap04 {
	int valor = 5 ;
	
	
	
	public void exemplosSelecao(int valor) {
		if (valor > 0) {
System.out.println(" o valor " + valor +" e uma valor positivo ");			
		}
	
	
	
	}

	
	
	

}
b)
package capitulo04;

public class ExemplosCap04 {
	int valor = 10 ;
	
	
	
	public void exemplosSelecao(int valor) {
		if (valor > 0) {
System.out.println(" o valor " + valor +" e uma valor positivo ");			
		}
		if (valor <= 100 ){
			System.out.println("o valor esta entre 0 e 100");
		}else {
			System.out.println("valor maior que 100 ou menor que 0"); 
		}
	
	
	
	}

	
	
	

}
 * 3)package capitulo04;

public class ExemplosCap04 {
	
	
	
	public void exemploLacos(int valor) {
		
		for (int i = 0; i<= valor ; i++) {
			System.out.printf("%n %d %n ", i );
	    
		
		
		}
		 int i1 = 0;
			while(valor >= i1) {
				System.out.printf(" %d \t",i1);
				++i1;
			}
			
			int i2=0;// tenho que declara fora
	     do {
	    	 System.out.printf("%n %d %n",i2);
				++i2;
	    	 
	     }while (valor >= i2);
	     
				

	
	
	}



	

	
	
	

}
 * 
 * 4)	public void exemploSelecaoSwitch(int valor) {
		
		switch (valor) {
		case 1:
			valor = 90;
			System.out.println("A");
			break;
		case 2:
			valor = 80;
			System.out.printf("B");
			break;
		case 3:
			valor = 70;
			System.out.println("C");
			break;
		case 4:
			valor = 60;
			System.out.println("D");
			break;
		case 5:
			valor = 50  ;
			System.out.println("F");
			break;
		
		}
		

 *5) 	o problema a oscilaçao do else ele ira responder ao ultimo if para esolver isso e simples e so colocar dentro de if ou retirar o else e utilisar apenas if  
 *o cod ambiguo fica assim
 *	public void exemploElseOscilante(int valor) {
		if (valor < 5) {
			System.out.println("valor menor que 5");
		} 
		
		if(valor >= 5 && valor < 10) {System.out.println("valor entre 5 e 10");

		}else {
			System.out.println("valor maior que 10");
		}
	}

	
	}

 
 se passar o valor 4
 a saida:
 valor menor que 5
valor maior que 10
 
 * isso pq esta ambiguo 
 *  o cod arrumado fica assim 
 *  public void exemploElseOscilante(int valor) {
		if (valor < 5) {
			System.out.println("valor menor que 5");
			if(valor >= 5 && valor < 10) {System.out.println("valor entre 5 e 10");

			}
		}else {
			System.out.println("valor maior que 10");
		}

		} 
 * 
 * 6)e comum pq do uso constante do if e else e  muitas vezes a logica do programador nao lembra pois sao muitos detalhes 
 * 
 * 7)ele utiliza uma expressao booleana q=com uma condiçao e so pode ser utilizada no println
 * public void exemploOperadorCondicional(int valor) {
		System.out.println(valor >= 60 ? "Passo" : "reprovo");

	}
 * 
 * 
 * 8)para evitar chamar algum metodo dentro dos contrutores por isso se justifica a duplicaçao dos cod. nao e uma boa ptratica pq vc meche nos atributos diretamente ao envez so sets e gets nao a e seguro e nao e uma boa pratica
 * 
 * 9)
 * e importante manter o cod funcionando pq  vc consegue voltar e ver onde estao os erros aqui esta funcionado tudo como foi descrito
 * public void exemplosSelecao(int valor, Scanner leitor)
	{
	//usa o scanner aqui para ler da entrada e pronto.

	}

	public static void main(String[] args) {
		ExemplosCap04 account1 = new ExemplosCap04 ("Jane Green", 93.5);
		ExemplosCap04 account2 = new ExemplosCap04("John Blue", 72.75);
		
		 System.out.printf("%s's letter grade is: %s%n",account1.getName(),account1.getLetterGrade());
		 System.out.printf("%s's letter grade is: %s%n",account2.getName(),account2.getLetterGrade());
 // define a média de Student
 public void setAverage(double studentAverage)
	 {
 // valida que a média é > 0.0 e <= 100.0; caso contrário,
	 // armazena o valor atual da média da variável de instância
	if (average > 0.0) 
	 if (average <= 100.0) 
	 this.average = average; // atribui à variável de instância
	 }
	
	 // recupera a média de Student
	 public double getAverage()
	 {
 return average;
	 }

	 // determina e retorna a letra da nota de Student
	 public String getLetterGrade()
	 {
	 String letterGrade = ""; // inicializado como uma String vazia
		 if (average >= 90.0) 
	 letterGrade = "A"; 
	 else if (average >= 80.0)
	letterGrade = "B"; 
	 else if (average >= 70.0)
	 letterGrade = "C"; 
	 else if (average >= 60.0)
	letterGrade = "D"; 
	 else 
	 letterGrade = "F"; 
	
	 return letterGrade;
	 } } // finaliza a classe Student
		
	
 * 
 * 
 * 10) private void defineMedia(double media) {
		 
		 // valida que a média é > 0.0 e <= 100.0; caso contrário,
		 // armazena o valor atual da média da variável de instância
		 if (average > 0.0) 
			 if (average <= 100.0) 
			 this.average = average; // atribui à variável de instância
			 }
			
			 // recupera a média de Student
			 public double getAverage()
			 {
		 return average;
	 }	 

}






11)String resultado = ((90.00 <= average ) ? "A" :
                	(80.00 >= average ) ? "B" : 
                		(average >= 70.0) ? "C": (average >= 60.0) ?"D" : "F");

                		
                		
                		
                		
  12)
	 @Override
	public String toString() {
		return "ExemplosCap04 [name=" + name + ", average=" + average + ", getName()=" + getName()
				+ ", getLetterGrade()=" + getLetterGrade() + ", getAverage()=" + getAverage() + "]";
	}
	
	
	13)
	 @Override
	public String toString() {
		return "ExemplosCap04 [name=" + name + ", average=" + average + ", getName()=" + getName()
				+ ", getLetterGrade()=" + getLetterGrade() + ", getAverage()=" + getAverage() + "]";
	}
	
	
	
	14)public static void main(String[] args) {
		
	// o programa ira pegar 10 inteios somar e dividir por 10
		 // intanciando a variavel para armazenar o scanner 
		 Scanner input = new Scanner(System.in);
		
		 // fase de inicialização
		 int total = 0; // inicializa a soma das notas inseridas pelo usuário
		int gradeCounter = 1; // inicializa nº da nota a ser inserido em seguida
		
		 // fase de processamento utiliza repetição controlada por contador
		 while (gradeCounter <= 10) // faz o loop 10 vezes
		 {
		 System.out.print("Enter grade: "); // prompt
		 int grade = input.nextInt(); // insere a próxima nota
	 total = total + grade; // adiciona grade a total
		gradeCounter = gradeCounter + 1; // incrementa o contador por 1
		 }
		
		 // fase de término
		 int average = total / 10; // divisão de inteiros produz um resultado inteiro
		
		 // exibe o total e a média das notas
	 System.out.printf("%nTotal of all 10 grades is %d%n", total);
		 System.out.printf("Class average is %d%n", average);
		}
	
	
	
	
	
	
	
	
	15)A linha 10 declara e inicializa a variável Scanner input, utilizada para ler os valores inseridos pelo usuário. As linhas 13, 14,
20 e 26 declaram as variáveis locais total, gradeCounter, grade e average, respectivamente, como sendo do tipo int. A variável
grade armazena a entrada de usuário



16)o resultado da divisao foi dois  pq o tipo do dado e int uma soluçao para problema seria mudar o tipo do dado para flot, isso acontece por causa do espaço da memoria e como
o copilador arenda, ele para so primeiro numero no caso do 2,8 por isso fica 2


17) O valor e muito grande para armazenado num tipo int, se esse problema acontecer ele ira truncar o valor. usar flot ou double.

  
  18)simple eu posso colocar estruturas que limitem como if(var =<0){
   print "numero invalido", posso colocar essa estrutura no construtor e a fazer a msm coisa para limitar ate 100 }
   
   
   19)posso definir um contador i colocar uma flag por exemplo -1, o programa so ira para quando o usuario digitar -1 e o contador ira começar no 0 quando ele digitar -1 o programa pega o vamor soma e divide pelo contador simples .
   
   20)nao ha grandes mudnçao oq mudou foi que esta em outra lingua isso e mudou a sintaxy que nesse caso foi para java 
   
   
   21)o segundo pq tem mais detalhes do que faz e como faz 
   
   
   
   22)encerrada, quando e direto passar para o cod em java.
   
   
   23) encerrado, quando fica facil traduzir o pseudocodico para uma linguagem de programaçao 
    
    
 24)public static void mainComSentinela(){
       
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        int gradeCounter = 0;
        
        System.out.println("Enter grade or -1 to quit: ");
        int grade = input.nextInt();
        
        while(grade != -1){
            total = total + grade;
            gradeCounter = gradeCounter +1;
            
            System.out.println("Enter grade or -1 to quit");
            grade = input.nextInt();
        }
        
        if(gradeCounter != 0){
            double average = (double) total/gradeCounter;
            
            System.out.printf("%nTotal of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }else
            System.out.println("No grades were entered");
        
    } 
 * 
 * 
 * 25)
 * 
 * 
 * 
 * 
 * 
 * 26)ele ira provavelmete dar um erro na saida do programa e o resultado ira ser errado.
 * 
 * 
 * 
 * 
 * 
 * 27)
 * public static void main4_10_robusto(){
        
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        int gradeCounter = 0;
        boolean notaValida = false;
        //System.out.println("Enter grade or -1 to quit: ");
        int grade = 0;
        
        while(grade != -1){
            System.out.println("Enter grade or -1 to quit");
            grade = input.nextInt();
            
            if(grade < 0 || grade > 10){
                notaValida = false;
            }else{
                notaValida = true;
            }
            
            if(notaValida){
                total = total + grade;
                gradeCounter = gradeCounter +1;
            }else{
               System.err.println("erro: Esse valor não é válido, digite um valor entre 0 e 10"); 
            }
            
            
        }
        
        if(gradeCounter != 0){
            double average = (double) total/gradeCounter;
            
            System.out.printf("%nTotal of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }else
            System.out.println("No grades were entered");
        
        
        
        
        
    }
 * 
 *28)
 *
 * 
 * 
 * 
 * 
 * 29)
 * 
 * 30)public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
     
        
        while (studentCounter <= 10){
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();
            
            if(result == 1 || result == 2){                
              if(result == 1){
                passes = passes + 1;
              }else    
                failures = failures + 1;       
              
                //studentCounter = studentCounter + 1;
                  studentCounter += 1;
                  
                continue;
            }else
                System.err.println("erro , digite  1 ou 2");               
              
            
           
        }
           testaPar(valor impar);
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
        
        if(passes > 8){
            System.out.println("Bonus to instructor! ");
        }
        
        Analysis teste = new Analysis();
       
        
    }
 * 
 * 
 * 
 * 31)
 * public boolean testaPar(int x){
         
         
        x %= 2;
        
         if(x == 0){
            return true;
        }else{
            return false;
        }
    }
    
 * 
 * */
public class Cap4 {
	
	//usa o scanner aqui para ler da entrada e pronto.

	

	public static void main(String[] args) {
		
	// o programa ira pegar 10 inteios somar e dividir por 10
		 // intanciando a variavel para armazenar o scanner 
		 Scanner input = new Scanner(System.in);
		
		 // fase de inicialização
		 int total = 0; // inicializa a soma das notas inseridas pelo usuário
		int gradeCounter = 1; // inicializa nº da nota a ser inserido em seguida
		
		 // fase de processamento utiliza repetição controlada por contador
		 while (gradeCounter <= 10) // faz o loop 10 vezes
		 {
		 System.out.print("Enter grade: "); // prompt
		 int grade = input.nextInt(); // insere a próxima nota
	 total = total + grade; // adiciona grade a total
		gradeCounter = gradeCounter + 1; // incrementa o contador por 1
		 }
		
		 // fase de término
		 int average = total / 10; // divisão de inteiros produz um resultado inteiro
		
		 // exibe o total e a média das notas
	 System.out.printf("%nTotal of all 10 grades is %d%n", total);
		 System.out.printf("Class average is %d%n", average);
		}


//  Scanner input = new Scanner(System.in);
  //TestPos.exemplosSelecao(5, input);

  

  
  
	}
	


