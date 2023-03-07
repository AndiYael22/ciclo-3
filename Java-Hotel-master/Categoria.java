//Clase Categoria sirve para almacenar los datos de cada categoria.
//Las categorias se almacenan en ListaCategorias.

import java.io.*;

public class Categoria implements Serializable {
    
    public String idCategoria;
    public int    precioCategoria;
    public String descripcionCategoria;
    
    public Categoria(String idCategoria, int precioCategoria,
                     String descripcionCategoria) {
        this.idCategoria     = idCategoria;
        this.precioCategoria = precioCategoria;
        this.descripcionCategoria = descripcionCategoria;
    }//Constructor
    
}//Categoria