package projeto_bancario;

	public class ContaPoupanca extends Conta {
			
		public void imprimirExtrato() {
			System.out.println("=== Extrato Conta Poupan�a ===");	
			super.imprimirInfosComuns();
		}		
	
}
