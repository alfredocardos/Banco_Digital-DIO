package Main;


import Dominio.*;
import MovimentaçõesBancarias.Movimentações;

import java.util.Scanner;


public class Teste {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

             Cliente cliente = new Cliente("Alfredo", Tipo_Pessoa.FISICA);
             Conta contaPoupança = new ContaPoupança(117, 1_500, cliente);
             Banco BB = new Banco(cliente, contaPoupança);
             contaPoupança.Imprimir();
             //ESCOLHER O TIPO DE MOVIMENTAÇÃO
             Movimentações.Transacoes(contaPoupança);





    }
}
