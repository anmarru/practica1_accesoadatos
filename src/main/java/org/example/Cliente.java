package org.example;

public class Cliente {

    private String id;
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String contraseña;
    private boolean esAdmin=false;

    public Cliente(String id, String dni, String nombre, String direccion, String telefono, String email, String contraseña) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return (esAdmin ? "Administrador " : "Cliente ")+ id+ nombre+ direccion+ telefono+ email+ contraseña;
    }

    public Boolean getEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(Boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    public String getId() {
        return id;
    }


    public String getDni() {
        return dni;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
