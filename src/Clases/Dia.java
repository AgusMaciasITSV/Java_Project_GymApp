package Clases;

import java.util.ArrayList;

public class Dia {
    private ArrayList<Ejercicio> listaEjercicios;

    public Dia(ArrayList<Ejercicio> listaEjercicios) {
        this.listaEjercicios = listaEjercicios;
    }
    
    public Ejercicio getEjercicioDeLista(int indice) {
        return listaEjercicios.get(indice);
    }
    public void setEjercicioALista(int indice, Ejercicio ejecicio) {
        listaEjercicios.set(indice, ejecicio);
    }
    public void addEjercicioALista(Ejercicio ejercicio) {
        listaEjercicios.add(ejercicio);
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
