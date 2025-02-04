/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcion03;


/**
 *
 * @author utpl
 */
import java.util.Scanner;

public class funcion03 {
    public static String  funcion03(String cadena) {
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
        
       
       cadena = String.format("""
                          %sDeporte: Natacion
                          Resumen: 
                          Nombre: %s
                          Edad: %d
                          Ciudad: %s
                          Especialidad: %s
                          Record Personal:%s 
                          """, cadena, nombre, edad, ciudad, especialidad, recordPersonal);
        return cadena;

    }
}