package org.example.ControlCitas.usuarios;

public class Paciente {

    public String nombre;
    public String email;
    String addres;
    String numeroCelular;
    String cumpleaños;
    private double altura;
    private double peso;
    String sangre;

    public void paciente (String nombre , String email  ){
        this.nombre=nombre;
        this.email=email;
    }
}
