/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s06.herenciapoo;

/**
 *
 * @author UCC
 */
public class S06HerenciaPOO {

   
    public static void main(String[] args) {
       CuentaAhorros cuenta1 = new CuentaAhorros(15000, 12);
       
       cuenta1.imprimir();
       cuenta1.consignar(5000);
       cuenta1.imprimir();
       cuenta1.retirar(28000);
       cuenta1.imprimir();
    }
    
}
