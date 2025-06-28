
package s06.herenciapoo;

/**
 *
 * @author UCC
 */
public class CuentaAhorros extends Cuenta {
    private boolean activa;
    
    public CuentaAhorros(float saldo, float tasa){
        super(saldo,tasa);
        if(saldo < 10000){
        activa = false ;
        }else{
            activa = true;
            }
    }
    public void retirar(float cantidad){ 
        if(activa){
            super.retirar(cantidad);
        }
    }
    
    public void consignar(float cantidad){
        if(activa){
            super.consignar(cantidad);
        }
    }
    
    public void estractoMensual(){
        if(numeroRetiros > 4){
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual();
        activa = saldo < 10000;
    }
    
    public void imprimir(){
        System.out.println("Saldo " + saldo);
        System.out.println("Comision Mensual: " + comisionMensual);
        System.out.println("Numero de transaccion : " + (numeroConsignaciones + numeroRetiros));
        System.out.println("");
    }
}
