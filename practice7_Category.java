package practice7;

public class practice7_Category {
    
private String nome;
private int ticketsNecessarios;
private int quantidadedisponivel;

public practice7_Category (String nome, int  ticketsNecessarios, int quantidadedisponivel ){
    this.nome = nome;
    this.ticketsNecessarios = ticketsNecessarios;
    this.quantidadedisponivel = quantidadedisponivel;
}

public boolean SolicitarPremio(practice7_Card cartao) {
    return cartao.getSaldoTickets() >= ticketsNecessarios && quantidadedisponivel > 0;
}

public void solicitarPremio(practice7_Card cartao) {
    if (SolicitarPremio(cartao)) {
        cartao.subtrairTickets(ticketsNecessarios);
        quantidadedisponivel--;
        
        System.out.println("Cartão -" + cartao.getnumeroIdentificacao() + " - Solicitação de prêmio (" + nome + ")");
        System.out.println("Prêmio contemplado! Restam " + quantidadedisponivel + " Prêmios da categoria.");
    }
else {
    System.out.println("Cartão - "+ cartao.getnumeroIdentificacao());
    System.out.println("Tickets insuficientes ou premio esgotado");
}




}
}