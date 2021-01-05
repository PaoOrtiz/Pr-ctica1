
package Eje1;


public class ReinoA {

    public class reinoAnimal extends Reino {
     private String reino;
     
     
     public reinoAnimal(String reino, String nombreEspecie, String nombreComún) {
     super (reino, nombreEspecie, nombreComún);
      }
   
     @Override
   public String mostrarDatos () {
    return "Nombre del Reino: "+reino+ "\n Nombre Científico: "+nombreCientífico+ "\nnombreComún: " +nombreComún;
     } 

    }
}
    
   
