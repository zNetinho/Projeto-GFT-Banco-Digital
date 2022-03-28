package Conta;



public class ContaMae implements iConta {
	// Atributos
	public int numeroConta;
	public String tipo, dono;
	public float saldo;
	public boolean status;

	// metodos

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Não podemos encerrar sua conta devido a saldo vinculado\n");
		} else if (this.getSaldo() < 0) {
			System.out.println("A sua conta tem um saldo negativo, por favor entre em contato conosco\n");
		} else {
			this.setStatus(false);
		}
	}

	public void pagarMensalidade() {
		if(this.getTipo().equalsIgnoreCase("poupança")) {
			System.out.println("Conta do tipo poupança e livre de taxa de manutenção\n");
		}else {
			this.setSaldo(getSaldo() - 12.50f);
			System.out.println("foi descontado uma taxa da sua conta, referente a manutenção mensal\n");
		}
	}

	// metodos especiais
	public ContaMae() {
		this.setSaldo(0);
		this.status = false;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float valor) {
		this.saldo = valor;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public void saque(double valor) {
		if (this.isStatus() == false) {
			if (this.getSaldo() <= valor) {
				this.setSaldo((float) (getSaldo() - valor));
				System.out.println("Realizando saque" + getSaldo());
			}
		} else {
			System.out.println("Saque realizado do Limite especial, Juros de 10%");
		}
		
		
	}

	@Override
	public void deposito(double valor) {
		if (this.isStatus() == false) {
			System.out.println("A conta não foi localizada, verifique se ela e uma conta ativa");
		} else {
			this.setSaldo((float) (this.getSaldo() + valor));
			System.out.println("Deposito realizado com sucesso aguarde 30 min, o dinheiro estara na sua conta");
		}
		
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino1) {
		if(this.isStatus() == true) {
			setSaldo((float) (valor + getSaldo()));
			System.out.println("Efetuando deposito");
			}else {
				System.out.println("A conta não foi localizada, verifique se ela e uma conta ativa");
			}
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("---------------------------");
		System.out.println("" + this.getDono());
		System.out.println("" + this.getNumeroConta());
		System.out.println("" + this.getSaldo());
		System.out.println("" + this.getTipo());
		System.out.println("" + this.isStatus());
		System.out.println("---------------------------");
	}

}
