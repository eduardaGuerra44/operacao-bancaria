package br.com.alura.service.java;

import br.com.alura.modelo.Opcao;
import br.com.alura.modelo.Usuario;

import java.util.Scanner;

public class Principal {
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
        TransacaoService transacaoService = new TransacaoService();

        int digito = 0;
        while (digito != 4) {
            System.out.println("DIGITE A OPÇÃO DESEJADA");
            digito = leitura.nextInt();

            switch (digito) {
                case 1:
                    transacaoService.consultaSaldo(usuario);
                    break;

                case 2:
                    System.out.println("DIGITE O VALOR A RECEBER: ");
                    transacaoService.recebeValor(usuario);
                    break;

                case 3:
                    System.out.println("DIGITE O VALOR QUE DESEJA TRANSFERIR: ");
                    transacaoService.transfereValor(usuario);
                    break;

                case 4:
                    transacaoService.encerrarPrograma(usuario);
            }


        }
    }


}
