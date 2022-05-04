
public class Conta {
	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int id;
	protected double ultimaAcao;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.id = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	
	public void sacar(double valor) {
		if(valor > 0)
		{
		this.saldo = saldo - valor;
		this.ultimaAcao = -valor;
		}
	}
    public void depositar(double valor) {
    	if(valor > 0)
    	{
		this.saldo = saldo + valor;
		this.ultimaAcao = valor;
    	}
    }
    public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);	
	}
    protected void ImprimirInfosComuns() {
    	System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("ID: %d", this.id));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
    protected void UltimaAcao() {
		if(ultimaAcao < 0)
		{
			System.out.println("Saque: " + Math.abs(ultimaAcao));
		}
		else if(ultimaAcao > 0)
		{
			System.out.println("Depósito: " + ultimaAcao);
		}
		else
		{
			System.out.println("Nenhuma ação foi feita");
		}
	}

    public void imprimirExtrato() {
    	
    }
    public int getAgencia() {
		return agencia;
	}
	public int getID() {
		return id;
	}
	public double getSaldo() {
		return saldo;
	}

	public void showMenu(){
	}
	
}
