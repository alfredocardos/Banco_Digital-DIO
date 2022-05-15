package MovimentaçõesBancarias;
import Dominio.Conta;

import javax.swing.*;
import java.util.Scanner;

public class Movimentações {
    public static void Transacoes(Conta conta) {
        try{

    Scanner sc = new Scanner(System.in);
    //Movimentação Bancaria
                 System.out.println("Qual movimentação voce deseja fazer ");
                 System.out.println("********************");
                 System.out.println("* 1 - Sacar        *");
                 System.out.println("* 2 - Depositar    *");
                 System.out.println("* 3 - Transferencia *");
                 System.out.println("********************");
                 int entrada = sc.nextInt();
                 if (entrada == 1) {
                     conta.Sacar(conta.getSaldo());
                     System.out.println("Concluido!");
                 } else if (entrada == 2) {
                     conta.Depositar(conta.getSaldo());
                     System.out.println("Concluido!");
                 } else if (entrada == 3) {
                     conta.Tranferencia(conta.getSaldo(), conta);
                     System.out.println("Concluido!");
                 } else {
                     System.out.println("Voce digitou um valor errado");
                 }


} catch (Exception e) {
            e.printStackTrace();
        }
    }


}
