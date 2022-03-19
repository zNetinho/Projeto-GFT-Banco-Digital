package Cliente;

import Conta.Conta;

public class Cliente {
    private String name;
    
    private Conta conta;

    public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
