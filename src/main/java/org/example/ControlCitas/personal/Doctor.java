package org.example.ControlCitas.personal;

public class Doctor {

    public static int identificador = 0; // autoincrementado
    public String nombre;
    public String Especialidad;

    // comportamientos

    public void doctor(){
        System.out.println("creando objeto");
        identificador++;
    }
    public void imprimirNombre(){

        System.out.println("se llama " + nombre);
    }

    public void imprimirIdentificador(){
        System.out.println("identificador"+identificador);
    }
}
