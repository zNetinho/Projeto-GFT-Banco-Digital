package Conta;

public class ContaP extends Conta{
    
    public void imprimirExtrato() {
    System.out.println("=== Extrato Bancario Conta Poupança ===");
    super.imprimirInfo();
    
}

	@Override
	public void saque(double valor) {
		double valorSaque = this.getSaldo();
		valor += 1;
		valorSaque -= valor;
		this.setSaldo(valorSaque);
		
	}

 





}
