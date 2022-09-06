package Clases;

public class Ejercicio {
    private String nombreEjercicio;
    private int Repeticiones;
    private int Series;

    public Ejercicio(String nombreEjercicio, int Repeticiones, int Series) {
        this.nombreEjercicio = nombreEjercicio;
        this.Repeticiones = Repeticiones;
        this.Series = Series;
    }
    
    public String getNombreEjercicio() {
        return nombreEjercicio;
    }

    public void setNombreEjercicio(String nombreEjercicio) {
        this.nombreEjercicio = nombreEjercicio;
    }

    public int getRepeticiones() {
        return Repeticiones;
    }

    public void setRepeticiones(int Repeticiones) {
        this.Repeticiones = Repeticiones;
    }

    public int getSeries() {
        return Series;
    }

    public void setSeries(int Series) {
        this.Series = Series;
    }

    @Override
    public String toString() {
        return "Ejercicio{" + "nombreEjercicio=" + nombreEjercicio + ", Repeticiones=" + Repeticiones + ", Series=" + Series + '}';
    }
    
    
    
}
