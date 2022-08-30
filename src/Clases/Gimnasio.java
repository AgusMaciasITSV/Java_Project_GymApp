package Clases;

import java.util.ArrayList;

public class Gimnasio {
    private ArrayList<Cliente> listaClientes = new ArrayList();
    private ArrayList<Entrenador> listaEntrenador = new ArrayList();
    private String codigoSeguridad = "12345";

   
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Entrenador> getListaEntrenador() {
        return listaEntrenador;
    }

    public void setListaEntrenador(ArrayList<Entrenador> listaEntrenador) {
        this.listaEntrenador = listaEntrenador;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
    
    

}
