package org.example.ControlCitas.Menu;

import java.util.Scanner;

public class menu {

    public static final String[] meses = {"enero" , "febrero" , "marzo" , "abril" , "mayo" , "junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    public static void showMenu(){
        System.out.println("Bienvenida a mi aplicacion de contro de citas");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. paciente");
            System.out.println("0. Salir");

            Scanner Entrada = new Scanner(System.in);
            response = Integer.valueOf(Entrada.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("paciente");
            System.out.println("1. libro de consultas para los proximos tres meses");
            System.out.println("2. mi consulta");
            System.out.println("0. volver");

            Scanner Entrada = new Scanner(System.in);
            response = Integer.valueOf(Entrada.nextLine());

            switch (response){
                case 1:
                    for (int i = 0; i <3 ; i++) {
                        System.out.println((i+1) + "." + meses[i]);
                    }
                    break;
                case 2:
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
