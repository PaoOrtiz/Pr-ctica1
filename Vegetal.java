
package Eje1;


public class Vegetal {

    private static class ReinoVegetal extends Reino {
    private String reino;
    
    
    public ReinoVegetal(String reino, String nombreEspecie, String nombreComún) {
    super (reino, nombreEspecie, nombreComún);
    
    }
    
    @Override
   public String mostrarDatos (){
   return "Nombre del Reino: "+ reino+ "n\nombreEspecie: "+nombreCientífico
           +"\nnombreComún: " +nombreComún;

}

}
}


