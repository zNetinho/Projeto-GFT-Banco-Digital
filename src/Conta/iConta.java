package Conta;

public interface iConta {
    
    void saque(double valor);
   
    void deposito(double valor);
   
    void transferir(double valor, Conta contaDestino1);
    
    void imprimirExtrato ();
   
}
