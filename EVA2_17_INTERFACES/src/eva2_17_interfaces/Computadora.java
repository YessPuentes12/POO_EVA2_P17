/*

 */
package eva2_17_interfaces;


public class Computadora extends Producto implements MostrarDatos{
    
  private String procesador;    
  private int memoria;   

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
//------------------------------------------------------------------------------
    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
//------------------------------------------------------------------------------   

    public Computadora(String procesador, int memoria, double precio, String nombre) {
        super(precio, nombre);
        this.procesador = procesador;
        this.memoria = memoria;
    }
//------------------------------------------------------------------------------
    public Computadora() {

    }
     
 //------------------------------------------------------------------------------   
    
   @Override 
    
   public void imprimirDatos(){
       System.out.println("Nombre: " +getNombre());
       System.out.println("Precio: " +getPrecio());
       System.out.println("Procesador: " +procesador);
       System.out.println("Memoria: " +memoria);
   } 
    
    
    
    
    
    
    
    
    
    
}
