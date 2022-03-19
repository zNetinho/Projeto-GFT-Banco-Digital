package Banco;

	import java.util.List;

import Conta.Conta;

	public class Banco {
	    private String name;
	    private List<Conta> contas;

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public List<Conta> getContas() {
	        return contas;
	    }

	    public void setContas(List<Conta> contas) {
	        this.contas = contas;
	    }
	    
	    
	}


