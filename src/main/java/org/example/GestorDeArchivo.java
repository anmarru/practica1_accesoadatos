package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorDeArchivo {

    public static List<Cliente> lerrCliente()throws IOException {

        List<Cliente> listaCliente= new ArrayList<>();

        try(BufferedReader reader=new BufferedReader(new FileReader("clientes.txt"))) {
            String linea;
            while ((linea= reader.readLine()) !=null){
                String[] campos= linea.split("[;,|]");
                //quito espacios
                for(int i=0; i<campos.length;i++){
                    campos[i]= campos[i].trim();
                }

                String id= campos[0];
                String dni=campos[1];
                String nombre=campos[2];
                String direccion= campos[3];
                String telefono= campos[4];
                String  email= campos [5];
                String contraseña= campos[6];
                boolean esAdmin= Boolean.parseBoolean(campos[7]);

                //retorno un cliente o un admin
                if(esAdmin){
                     Administrador administrador=  new Administrador(id,dni,nombre,direccion,telefono,email,contraseña);
                    listaCliente.add(administrador);
                }else {
                    Cliente cliente= new Cliente(id,dni,nombre,direccion,telefono,email,contraseña);
                    listaCliente.add(cliente);
                }


            }
        }catch (IOException e){
            System.out.println("EARROR AL LEER EL ARCHIVO: "+ e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Error de formato en el archivo: "+ e.getMessage());
        }
        return listaCliente;
    }
}
