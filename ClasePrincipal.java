
public class Principal {
    
    
    private String NoCliente;
    String numeroCuenta;
    double tipoInteres;
    double saldo;
 

    public Principal(String cliente, String numeroCuenta, double tipoInteres, double saldo) {
        this.NoCliente = NoCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
     }   
   
         public String getNoCliente ()
        {
          return NoCliente;
        }
        private void setNoCliente(String NoCliente)
        {
                this.NoCliente = NoCliente;
        }
        
        
         public String getnumeroCuenta()
        {
          return numeroCuenta;
        }
        public void setnumeroCuenta(String numeroCuenta)
        {
                this.numeroCuenta = numeroCuenta;
        }
        
         public String gettipoInteres(String tipoInteres, String gettipoInteres)
        {
          return gettipoInteres;
        }
         
        public void settipoInteres(double tipoInteres)
        {
                this.tipoInteres = tipoInteres;
        }

        public double getsaldo()
        {
                return saldo;
        }
        public void setsaldo(double saldo)
        {
                this.saldo = saldo;
        }
        
        
    
        public String mostrarDatos (){
return "Nombre del Cliente: "+ NoCliente+ "\nNúmero de Cuenta: "+ numeroCuenta + "\nTipo de Interés: " +tipoInteres + 
        "/nSu saldo es: " + saldo;

    
        
}
          
       
}
