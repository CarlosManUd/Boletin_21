package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author cfigueirasvalverde
 */
public class Ejercicio2 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        final float PI=3.14f;
        
        float radio,longitud,area,volumen;
        
        System.out.println("Introduce un radio de circunferencia: ");
        
        radio = leer.nextFloat();
        
        longitud=2*PI*radio;
        area=PI*radio*radio;
        volumen=(4/3)*PI*(radio*radio*radio);
        
       
        
        System.out.println("Longitud= "+longitud+"\nArea= "+area+"\nVolumen= "+volumen);

    }
    
}
