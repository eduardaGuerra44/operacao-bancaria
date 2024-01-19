package br.com.alura.modelo;

public class Usuario {
    private  String nome;
    private  String tipoDaConta;
    private int saldo;

    public Usuario(String nome, String tipoDaConta, int saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipoDaConta = tipoDaConta;
    }


    public String getNome() {
        return nome;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public int getSaldo() {
        return saldo;
    }


}
