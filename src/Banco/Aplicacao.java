package Banco;

import Conta.Conta;

public class Aplicacao {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.setDono("Zenivaldo");
		conta1.setNumeroConta(3754);
		conta1.setSaldo(0);
		conta1.setStatus(true);
		conta1.setTipo("corrente");
	
		
		
		Conta conta2 = new Conta();
		conta2.setDono("Thiago");
		conta2.setNumeroConta(3754);
		conta2.setSaldo(0);
		conta2.setStatus(true);
		conta2.setTipo("poupança");
		
		
		Conta conta3 = new Conta ();
		conta3.setDono("Gabriela");
		conta3.setNumeroConta(3754);
		conta3.setSaldo(0);
		conta3.setStatus(true);
		conta3.setTipo("corrente");
		

		
		
		conta2.deposito(100);
		conta2.transferir(10f, conta1);
		conta3.saque(10d);
		
		conta1.imprimirExtrato();
		conta2.imprimirExtrato();
		conta3.imprimirExtrato();
		
		conta1.pagarMensalidade();
		conta2.pagarMensalidade();
		conta3.pagarMensalidade();
		
		conta1.fecharConta();
		conta2.fecharConta();
		
		
		
	}
}
