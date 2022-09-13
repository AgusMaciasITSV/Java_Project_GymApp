package Clases;

import java.util.ArrayList;

public class Dia {
    private ArrayList<Ejercicio> listaEjercicios;

    public Dia(ArrayList<Ejercicio> listaEjercicios) {
        this.listaEjercicios = listaEjercicios;
    }

    public ArrayList<Ejercicio> getListaEjercicios() {
        return listaEjercicios;
    }

    public void setListaEjercicios(ArrayList<Ejercicio> listaEjercicios) {
        this.listaEjercicios = listaEjercicios;
    }

    @Override
    public String toString() {
        return "Dia{" + "listaEjercicios=" + listaEjercicios + '}';
    }
    
    
}
