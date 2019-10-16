package exemploobj;

/**
 *
 * @author cfigueirasvalverde
 */

public class Alumno {
    private String nome;
    private int nota;
    
    public void darNota(int not){
        nota = not;
        
    }
    public int devolverNota(){
        return nota;
       
    }
    public void amosar(){
        System.out.println("nome"+ nome + "nota"+ nota);
    }
    
    
    
}
