/**
 *
 * @author UCC
 */

package ejercicio.de.examen.pkg2;


public class Pelicula {
     private String titular;
     private String director;
     private int anioEstreno;
     private String genero;
     private boolean disponible;
         
     
      //metodo
    public void setTitular(String titular){
        this.titular = titular;    
    }
    
     public String getTitular(){
        return this.titular;  
     }
     
     public void setDirector(String director){
         this.director = director;
         
     }
     
     public String getDirector(){
        return this.director;  
    }
    
     public void setAnioEstreno(int anioEstreno){
         this.anioEstreno = anioEstreno;
         
     }
     
      public int getAnioEstreno(){
        return this.anioEstreno;  
    }
      
       public void setGenero(String genero){
         this.genero = genero;
         
     }
     
      public String getGenero(){
        return this.genero;  
    }
       public void setDisponible(boolean disponible){
         this.disponible = disponible;
         
     }
     
      public boolean getDisponible(){
        return this.disponible;  
      
    }
      
       public void setprestar(boolean prestar){
       if (prestar = disponible){
            System.out.println("La ya esta reservada");
        } else {
             prestar ;
            System.out.println("Su saldo es de " + monto);
        } 
         this.monto = monto;
       }
    
}
