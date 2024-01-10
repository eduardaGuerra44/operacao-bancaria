import br.com.alura.modelo.Opcao;
import br.com.alura.modelo.Usuario;

import java.util.Scanner;

public class Operacao {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Camila", "Corrente", 3000);


        System.out.println("********************************" + "\n" +
                "Dados do cliente: " + "\n" +
                "Nome: " + usuario.getNome() + "\n" +
                "Tipo da conta: " + usuario.getTipoDaConta() + "\n" +
                "Saldo: R$" + usuario.getSaldo() + "\n" +
                "********************************");

        System.out.println("MENU: " + "\n" +
                "1-" + Opcao.Consultar_Saldo + "\n" +
                "2-" + Opcao.Receber_Valor + "\n" +
                "3-" + Opcao.Transferir_Valor + "\n" +
                "4-" + Opcao.Sair);


        Scanner leitura = new Scanner(System.in);
        usuario.setMoneyIn(leitura.nextInt());


        int digito = 0;
        while (digito != 4) {
            System.out.println("DIGITE A OPÇÃO DESEJADA");
            digito = leitura.nextInt();

            switch (digito) {
                case 1:
                    System.out.println(Opcao.Consultar_Saldo);
                    break;

                    case 2:
                    System.out.println("DIGITE O VALOR A RECEBER: ");
                    Scanner receber = new Scanner(System.in);
                        usuario.setMoneyIn(receber.nextInt());
                        System.out.println(Opcao.Receber_Valor);
                    break;

                case 3:
                    System.out.println("DIGITE O VALOR QUE DESEJA TRANSFERIR: ");
                    Scanner transferir = new Scanner(System.in);
                    usuario.setMoneyOut(transferir.nextInt());
                    System.out.println(Opcao.Transferir_Valor);
                    break;

                case 4:
                    System.out.println();
            }




        }
    }


}
