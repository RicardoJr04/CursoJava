package practice7;

public class practice7_Terminal {
    
    private practice7_Card cartao;
    private practice7_Category[] categoriasPremio;

    public practice7_Terminal(){
        cartao = null;
        categoriasPremio = new practice7_Category[3];
        categoriasPremio[0] = new practice7_Category("Categoria 1", 5, 10);
        categoriasPremio[1] = new practice7_Category("Categoria 2", 10, 5);
        categoriasPremio[2] = new practice7_Category("Categoria 3", 15, 3);
    
    }
    public void inserirCartao(practice7_Card cartao) {
        this.cartao = cartao;
        System.out.println("Cartão - " + cartao.getnumeroIdentificacao() + " inserido no terminal.");
    }

    public void carregarCreditos(int dinheiro) {
        int creditos = dinheiro * 2;
        cartao.adicionarTickets(creditos);
        System.out.println("Cartão - " + cartao.getnumeroIdentificacao() + " - Créditos carregados: " + creditos);
        cartao.MostrarSaldos();
    }

public void transferSaldo(practice7_Card cartaoorigem, practice7_Card cartaodestino){
    int creditosTransferidos = cartaoorigem.getSaldoCredito();
        int ticketsTransferidos = cartaodestino.getSaldoTickets();

        cartaoorigem.retirarCreditos(creditosTransferidos);
        cartaoorigem.subtrairTickets(ticketsTransferidos);
        cartaodestino.adicionarcreditos(creditosTransferidos);
        cartaodestino.adicionarTickets(ticketsTransferidos);
    
        System.out.println("Transferência de saldo do Cartão - " + cartaoorigem.getnumeroIdentificacao() +
        " para o Cartão - " + cartaodestino.getnumeroIdentificacao());
    System.out.println("Créditos transferidos: " + creditosTransferidos);
    System.out.println("Tíquetes transferidos: " + ticketsTransferidos);
    System.out.println();
    
    cartaoorigem.MostrarSaldos();
    cartaodestino.MostrarSaldos();
    }
    
    public void trocarTicketsPorPremios(int categoria) {
        if (categoria >= 0 && categoria < categoriasPremio.length) {
            practice7_Category categoriaPremio = categoriasPremio[categoria];
            categoriaPremio.solicitarPremio(cartao);
        } else {
            System.out.println("Categoria inválida.");
        }
    }  
    public void jogandoJogo(practice7_Game jogo) {
        jogo.jogandoJogo(cartao);
    }
}







