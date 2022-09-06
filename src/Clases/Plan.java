package Clases;

import java.util.ArrayList;


public class Plan {
    private ArrayList<Dia> listaDias;

    public Plan(ArrayList<Dia> listaDias) {
        this.listaDias = listaDias;
    }

    public ArrayList<Dia> getListaDias() {
        return listaDias;
    }

    public void setListaDias(ArrayList<Dia> listaDias) {
        this.listaDias = listaDias;
    }
}
