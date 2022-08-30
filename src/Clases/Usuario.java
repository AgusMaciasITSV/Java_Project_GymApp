package Clases;

public class Usuario {
    private String usuario;
    private Informacion informacion;
    private String contraseña;

    public Usuario(String usuario, Informacion informacion, String contraseña) {
        this.usuario = usuario;
        this.informacion = informacion;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Informacion getInformacion() {
        return informacion;
    }

    public void setInformacion(Informacion informacion) {
        this.informacion = informacion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", informacion=" + informacion + ", contrase\u00f1a=" + contraseña + '}';
    }
}
