package practice4;
import java.util.Random;

public class practice4_ComputeMethods {
    
       
            public static double fToC(double fahrenheit) {
                double celcius = (fahrenheit - 32) * 5 / 9;
                return celcius;
            }
            
            public static double hypotenusa(double lado1, double lado2) {
                double hypotenusa = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
                return hypotenusa;
            }
            
            public static int rolar() {
                Random random = new Random();
                int valorrolado = random.nextInt(6) + 1;
                return valorrolado;
            }

           
        
        



}