public class Usuario {
   private String nome;
   private String tipoDaConta;
   private int saldo;


    public Usuario(String nome, String tipoDaConta, int saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipoDaConta = tipoDaConta;
    }
        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        saldo = saldo;
    }



}
