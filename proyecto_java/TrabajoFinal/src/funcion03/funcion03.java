/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion03;

import java.util.Scanner;



/**
 *
 * @author utpl
 */
public class funcion03 {
     public static void funcion03() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String especialidad;
        String ciudad;
        String recordPersonal;

        System.out.println("Ingrese el nombre del participante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del participante: ");
        edad = entrada.nextInt();
        entrada.nextLine(); 
        System.out.println("Ingrese la especialidad del participante (Carreras, Salto, Lanzamiento): ");
        especialidad = entrada.nextLine();
        System.out.println("Ingrese la ciudad del participante: ");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese el record personal del participante: ");
        recordPersonal = entrada.nextLine();
        System.out.printf("Datos\nNombre: %s\nEdad: %d\nEspecialidad: %s\nCiudad: %s\nRecord personal: %s\n",
                nombre, edad, especialidad, ciudad, recordPersonal);
    }
}


       

    