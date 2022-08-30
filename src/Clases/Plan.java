package Clases;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


public class Plan {
    private ArrayList<ArrayList<Ejercicio>> listaDias;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private long cantidadDias;

    public Plan(ArrayList<ArrayList<Ejercicio>> listaDias, LocalDate fechaInicio, LocalDate fechaFinal, int cantidadDias) {
        this.listaDias = listaDias;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cantidadDias = ChronoUnit.DAYS.between(fechaInicio, fechaFinal);
    }

    public ArrayList<ArrayList<Ejercicio>> getListaDias() {
        return listaDias;
    }

    public void setListaDias(ArrayList<ArrayList<Ejercicio>> listaDias) {
        this.listaDias = listaDias;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public long getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }
}
