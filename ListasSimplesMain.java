
package listassimples;


public class ListasSimplesMain {

    public static void main(String[] args) {
        
       ListaSimple lista = new ListaSimple();

      
		lista.insertaPrimerNodo("H");
		lista.insertaAntesPrimerNodo("O");
		lista.insertaAlFinal("Y");
		lista.insertaEntreNodos("R", "A");
		lista.imprimir();
		System.out.print(lista); 
        lista.insertaAlFinal("W");
        
        
                
        lista.imprimir();
        lista.insertarAntUlt("Z");
		System.out.print(lista); 
                System.out.println("");
                
                //buscar por posicion
                lista.buscarPosicion(3);
                 lista.buscarPosicion(0); 
                 lista.buscarPosicion(1); 
                 
                 System.out.println("");
             //intercambiar nodos
             System.out.println("Intercambiar");
             lista.intercambiarNodos("L", "A");
             lista.intercambiarNodos("O", "Z");
             
              lista.imprimir();
              
              
              
             
                 
    }
    
}
