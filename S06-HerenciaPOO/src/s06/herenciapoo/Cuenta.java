
package s06.herenciapoo;

/**
 *
 * @author UCC
 */
public class Cuenta {
 
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;
    protected float saldo;
    
    public Cuenta(float saldo, float tasaAnual){
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    
    public void consignar(float cantidad){
        saldo += cantidad;
        numeroConsignaciones ++;
    }
    
    public void retirar(float cantidad){
        if(cantidad > saldo){
            System.out.println("No puede retirar la cantidad, por excede el saldo");
        }else{
            saldo -= cantidad;
            numeroRetiros++;
        }
    }
    
    public void calcularInteres(){
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo += interesMensual;
    }
    public void extractoMensual(){
        saldo -= comisionMensual;
        calcularInteres();
        
    }
}
