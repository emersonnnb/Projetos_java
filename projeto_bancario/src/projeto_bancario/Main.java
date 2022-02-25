package projeto_bancario;

public class Main {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		cc.depositar(150);
		Conta cp = new ContaPoupanca();
		cp.depositar(50);
		
		cc.transferir(150, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		

	}

}
