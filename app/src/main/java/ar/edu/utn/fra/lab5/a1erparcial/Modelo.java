package ar.edu.utn.fra.lab5.a1erparcial;

/**
 * Created by lkdml on 03/10/2017.
 */

public class Modelo {
    private String Nombre;
    private String Apellido;
    private String telefono;

    public Modelo(String nombre, String apellido, String telefono) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
