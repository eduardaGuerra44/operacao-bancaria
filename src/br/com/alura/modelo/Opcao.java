package br.com.alura.modelo;

public enum Opcao {

    Consultar_Saldo(1) {
        public int acaoCliente(Usuario usuario) {
            int saldoAtual = usuario.getSaldo();
            return saldoAtual;
        }
        },
    Receber_Valor(2){
        @Override
       public int acaoCliente(Usuario usuario){
            int recebeu = usuario.getSaldo() + usuario.getMoneyIn();
            usuario.setSaldoAtual(usuario.getSaldo() + recebeu);
            System.out.println(usuario.saldoAtual);
            return usuario.getSaldoAtual();
        }
    },
    Transferir_Valor(3){
        @Override
       public int acaoCliente(Usuario usuario) {
            int transferiu = usuario.saldoAtual - usuario.getMoneyOut();
            usuario.setSaldoAtual(usuario.getSaldoAtual() - transferiu);
            System.out.println(usuario.getSaldoAtual());

            if (usuario.getSaldoAtual() < usuario.getMoneyOut()) {
                System.out.println("Sinto muito, o saldo não permite essa tranferência");
            }else{
                System.out.println("Transfer~encia realizada com sucesso!! " + usuario.getSaldoAtual());
            }
            return transferiu;
        }
    },
    Sair(4){
        @Override
        public int acaoCliente(Usuario usuario){
            System.out.println("Obrigada por ser nosso cliente " + usuario.getNome());

            return 0;
        }
   };

        private int valor;

        Opcao(int valor) {
            this.valor = valor;
        }


        public abstract int acaoCliente(Usuario usuario);
    }
