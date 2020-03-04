package boletin_21;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author cfigueirasvalverde
 */
public class Boletin_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Libros obx=new Libros();
       File ficheiro=new File("libro.txt");
       int opcion;
         do{
            opcion= Integer.parseInt(JOptionPane.showInputDialog("*** MENU ***<<<\n1-->Engadir Libros \n2---> Consultar\n3--> Visualizar\n4--> Borrar\n5--> Modificar\n6--> Sair"));
            switch(opcion){                
                case 1:obx.engadir();
                break;
                case 2:obx.consultar(ficheiro);
                break;
                case 3:obx.visualizar(ficheiro);
                break;
                case 4:obx.borrar(ficheiro);
                break;
                case 5:;
                break;
                
            }
        }while(opcion!=5);
    }
    
}