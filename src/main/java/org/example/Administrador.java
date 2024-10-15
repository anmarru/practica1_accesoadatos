package org.example;

public class Administrador extends  Cliente{

    public Administrador(String id, String dni, String nombre, String direccion, String telefono, String email, String contraseña) {
        super(id, dni, nombre, direccion, telefono, email, contraseña);
        setEsAdmin(true);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
