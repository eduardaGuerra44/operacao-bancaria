import javax.print.DocFlavor;
import java.util.Random;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("************************************************************");
        System.out.println("DADOS DO CLIENTE: ");
        String nome = "NOME: Maria";
        String tipodaConta = "TIPO DA CONTA: Corrente";
        int saldo = 3000;

        System.out.println(
                nome + "\n" +
                        tipodaConta + "\n" +
                        "SALDO ATUAL: " + saldo
        );
        System.out.println("************************************************************");


        System.out.println("MENU");
        String opcao1 = "1- Consultar Saldo";
        String opcao2 = "2- Receber valor";
        String opcao3 = "3- Transferir valor";
        String opcao4 = "4- sair";

        System.out.println(

                opcao1 + "\n" +
                        opcao2 + "\n" +
                        opcao3 + "\n" +
                        opcao4
        );




        int operacao = 0;
        while (operacao!=4) {
            System.out.println("DIGITE A OPÇÃO DESEJADA");
            Scanner digito = new Scanner(System.in);
             operacao = digito.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("O saldo atual da conta é: " + saldo);
                    break;


                case 2:
                    System.out.println("DIGITE O VALOR A RECEBER: ");
                    Scanner receber = new Scanner(System.in);
                    int recebeValor = receber.nextInt();
                    int recebeu = saldo + recebeValor;

                    System.out.println(
                            "VOCÊ RECEBEU UMA TRANSFERÊNCIA NO VALOR DE R$" + recebeValor
                                    + "\n" +
                                    "SALDO ATUALIZADO: " + recebeu
                    );
                    break;

                case 3:
                    System.out.println("DIGITE O VALOR QUE DESEJA TRANSFERIR: ");
                    Scanner transferir = new Scanner(System.in);
                    int transferirValor = transferir.nextInt();
                    int transferencia = saldo - transferirValor;

                    if (transferirValor > saldo) {
                        System.out.println("SALDO INSUFICIENTE");
                    } else {
                        System.out.println("TRANSFERÊNCIA REALIZADA COM SUCESSO" + "\n" + " SALDO ATUALIZADO: R$" + transferencia);
                    }
                    break;

                case 4:
                    System.out.println("SESSÃO FINALIZADA, OBRIGADA!");


            }
        }
    }
}