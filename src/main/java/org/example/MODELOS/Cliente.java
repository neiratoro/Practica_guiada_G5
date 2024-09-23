package org.example.MODELOS;

public class Cliente {
     private String nombre;
     private String identificacion;
     private Integer edad;
    private String direcccion;
    private String telefono;

    // construcctor vacio
    public Cliente() {
    }

    public Cliente(String nombre, String identificacion, Integer edad, String direcccion, String telefono) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.direcccion = direcccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDirecccion() {
        return direcccion;
    }

    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
