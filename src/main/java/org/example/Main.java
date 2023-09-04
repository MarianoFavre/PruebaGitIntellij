package org.example;

public class Main {
    public static void main(String[] args) {
        Mensaje msj = new Mensaje();
        String nombre = msj.solicitaDatos("Ingrese tu nombre: ");
        String apellidos = msj.solicitaDatos("Ingrese tus apellidos: ");
        Persona p = new Persona(nombre, apellidos);
        msj.saludar(p);
    }
}