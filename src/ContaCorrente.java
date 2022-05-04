

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	public void imprimirExtrato() {
		System.out.println("*** Extrato conta corrente ***");
		super.ImprimirInfosComuns();
	}
	
	protected void UltimaAcao() {
		super.UltimaAcao();
	}
	
}
