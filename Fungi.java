
package Eje1;


public class Fungi {
    
    
     private static class reinoFungi extends Reino{
    private String reino;

    public reinoFungi(String reino, String nombreEspecie, String nombreComún) {
     super (reino, nombreEspecie, nombreComún);
      }

@Override
public String mostrarDatos (){
return "Nombre del Reino: "+ reino+ "n\nombreEspecie: "+nombreCientífico+"\nnombreComún: " +nombreComún;
    
}
}
}
