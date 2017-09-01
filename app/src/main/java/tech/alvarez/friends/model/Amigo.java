package tech.alvarez.friends.model;

public class Amigo {

    private String fotoURL;
    private String nombre;
    private String telefono;

    public Amigo(String fotoURL, String nombre, String telefono) {
        this.fotoURL = fotoURL;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getFotoURL() {
        return fotoURL;
    }

    public void setFotoURL(String fotoURL) {
        this.fotoURL = fotoURL;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
