
package javaapplication1;


public class Principal {
    
    public static void main (String[] args) {
    Reino losreinos[] = new Reino [3]; 

     losreinos [0] = new Reino ("Animal", "Animalia", "Reino Animal");
     losreinos [1] = new ReinoVegetal ("Vegetal", "Plantae", "Reino Vegetal");
     losreinos [2] = new reinoFungi ("Fungi", "Fungis", "Hongos");
 

     for(Reino reino: losreinos){
     System.out.println(reino.mostrarDatos());
     System.out.println ("");
     
     }
    }

    private static class reinoFungi extends Reino {

        public reinoFungi(String fungi, String fungi0, String hongos) {
            super( fungi, fungi0, hongos);
        }
    }

    private static class ReinoVegetal extends Reino {

        public ReinoVegetal(String vegetal, String plantae, String reino_Vegetal) {
            super (vegetal, plantae,reino_Vegetal);
        }
    }

   
    }
  




