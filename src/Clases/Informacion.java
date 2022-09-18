package Clases;

public class Informacion {
    private String nombre_apellido;
    private int edad;

    public Informacion(String nombre_apellido, int edad) {
        this.nombre_apellido = nombre_apellido;
        this.edad = edad;
    }
    
    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }
    
    public String getNombre() {
        String[] nombreApellido = nombre_apellido.split("_");
        return nombreApellido[0];
    }
    
    public String getApellido() {
        String[] nombreApellido = nombre_apellido.split("_");
        return nombreApellido[1];
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        return "Informacion{" + "nombre_apellido=" + nombre_apellido + ", edad=" + edad + '}';
    }
}
