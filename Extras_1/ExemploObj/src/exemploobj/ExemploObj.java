package exemploobj;

/**
 *
 * @author cfigueirasvalverde
 */
public class ExemploObj {

    
    public static void main(String[] args) {
        
        //instanciamos un objeto
        Alumno llama = new Alumno();
        llama.darNota(3);
        int valorNota = llama.devolverNota();
        System.out.println("pepito ten un "+ valorNota);
        
        
        
    }
    
}
