import java.util.Scanner;

public class Menu extends Conta {
	
	public Menu(Cliente cliente) {
		super(cliente);
	}

	public void showMenu()
	{
		char opcao ='\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Bem-Vindo(a) " + nome);
		System.out.println("Seu id � " + id);
		System.out.println("\n");
		System.out.println("A. Cheque seu saldo");
		System.out.println("B. Depositar");
		System.out.println("C. Sacar");
		System.out.println("D. �ltima a��o");
		System.out.println("E. Sair");
		
		
		do
		{
			System.out.println("*****************************");
			System.out.println("Digite uma op��o, " + nome);
			System.out.println("*****************************");
			opcao = scanner.next().toUpperCase().charAt(0);
			System.out.println("\n");
			
			switch(opcao)
			{
			case 'A':
				System.out.println("*****************************");
				System.out.println(String.format("Seu saldo � = %.2f", saldo));
				System.out.println("*****************************");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("*****************************");
				System.out.println("Digite a quantidade para dep�sito, " + ": " );
				System.out.println("*****************************");
				System.out.println("\n");
				double valor = scanner.nextDouble();
				if(valor > 0) {
				depositar(valor);
				System.out.println("\n");
				}
				else {
					System.out.println(nome + ", o valor que voc� digitou � inv�lido! Por favor, digite um valor v�lido.");
				}
				break;
				
			case 'C':
				System.out.println("*****************************");
				System.out.println("Digite a quantidade para saque, " + ": ");
				System.out.println("*****************************");
				double valor2 = scanner.nextDouble();
				if(valor2 > 0) {
				sacar(valor2);
				System.out.println("\n");
				}
				else {
					System.out.println(nome + ", o valor que voc� digitou � inv�lido! Por favor, digite um valor v�lido.");
				}
				break;
				
			case 'D':
				System.out.println("*****************************");
				this.UltimaAcao();
				System.out.println("*****************************");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("*****************************");
				break;
				
			default:
				System.out.println(nome + ", o valor que voc� digitou � inv�lido! Por favor, digite um valor v�lido.");
		     	break;
			}
		} while(opcao != 'E');
		System.out.println("Agredecemos por usar nosso servi�o, " + nome + "! :)");
	}
}
