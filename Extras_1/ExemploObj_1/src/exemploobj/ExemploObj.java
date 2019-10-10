package exemploobj;

/**
 *
 * @author cfigueirasvalverde
 */
public class ExemploObj {

    
    public static void main(String[] args) {
        
        //instanciamos un objeto
        Alumno ramona = new Alumno();
        ramona.amosar();
        Alumno antia = new Alumno("ant", 8) ;
        antia.amosar();
        antia.setNome("lucia");
        
        System.out.println("****"+ antia.getNome());
        
        
    }
    
}
