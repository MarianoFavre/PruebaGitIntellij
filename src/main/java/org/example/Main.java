package org.example;

public class Main {
    public static void main(String[] args) {
        Mensaje msj = new Mensaje();
        String nombre = msj.solicitaDatos("Ingrese tu nombre: ");
        msj.saludar(nombre);
    }
}