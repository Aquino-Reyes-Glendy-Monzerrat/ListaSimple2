
package listassimples;

public class ListaSimple {
    
    Node top;

	//Métodos para los casos de inserción de nodos
	public boolean insertaPrimerNodo(String dato){
		if (top == null) { //La lista no está vacía
			top = new Node();
			top.name = dato;
			top.next = null;

			return true;
		}
		else {
			return false;
		}
	}

	public void insertaAntesPrimerNodo(String nombre){
		Node temp; 
		temp = new Node ();
		temp.name = nombre;
		temp.next = this.top;
		this.top = temp;
		temp = null;
	}

	public void insertaAlFinal(String nombre){
		Node temp = new Node ();
		temp.name = nombre;
		temp.next = null;
		//Node temp2;
		Node temp2 = this.top;

		while (temp2.next != null)
			temp2 = temp2.next;

		temp2.next = temp;
		temp = null;
		temp2 = null;
	}

	public boolean insertaEntreNodos(String nombre, String buscado){
		Node temp = new Node();
		temp.name = nombre;
		Node temp2 = this.top;

		//boolean NodoNoEncontrado = true;

		while ( (temp2 != null) 
				&& temp2.name.equals(buscado) == false ) {	
		         temp2 = temp2.next;
		}

		if (temp2 != null){  //Nodo buscado se encontró
			temp.next = temp2.next;
			temp2.next = temp;
			temp = null;
			temp2 = null;
			return true;
		}
		else return false;
	} 

	public void imprimir(){
		for (Node temp = this.top; temp != null; temp = temp.next){
			System.out.print("[ " + temp.name + " ] -> ");
		}

		System.out.print("[X]\n"); 
	}

	public String toString(){
		String cadAux = "";
		for (Node temp = this.top; temp != null; temp = temp.next){
			cadAux += "[ " + temp.name + " ] -> ";
		}

		cadAux += "[X]\n"; 

		return cadAux;
	}

	
	//Métodos de borrado
	public void borrarPrimerNodo(){
		this.top = this.top.next;
	}

	//Borrar cualquier nodo que no sea el primero
	public boolean borrarCualquierNodo(String buscado){
		Node temp = this.top;

		while ( (temp != null) 
				&& temp.name.equals(buscado) == false ) {	
		         temp = temp.next;
		}

		if (temp != null){  //Nodo buscado se encontró
			temp.next = temp.next.next;
			temp = null;
			
			return true;
		}
		else return false;
	}
    
  //////////////////////////////////////////////////////////////  
        
        //insrtar un nuevo nodo antes del ultiimo
    public void insertarAntUlt(String nombre) {
    Node temp = new Node();
    temp.name = nombre;
    temp.next = null;

    
    if (top == null) {
        top = temp;
        return;
    }

    
    Node penultimo = null;
    Node ultimo = top;

    while (ultimo.next != null) {
        penultimo = ultimo;
        ultimo = ultimo.next;
    }

    
    if (penultimo != null) {
        penultimo.next = temp;
        temp.next = ultimo;
    } else {
       
        temp.next = top;
        top = temp;
    }
}
    ////////////////////////////////////////////////////////////////////
     
     //buscr un nodo por su posicin   
        
     public void buscarPosicion(int posicion) {
   
     Node temp=top;
     int count =0;
     while (temp!=null)
     {
     if(count ==posicion){
         System.out.println("La posicion es " + count + " su datos es " + temp.name);
     break;
     }
     count++;
     temp=temp.next;
         }
         
     }
     
      
        
      //Intercambiar un nodo por otro buscado.  
      public void intercambiarNodos(String val1, String val2) {
    Node nodo1 = null, nodo2 = null;
    Node actual = top;

    while (actual != null) {
        if (actual.name.equals(val1)) {
            nodo1 = actual;
        } else if (actual.name.equals(val2)) {
            nodo2 = actual;
        }

        actual = actual.next;
    }

    
    if (nodo1 != null && nodo2 != null) {
      
        String temp = nodo1.name;
        
        nodo1.name = nodo2.name;
        
        nodo2.name = temp;
        
        System.out.println(" Los nodos se cambiaron");
        
    } else if (nodo1 == null && nodo2 == null) {
        
        System.out.println("Los nodos no existen");
        
        
    } else {
        
        
        if (nodo1 == null)
        
        {
            System.out.println("El nodo  :" + val1 + " no existe en la lista");
            
            
        }
        if (nodo2 == null) {
            
            
            System.out.println("El nodo : " + val2 + " no existe en la lista");
      
        }
   
 
    }
}   
            
    }
  
        
        
        
        
        
    

