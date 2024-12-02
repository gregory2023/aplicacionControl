package org.example.ControlCitas.usuarios;

public class Paciente {

    public String nombre;
    private String email;
    private String addres;
    private String numeroCelular;
    private String cumpleaños;
    private double altura;
    private double peso;
    private String sangre;

    public Paciente() {
        this.nombre = nombre;
        this.email = email;
        this.addres = addres;
        this.numeroCelular = numeroCelular;
        this.cumpleaños = cumpleaños;
        this.altura = altura;
        this.peso = peso;
        this.sangre = sangre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
        if(numeroCelular.length()>8){
            System.out.println("NO SE PUEDE ");
        }
    }

    public String getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(String cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    public double getAltura() {
        return altura;
    }

    public String setAltura(double altura) {
        return this.altura + "CM";
    }

    public double getPeso() {
        return peso;
    }

    public String setPeso(double peso) {
        return this.peso + "kg";
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }
}
