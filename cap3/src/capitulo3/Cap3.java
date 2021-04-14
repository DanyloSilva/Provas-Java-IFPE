package capitulo3;

import java.util.Scanner;

import javax.swing.JOptionPane;

/* 
 * 1)as classe sao formas de abstraçoes onde eu tenho metodos e atributos por
 * exemplo posso ter uma classe garrafa que e uma coisa material e pode ter atrbutos 
 * como cor, formato, tamnho e metodos como fechar, abrir colocar agua tirar agua 
 * ou pode ser coisas abistratas como aula , contrutores os constutores sao parametros 
 * que eu posso passar para iniciar os atributos de determinada class
 * ,metodos sao aqueles responsaveis por manipular as atributos funciona de madeira similar com 
 * as funçoes em c, mas e um evoluçao.   obijetos: e aquilo que a gente faz uma intancia ou chama 
 * podendo ser no metodo main ou nao como exomplo posso chamar o obijeto scanner ou um obijeto que eu definir como nome da minha classe
 * basicamento eu posso atribuir uma variavel ao nome da minha class e aqui se comporta como um obijeto posso manipular e usar os metodos ou atributos dessa classe.
 * 
 * 
 * 2)public class Account
 {
private String name; // aqui esta o atributo da conta 

// método modificadores sets e gets  
 * sets server para vc colocar algo dentro no grosso modo e o get vc pega ou olha
 * oq ta nele 
public void setName(String name) //passando para o metodo o parametro  
{
 
 this.name = name; // armazena o nome 
} 

// método para recuperar o nome do objeto
 *  
public String getName() 
{ 
 return name; // retorna valor do nome para o chamador
 } 
} // fim da classe Account

 *  
 *  3)get e set, os efeitos sao de enviar setar para dentro como exemplo no set
 *  eu poderia passar atraves do metodo o nome e dps recuperar atras do metodo get
 *  posso utilizar para basicamente para isso.
 *  
 *  4)aqui na classe a AccountTest a gente tem duas 2 classes a Account e a AccountTest
 *   a classe AccountTest intancia a classe Account onde o atributo nome e os megtodos gets e sets 
 *   alem do intanciamento do metodo scanner que e o que vai ler as entradas, essa e a classe e onde
 *   esta o metodo main.
 *   
 *   5)segurança basicamente para nao mexer diretamente nos atributos.
 *   
 *   
 *   6) O valor padrão para uma variável de instância do tipo String é null, o teste foi printar esse valor.
 *   
 *   
 *   
 *   7)
 *  Construtores criam e inicializam objetos que ainda não existem,
 *   enquanto Métodos realizam operações em objetos que já existem. Construtores não 
 *   podem ser chamados diretamente; 
 *  eles sao chamados de forma implícita quando a palavra chave new cria um objeto.
 *  
 *  8)ele nao roda a principio pede inicilizar os construtores no objeto
 *   Account myAccount = new Account(null, 0); 
 *  
 *  
 *  9)   ele criu obijetos e passo como parametro dois nomes o copilado reclamo
 *  pos nao haviao o outo parametro do construtor mas rodo apos a iniciaçao.		
 *   Account account1 = new Account("Jane Green", 0); 
		 Account account2 = new Account("John Blue", 0); 
		 
		  // exibe o valor inicial de nome para cada Account
	System.out.printf("account1 name is: %s%n", account1.getName());

 System.out.printf("account2 name is: %s%n", account2.getName());
	 
 *  
 *  10)ele roda mas reclama se vc nao passar os parametros dos contrutores
 *  public class Cap3 {
	 public static void main(String[] args) {
	
		 Scanner input = new Scanner(System.in);
		 
		 // cria um objeto Account e o atribui a myAccountÿ
		 Account myAccount = new Account(); 
		 // exibe o valor inicial do nome (null)
		  System.out.printf("Initial name is: %s%n%n", myAccount.getName());
		 
		  // solicita e lê o nome
		  System.out.println("Please enter the name:");
		 String theName = input.nextLine(); // lê uma linha de texto 
		 myAccount.setName(theName); // insere theName em myAccount 
		  System.out.println(); // gera saída de uma linha em branco
		 
		  // exibe o nome armazenado no objeto myAccount
		  System.out.printf("Name in object myAccount is:%n%s%n",
		 myAccount.getName());
	 
	 }

}
package capitulo3;

public class Account {
	private String name; // variável de instância
	private double balance; // variável de instânciaÿ
	
	

	 // Construtor de Account que recebe dois parâmetros
 public Account()
	{
 this.name = name; // atribui name à variável de instância name
	
 // valida que o balance é maior que 0.0; se não for,
 // a variável de instância balance mantém seu valor inicial padrão de 0.0
if (balance > 0.0) // se o saldo for válido 
 this.balance = balance; // o atribui à variável de instância balanceÿ
 }

// método que deposita (adiciona) apenas uma quantia válida no saldo ÿ
public void deposit(double depositAmount) 
{ 
 if (depositAmount > 0.0) // se depositAmount for válido 
 balance = balance + depositAmount; // o adiciona ao saldo 
}

	
	public double getBalance() 
	{ 
	 return balance; 
	 } 
	
	// método que define o nome
	 public void setName(String name)
	 {
 this.name = name;
 }

	// método que retorna o nome
	 public String getName()
	 {
	 return name; // retorna o valor de name ao chamador
	 }
	
	 }


 *  
 *  11)aqui ele esta atribuindo o valor que pode ser passado para que ele nao inicialize em 0 como descrito no construtor
 *  
 *  if (balance > 0.0)
 this.balance = balance;
 *  
 *  
 *  aqui ele vai somar de caso vc chame o metodo  determinado valor
 *  public void deposit(double depositAmount) 
{ 
 if (depositAmount > 0.0) // se depositAmount for válido 
 balance = balance + depositAmount; // o adiciona ao saldo 
}
 *  
 *  
 *  12)uma começa com 50 e outra com 0.
 *  o primeiro if nao acita que a variavel comece com valores negativos
 *  e a segunda garante que o valor digitado seja somado com aquele que ja esta na conta
 *  
 *  13)e ruim para a manutençao futura do codigo oq seria melhor seria dar nomes mais especificos para os obijetos 
 *  para que no futuro se necessitarem serem subsituidos o programador saiba onde esta.
 *  
 *  
 *  
 *  14)	 JOptionPane.showMessageDialog(null, "bem-vindo ao Java");
 *  
 *  15)utiliza a interface grafica swing pega o nome ler e retona um nome em uma janela 
 *   
 *  String name = JOptionPane.showInputDialog("qual seu nome?");
		 String menssagem = String.format("bem-vindo. %s, a programaçao Java", name);
	
		JOptionPane.showMessageDialog(null, menssagem); 
 *  
 *  16)public class Cap3 {
	
	public static void displayAccount(Account accountToDisplay)
	{
	 // coloque aqui a instrução que exibe
		System.out.printf("bem-vindo %s seu saldo e de :$ %.2f %n%n", accountToDisplay.getName(), accountToDisplay.getBalance());
		
		
	 // o name e o balance de accountToDisplay
		
	}
	
	
	 public static void main(String[] args) {
		 
		 
		 
		  
		 
		 Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		 
		  // exibe saldo inicial de cada objeto
		displayAccount(account1);
		displayAccount(account2);
		  //System.out.printf("%s balance: $%.2f %n", account1.getName(),account1.getBalance());
		  //System.out.printf("%s balance: $%.2f %n%n",account2.getName(),account2.getBalance());
		 
		 // cria um Scanner para obter entrada a partir da janela de comando
		 Scanner input = new Scanner(System.in);
		 
		  System.out.print("incira o deposito na conta 1: "); // prompt
		  double depositAmount = input.nextDouble(); // obtém a entrada do usuário
		  
		 System.out.printf("%n foi depositado %.2f na conta 1 %n",depositAmount);
		 account1.deposit(depositAmount); // adiciona o saldo de account1
		 
		  // exibe os saldos
		  System.out.printf("%s balance: $%.2f %n",
		  account1.getName(),account1.getBalance());
		  displayAccount(account2);
		 //System.out.printf("%s balance: $%.2f %n%n",account2.getName(),account2.getBalance());
		
		  System.out.print("incira um deposito para a conta 2: "); // prompt
		  depositAmount = input.nextDouble(); // obtém a entrada do usuário
		  System.out.printf("%n foi depositado %.2f na conta 2 %n",depositAmount);
		  account2.deposit(depositAmount); // adiciona ao saldo de account2
		 
		  // exibe os saldos
			displayAccount(account1);
			displayAccount(account2);
		  //System.out.printf("%s balance: $%.2f %n",account1.getName(),account1.getBalance());
		  //System.out.printf("%s balance: $%.2f %n%n", account2.getName(),account2.getBalance());
		  // fim de main
		  // fim da classe AccountTest
	 }

}
17)
	public static void displayAccountGrafico(Account accountToDisplay)
	{
		String texto = String.format("O valor é" + accountToDisplay.getBalance() + "%n nome:" + accountToDisplay.getName());
		String visor = texto;
		JOptionPane.showMessageDialog(null, visor);
		
		
	}

 *  
 */
public class Cap3 {
	
	public static void displayAccountGrafico(Account accountToDisplay)
	{
		String texto = String.format("O valor é" + accountToDisplay.getBalance() + "%n nome:" + accountToDisplay.getName());
		String visor = texto;
		JOptionPane.showMessageDialog(null, visor);
		
		
	}
	
	
	 public static void main(String[] args) {
		 
		 
		
	 }

}
