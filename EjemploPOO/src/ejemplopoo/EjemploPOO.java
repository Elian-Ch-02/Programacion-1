
package ejemplopoo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author UCC
 */

public class EjemploPOO {

    
    public static void main(String[] args) {
      Persona p1 = new Persona (); 
      
    //  p1.nombre = "Otaku";  //No se puede acceder porque la variable es privada//
      
      p1.edad = 22; 
      
        p1.setNombre("Otaku");
      
        System.out.println(p1.getNombre());
        System.out.println(p1.getEdad());
        p1.setEdad(23);
        System.out.println(p1.getEdad());
        
      
    }
    
}
