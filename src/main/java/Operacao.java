public class Operacao {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Camila", "Corrente", 3000);


        System.out.println("********************************" + "\n" +
                          "Dados do cliente: " + "\n" +
                          "Nome: " + usuario.getNome() + "\n" +
                          "Tipo da conta: " + usuario.getTipoDaConta() + "\n" +
                          "Saldo: R$" +usuario.getSaldo() + "\n" +
                           "********************************");
    }
}
