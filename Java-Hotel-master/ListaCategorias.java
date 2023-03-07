//Clase ListaCategorias que hereda de LinkedList para guardar las categorias.
//Hereda todos los métodos para añadir/modificar/eliminar de la lista.

import java.util.*;
import java.io.*;

public class ListaCategorias extends LinkedList implements Enumeration, Serializable {
    
    public ListaCategorias() {
    }//Constructor

    //Devuelve el siguiente elemento de la lista (INTERFACE).
    public Object nextElement() {
        return null;
    }//nextElement
    
    //Devuelve si la lista tiene más elementos (INTERFACE).
    public boolean hasMoreElements() {
        return false;
    }//hasMoreElements
    
}//ListaPrecios