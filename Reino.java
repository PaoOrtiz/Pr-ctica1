
package Eje1;

public class Reino {
         private String reino;
         String nombreCientífico;
         String nombreComún;

  public Reino (String reino, String nombreEspecie, String nombreComún) {
         this.reino = reino;
         this.nombreCientífico = nombreEspecie;
         this.nombreComún = nombreComún;

}   

public String  getnombreEspecie() {
        return nombreCientífico;
}

public String getnombreComún (){
        return nombreComún;
}

public String mostrarDatos (){
return "Nombre del Reino: "+ reino+ "\nNombre Científico: "+ nombreCientífico + "\nNombre Común: " +nombreComún;

}
}



