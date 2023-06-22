package practice7;
import java.util.Random;
public class practice7_Game {
    
    private int creditosNecessarios;
    
    public practice7_Game(String nome, int creditosNecessarios, int ticketsGanhos) {
        this.creditosNecessarios = creditosNecessarios;
    }

public void jogandoJogo (practice7_Card cartao){

if(cartao.getSaldoCredito()>= creditosNecessarios){
    cartao.retirarCreditos(creditosNecessarios);
int tickets = gerarNumero();
cartao.adicionarTickets(tickets);
System.out.printf("Número Cartão - %d\n",cartao.getnumeroIdentificacao());
System.out.printf("Tickets - %d",tickets);
}
else
System.out.printf("Número Cartão - %d\n",cartao.getnumeroIdentificacao());
System.out.println("Créditos insuficientes");
}

private int gerarNumero() {
    Random random = new Random();
    return Math.abs(random.nextInt());
}






}



   
