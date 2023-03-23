/*

 */
package eva2_17_interfaces;


public class EVA2_17_INTERFACES {


    public static void main(String[] args) {
        
    //MostrarDatos data = new MostrarDatos();  
    //No se puede crear objetos   
        
    Persona perso = new Persona("Yessly",18);   
    perso.imprimirDatos();
    
    Computadora compu = new Computadora("intel i7",12,25000,"Computadora");
    compu.imprimirDatos();
        
    }
    
}
