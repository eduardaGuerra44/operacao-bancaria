package br.com.alura.modelo;

public class Usuario {
   private String nome;
   private String tipoDaConta;
   private int saldo;
   public int moneyIn;
   public int moneyOut;
   public int saldoAtual;

    public int getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(int saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public int getMoneyIn() {
        return moneyIn;
    }

    public void setMoneyIn(int moneyIn) {
        this.moneyIn = moneyIn;
    }

    public int getMoneyOut() {
        return moneyOut;
    }

    public void setMoneyOut(int moneyOut) {
        this.moneyOut = moneyOut;
    }

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
