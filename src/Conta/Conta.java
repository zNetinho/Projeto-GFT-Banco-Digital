package Conta;

public class Conta extends ContaMae implements iConta{
		
		
		@Override
		public void saque(double valor) {
			if (this.isStatus() == false) {
				if (this.getSaldo() <= valor) {
					this.setSaldo((float) (getSaldo() - valor));
					System.out.println("Realizando saque" + getSaldo());
				}
			} else if(getTipo().equalsIgnoreCase("corrente")){
				setSaldo((float) (getSaldo() - valor));
				System.out.println("Saque realizado do seu limite de credito");
			}
			
		}

		@Override
		public void deposito(double valor) {
			if (this.isStatus() == false) {
				System.out.println("A conta não foi localizada, verifique se ela e uma conta ativa");
			} else {
				this.setSaldo((float) (this.getSaldo() + valor ));
				System.out.println("Deposito realizado com sucesso aguarde 30 min, o dinheiro estara na sua conta");
			}
			
		}

		@Override
		public void transferir(double valor, Conta contaDestino1) {
			if(this.isStatus() == true) {
				setSaldo((float) (getSaldo() - valor));
				contaDestino1.setSaldo((float) valor);
				System.out.println("Efetuando deposito");
				}else {
					System.out.println("A conta não foi localizada, verifique se ela e uma conta ativa");
				}
		}

		@Override
		public void imprimirExtrato() {
			System.out.println("---------------------------");
			System.out.println("Nome do dono: " + this.getDono());
			System.out.println("O numero da conta: " + this.getNumeroConta());
			System.out.println("Saldo: " + this.getSaldo());
			System.out.println("Tipo de conta: " + this.getTipo());
			System.out.println("Status" + this.isStatus());
			System.out.println("---------------------------");
			
		}

		public float getSaldo() {
			return saldo;
		}
	

}
