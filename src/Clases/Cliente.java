package Clases;

import java.util.ArrayList;

public class Cliente extends Usuario{
    private ArrayList<Plan> listaPlanes = new ArrayList();

    public Cliente(String usuario, Informacion informacion, String contraseña) {
        super(usuario, informacion, contraseña);
    }

    
    public ArrayList<Plan> getListaPlanes() {
        return listaPlanes;
    }

    public void setListaPlanes(ArrayList<Plan> listaPlanes) {
        this.listaPlanes = listaPlanes;
    }
}
