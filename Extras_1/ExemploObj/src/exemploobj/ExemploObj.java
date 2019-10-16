package exemploobj;

/**
 *
 * @author cfigueirasvalverde
 */
public class ExemploObj {

    
    public static void main(String[] args) {
        
        //instanciamos un objeto
        Alumno ramona = new Alumno();
        ramona.darNota(3);
        int valorNota = ramona.devolverNota();
        System.out.println("ramona ten un "+ valorNota);
        
        
        
    }
    
}
