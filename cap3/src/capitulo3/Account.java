package capitulo3;

public class Account {
	private String name; // variável de instância
	private double balance; // variável de instânciaÿ
	
	

	 // Construtor de Account que recebe dois parâmetros
 public Account(String name, double balance)
	{
 this.name = name; // atribui name à variável de instância name
	
 // valida que o balance é maior que 0.0; se não for,
 // a variável de instância balance mantém seu valor inicial padrão de 0.0
 
if (balance > 0.0) // se o saldo for válido 
 this.balance = balance; // o atribui à variável de instância balanceÿ
 }

// método que deposita (adiciona) apenas uma quantia válida no saldo 
 
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

