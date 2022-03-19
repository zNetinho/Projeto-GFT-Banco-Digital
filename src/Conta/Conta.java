package Conta;


	public abstract class Conta implements iConta{
	    
	    private static final int AGENCIA_PADRAO = 3754;
	    private static int SEQUENCIAL = 1;

	    public String tipo;
	    public int nmr;
	    final int agencia;
	    private double saldo;


	        Conta() {
	        this.agencia = Conta.AGENCIA_PADRAO;
	        this.nmr = SEQUENCIAL++;
	      
	    }

	    public int getAgencia() {
	        return agencia;
	    }


	    public String getTipo() {
	        return tipo;
	    }

	    public double getSaldo() {
	        return saldo;
	    }


	    public void saque(double valor) {
	        this.saldo -= valor;
	    }

        public void deposito(double valor) {
	        this.saldo += valor;
	    }

	    public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

		public void transferir(double valor, Conta contaDestino1) {
	        this.saque(valor);
	        contaDestino1.deposito(valor);
	    }
	    protected void imprimirInfo() {
	        System.out.println(String.format("Agencia: %d", this.agencia));
	        System.out.println(String.format("Numero da conta: ", this.nmr));
	        System.out.println(String.format("Saldo: %.2f ", this.saldo + "R$"));
	    }   

	}

