/**
 *
 * @author UCC
 */
package ejemplo_poo.pkg1;


public class CuentaBancaria{

     
    public static void main(String[] args) {
      Cuenta c1 = new Cuenta();
      c1.setTitular("Otaku");
      c1.setMonto(1500);
      
        System.out.println(c1.getMonto());
        c1.retirar(2000);
        System.out.println(c1.getMonto());
        c1.ingresar(1500);
        System.out.println(c1.getMonto());
      
  
    
    }
    
}
