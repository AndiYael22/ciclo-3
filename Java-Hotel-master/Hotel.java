//Clase Hotel que se encarga de gestionar las listas.
//El objeto Hotel es el que se guardar� a disco.

import java.io.*;

public class Hotel {
    
    //Fichero de datos.
    public String            nombreFichero;
    //Lista de clientes.
    public ListaClientes     listaClientes;
    //Lista de habitaciones.
    public ListaHabitaciones listaHabitaciones;
    //Lista de categor�as.
    public ListaCategorias   listaCategorias;
    //Objeto de salida a disco.
    ObjectOutputStream streamSalida;
    //Objeto de entrada desde disco.
    ObjectInputStream streamEntrada;
    
    public Hotel() {
        this.nombreFichero     = "DATOS.TXT";
        this.listaClientes     = new ListaClientes();
        this.listaHabitaciones = new ListaHabitaciones();
        this.listaCategorias   = new ListaCategorias();
    }//Constructor
    
    //Se crean las 3 categor�as fijas existentes en el Hotel.
    //El n�mero de categor�as es fijo.
    public void crearCategoriasPorDefecto() {
        Categoria categoria1 = new Categoria("A", 100, "Clase Alta");
        Categoria categoria2 = new Categoria("B", 50, "Clase Media");
        Categoria categoria3 = new Categoria("C", 30, "Clase Baja");
        
        listaCategorias.addLast(categoria1);
        listaCategorias.addLast(categoria2);
        listaCategorias.addLast(categoria3);
    }//crearCategorias
    
    //Se modifican los datos de una categoria por el �ndice.
    public void modificarCategoria(int indice, String nombreCategoria, 
                                   int precioCategoria,
                                   String descripcionCategoria) {
        ((Categoria)listaCategorias.get(indice)).idCategoria = nombreCategoria;
        ((Categoria)listaCategorias.get(indice)).precioCategoria = precioCategoria;
        ((Categoria)listaCategorias.get(indice)).descripcionCategoria = descripcionCategoria;
    }//modificarCategoria
    
    //A�ade una nueva categor�a.
    public void nuevaCategoria(String nombreCategoria, int precioCategoria,
                               String descripcionCategoria) {
        listaCategorias.add(new Categoria(nombreCategoria, precioCategoria, descripcionCategoria));
    }//nuevaCategoria
    
    //Elimina una categor�a en base al �ndice de la lista.
    public void eliminarCategoria(int indice) {
        listaCategorias.remove(indice);
    }//nuevaCategoria
    
    //Devuelve el objeto categor�a correspondiente al �ndice.
    public Categoria tomarCategoria(int indice) {
        return (Categoria)listaCategorias.get(indice);
    }//tomarCategoria
    
    //Se a�ade un nuevo cliente a la lista de clientes.
    public void nuevoCliente(String dniCliente, String nombreCliente,
                              String apellido1Cliente, String apellido2Cliente,
                              String direccionCliente, int numeroHabitacion,
                              java.util.Date fechaEntrada,
                              java.util.Date fechaSalida) {
        listaClientes.add(new Cliente(dniCliente, nombreCliente,
                                      apellido1Cliente, apellido2Cliente, 
                                      direccionCliente, fechaEntrada,
                                      fechaSalida, numeroHabitacion));
        
    }//a�adirCliente
    
    //Se modifican los datos de un cliente por el �ndice.
    public void modificarCliente(int indice, String dniCliente,
                                   String nombreCliente, String apellido1Cliente,
                                   String apellido2Cliente, String direccionCliente,
                                   int numeroHabitacion, java.util.Date fechaEntrada,
                                   java.util.Date fechaSalida) {
        ((Cliente)listaClientes.get(indice)).dniCliente = dniCliente;
        ((Cliente)listaClientes.get(indice)).nombreCliente = nombreCliente;
        ((Cliente)listaClientes.get(indice)).apellido1Cliente = apellido1Cliente;
        ((Cliente)listaClientes.get(indice)).apellido2Cliente = apellido2Cliente;
        ((Cliente)listaClientes.get(indice)).direccionCliente = direccionCliente;
        ((Cliente)listaClientes.get(indice)).numeroHabitacion = numeroHabitacion;
        ((Cliente)listaClientes.get(indice)).fechaEntrada = fechaEntrada;
        ((Cliente)listaClientes.get(indice)).fechaSalida = fechaSalida;
    }//modificarCategoria
    
    //Devuelve el objeto cliente correspondiente al �ndice.
    public Cliente tomarCliente(int indice) {
        return (Cliente)listaClientes.get(indice);
    }//tomarCliente
    
    //Se elimina un cliente de la lista de clientes.
    public void eliminarCliente(int indice) {
        listaClientes.remove(indice);
    }//eliminarCliente
    
    //Se salva las listas de clientes y de categor�as.
    public void salvarClientesCategorias() {
        try {
            streamSalida = new ObjectOutputStream(new FileOutputStream(nombreFichero));
        } catch(Exception e) {
            System.out.println("Error al abrir el archivo.");
        }//try-catch
        try {
            streamSalida.writeObject(listaClientes);
            streamSalida.writeObject(listaCategorias);
        } catch(Exception e) {
            System.out.println("Imposible salvar las listas a disco.");
        }//try-catch
        try {
            streamSalida.close();
            System.out.println("Las listas han sido salvadas con exito.");
        } catch(Exception e) {
            System.out.println("Error al cerrar el archivo.");
        }//try-catch
    }//salvarClientes
    
    //Se carga las listas de clientes y de categor�as.
    public void cargarClientesCategorias() {
        try {
            streamEntrada = new ObjectInputStream(new FileInputStream(nombreFichero));
        } catch(Exception e) {
            System.out.println("Error al abrir el archivo.");
        }//try-catch
        try {
            listaClientes = (ListaClientes)streamEntrada.readObject();
            listaCategorias = (ListaCategorias)streamEntrada.readObject();
        } catch(Exception e) {
            System.out.println("Imposible cargar las listas desde disco.");
        }//try-catch
        try {
            streamEntrada.close();
            System.out.println("Las listas han sido cargadas con exito.");
        } catch(Exception e) {
            System.out.println("Error al cerrar el archivo.");
        }//try-catch
    }//cargarClientes
    
}//Hotel