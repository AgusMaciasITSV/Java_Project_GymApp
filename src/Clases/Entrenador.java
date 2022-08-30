package Clases;

import java.util.ArrayList;

public class Entrenador extends Usuario{
    private ArrayList<Cliente> listaClientes;
    
    public Entrenador(ArrayList<Cliente> listaClientes, String usuario, Informacion informacion, String contraseña) {
        super(usuario, informacion, contraseña);
        this.listaClientes = listaClientes;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
}
