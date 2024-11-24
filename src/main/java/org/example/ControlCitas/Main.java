package org.example.ControlCitas;


import org.example.ControlCitas.personal.Doctor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Doctor miDoctor = new Doctor();

        miDoctor.nombre = "amelie";
        miDoctor.imprimirNombre();
    }
}