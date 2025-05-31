/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopoo;

/**
 *
 * @author UCC
 */
public class Persona {
    private String nombre;
    public int edad;
 
    //metodo
    public void setNombre(String nombre){
        this.nombre = nombre;    
    }
    
     public String getNombre(){
        return this.nombre;  
     }
     
     public void setEdad(int edad){
         this.edad = edad;
         
     }
     
     public int getEdad(){
        return this.edad;  
    }
}
