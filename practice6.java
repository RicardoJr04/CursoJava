import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        //
        System.out.println("Parte 1");

        System.out.println("Escreva o PIN bancario");
        int PINdigitado = teclado.nextInt();

        int PINcorreto = 0000;

        while(PINdigitado != PINcorreto ){
            System.out.println("PIN errado escreva novamente");
            PINdigitado = teclado.nextInt();
        }
        System.out.println("Acesso liberado");

        System.out.println(" ");

        //
        System.out.println("Parte 2");

        System.out.println("Escreva um número que você deseja saber os múltiplos");
        int numero = teclado.nextInt();

        teclado.close();

        for(int i = 1; i<=12; i++){
            System.out.print( " \n " + numero + " x " + i + " = " + i*numero );
        }

    }
}
