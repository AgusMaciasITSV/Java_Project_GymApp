package Clases;

import java.util.ArrayList;

public class Cliente extends Usuario{
    private ArrayList<Plan> listaPlanes = new ArrayList();

    public Cliente(String usuario, Informacion informacion, String contraseña, ArrayList<Plan> listaPlanes) {
        super(usuario, informacion, contraseña);
        this.listaPlanes = listaPlanes;
    }

    
    public ArrayList<Plan> getListaPlanes() {
        return listaPlanes;
    }

    public void setListaPlanes(ArrayList<Plan> listaPlanes) {
        this.listaPlanes = listaPlanes;
    }
}
