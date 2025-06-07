/**
 *
 * @author UCC
 */
package ejemplo_poo.pkg1;

public class Cuenta {
    private String titular;
    private double monto;
   
     //metodo set titular
     public void setTitular(String titular){ 
        this.titular = titular;  
        
    }
    //metodo get titular
     public String getTitular(){
        return this.titular;  
        
     }
     
     //metodo set monto
    public void setMonto(double monto){
       if (monto <= 0){
            System.out.println("Su saldo es de 0");
        } else {
              monto = monto + monto;
            System.out.println("Su saldo es de " + monto);
        } 
         this.monto = monto;
         
     }
    //metodo get monto
     public double getMonto(double monto){
          
       return this.monto;  
     }
     public void ingresar(double monto){
          if (monto < 0){
        }
           this.monto += monto; // this.monto = this.monto + monto
     }
     public void retirar(double monto){
     if ((this.monto - monto) < 0){
         this.monto = 0;
     }else{
     this.monto -= monto;
     }
     
     }
}
