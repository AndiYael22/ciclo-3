//Clase Cliente para almacenar los datos de cada cliente.
//Esta clase nos permite almacenar los datos de cada uno de los clientes que se llegan a hospedar al hotel para poder llevar un control y un orden sobre las habitaciones y las personas que se quedan en el hotel
import java.util.*;
import java.io.*;

public class Cliente implements Serializable {
    
    String     dniCliente;
    String     nombreCliente;
    String     apellido1Cliente;
    String     apellido2Cliente;
    String     direccionCliente;
    Date       fechaEntrada;
    Date       fechaSalida;
    int        numeroHabitacion;
    
    public Cliente(String dniCliente, String nombreCliente,
                   String apellido1Cliente, String apellido2Cliente,
                   String direccionCliente, Date fechaEntrada,
                   Date fechaSalida, int numeroHabitacion) {
        this.dniCliente       = dniCliente;
        this.nombreCliente    = nombreCliente;
        this.apellido1Cliente = apellido1Cliente;
        this.apellido2Cliente = apellido2Cliente;
        this.direccionCliente = direccionCliente;
        this.fechaEntrada     = fechaEntrada;
        this.fechaSalida      = fechaSalida;
        this.numeroHabitacion = numeroHabitacion;
    }//Constructor
    
}//Cliente