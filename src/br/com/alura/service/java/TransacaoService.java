package br.com.alura.service.java;

import br.com.alura.modelo.Usuario;

import java.util.Scanner;

public class TransacaoService {

    Scanner entrada = new Scanner(System.in);

    public void consultaSaldo(Usuario usuario) {
        System.out.println(usuario.getSaldo());
    }

    public void recebeValor(Usuario usuario) {
        int saldoAtual = usuario.getSaldo();
        int recebeValor = entrada.nextInt();
        int recebeu = saldoAtual + recebeValor;
        System.out.println("VOCÊ RECEBEU UMA TRANSFERENCIA NO VALOR DE: R$" + recebeValor + "\n" +
                "SALDO ATUAL: R$" + recebeu);

    }

    public void transfereValor(Usuario usuario) {
        int saldoAtual = usuario.getSaldo();
        int transferirValor = entrada.nextInt();
        int transferencia = saldoAtual - transferirValor;

        if (transferirValor > saldoAtual) {
            System.out.println("SALDO INSUFICIENTE");
        } else {
            System.out.println("TRANSFERÊNCIA REALIZADA COM SUCESSO" + "\n" + " SALDO ATUALIZADO: R$" + transferencia);
        }

    }

    public void encerrarPrograma(Usuario usuario) {
        System.out.println("SESSÃO ENCERRADA. OBRIGADO(A), " + usuario.getNome());
    }

}
