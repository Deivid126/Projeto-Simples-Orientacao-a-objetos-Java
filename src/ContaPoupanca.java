
public class ContaPoupanca extends Conta {

	@Override
	public void imprimirgeral() {
		System.out.println("=== Extrato da Conta Poupan�a ===");
		super.imprimirExtrato();
		
	}
	
}