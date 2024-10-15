package org.example;

import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        try{
            List<Cliente> clientes= GestorDeArchivo.lerrCliente();
            clientes.forEach(System.out::println);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}