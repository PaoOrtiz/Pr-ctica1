
public class NoCliente {

 
    public  class Principal extends CuentaBancaria{
     private String Principal;
     public Principal (String NoCliente, String numeroCuenta, double tipoInteres, double saldo) {
     super ( numeroCuenta, tipoInteres, saldo);
      }
   
   public String mostrarDatos () {
   return "Nombre del Cliente: "+ Principal+ "\nNúmero de Cuenta: "+ Principal + "\nTipo de Interés: " +Principal + 
        "/nSu saldo es: " + Principal;
     } 

    }
}
