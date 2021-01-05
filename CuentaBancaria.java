
public class CuentaBancaria { 
   
 public static void main(String args[]){
  Principal misclientes[]= new Principal [0];
          
     misclientes [0] = new Principal ("Alessa Brito", "00246267",0.5, 50.00);
     
     
    for (Principal NoCliente: misclientes){
     System.out.println(NoCliente.mostrarDatos());
     System.out.println ("");
    }    

 }     
}

   

   
 
