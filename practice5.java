import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //
        System.out.println("Parte 1");

        System.out.println("Escreva o comprimento da onda");
        double comprimentoOnda = teclado.nextDouble();

        if (comprimentoOnda >= 380 && comprimentoOnda < 450) {
            System.out.println("Violeta");
        }
        else if (comprimentoOnda >= 450 && comprimentoOnda < 495) {
            System.out.println("Azul");
        }
        else if (comprimentoOnda >= 495 && comprimentoOnda < 570) {
            System.out.println("Verde");
        } 
        else if (comprimentoOnda >= 570 && comprimentoOnda < 590) {
            System.out.println("Amarelo");
        }
        else if (comprimentoOnda >= 590 && comprimentoOnda < 620) {
            System.out.println("Laranja");
        }
        else if (comprimentoOnda >= 620 && comprimentoOnda < 750) {
            System.out.println("Vermelho");
        }
        else{
            System.out.println("Esse comprimento de onda não faz parte do Espectro visível");
        }
        System.out.println(" ");

        //
        System.out.println("Parte 2");

        System.out.println("Escreva um valor do sinal equivalente a cor que ele está sendo 1 = vermelho 2 = verde 3 = amarelo");

        int CorDoSinal = teclado.nextInt();
        teclado.close();

        if(CorDoSinal == 1){
            System.out.println("a proxima cor é verde");
        }
        else if (CorDoSinal == 3){
            System.out.println("a proxima cor é vermelho");
        }
        else if(CorDoSinal == 2){
            System.out.println("a proxima cor é amarelo");
        }
        else{
            System.out.println("a cor digitada é invalida");
        }
        System.out.println(" ");

        //
        System.out.println("Parte 3");

        System.out.println("é a mesma coisa da tarefa 2 mas é resolvida usando swich");

        switch(CorDoSinal){
            case 1: System.out.println("a proxima cor é verde");
            break;
            case 2: System.out.println("a proxima cor é amarelo");
            break;
            case 3: System.out.println("a proxima cor é vermelho");
            break;
            default: System.out.println("a cor digitada é invalida");
        }

    }
}
