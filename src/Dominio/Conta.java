package Dominio;

public abstract class Conta {

     protected int numero;
     protected double saldo;
     private Cliente cliente;


    private static int AGENCIA_PADRAO = 001;

    public Cliente getCliente() {
        return cliente;
    }

    public Conta(int numero, double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public  void Imprimir() {
        System.out.println("****Conta_Poupança****");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Conta - id: " + this.numero);
        System.out.println("Saldo:  " + this.saldo);
        System.out.println(String.format("Agencia Padrao: " + Conta.AGENCIA_PADRAO));
    }




    public  void Sacar(double valor) {
        this.saldo -= valor;


    }

    public  void Depositar(double valor){
        this.saldo += valor;


    }
    public   void Tranferencia (double valor , Conta tipoConta){
            this.Sacar(valor);
             tipoConta.Depositar(valor);

    }
}
