package practice7;

public class practice7_Test {
    public static void main(String[] args) {
    practice7_Card cartao1 = new practice7_Card(1);
    practice7_Card cartao2 = new practice7_Card(2);

    cartao1.adicionarcreditos(100);
    cartao2.adicionarcreditos(50);

    practice7_Terminal terminal = new practice7_Terminal();

    terminal.inserirCartao(cartao1);

    terminal.carregarCreditos(5);

    terminal.transferSaldo(cartao1, cartao2);

    terminal.inserirCartao(cartao2);

    terminal.trocarTicketsPorPremios(0);


    practice7_Game jogo = new practice7_Game("Jogo Aleatórios!", 3, 5);
    terminal.jogandoJogo(jogo);
    }

}