/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajofinal;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class TrabajoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        int opcion;
        String respuesta;

        while (bandera) {
            System.out.println("\nMenú de Actividades:" + "\n1. Fútbol" + "\n2. Natación"
                    + "\n3. Atletismo" + "\n4. Básquetbol" + "\n5. Ciclismo" + "\n6. Tenis"
                    + "\n7. Yoga");
            System.out.println("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    registrarParticipanteFutbol();
                    break;
                case 2:
                    registrarParticipanteNatacion();
                    break;
                case 3:
                    registrarParticipanteAtletismo();
                    break;
                case 4:
                    registrarParticipanteBasquetbol();
                    break;
                case 5:
                    registrarParticipanteCiclismo();
                    break;
                case 6:
                    registrarParticipanteTenis();
                    break;
                case 7:
                    registrarParticipanteYoga();
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            System.out.print("\n¿Deseas salir del programa? (s/n): ");
            respuesta = entrada.nextLine();
            if (bandera = false) {
            }
        }

    }

    public static String registrarParticipanteFutbol() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String posicion;
        String ciudad;
        String equipo;
        String mensaje;
        System.out.println("Nombre del participante:");
        nombre = entrada.nextLine();
        System.out.println("Edad:");
        edad = entrada.nextInt();
        System.out.println("Posicion preferidad:");
        posicion = entrada.nextLine();
        System.out.println("Ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Equipo favorito:");
        equipo = entrada.nextLine();

        mensaje = String.format("Futbol - Nombre:\n%sEdad: %d, Posición: %s, Ciudad: %s, Equipo: %s",
                nombre, edad, posicion, ciudad, equipo);

        return mensaje;

    }

    public static String registrarParticipanteNatacion() {

        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String estilo;
        String mensaje;
        System.out.println("Nombre del participante:");
        nombre = entrada.nextLine();
        System.out.println("Edad:");
        edad = entrada.nextInt();
        System.out.println("Nivel (principiante, intermedio, avanzado):");
        nivel = entrada.nextLine();
        System.out.println("Ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Estilo favorito:");
        estilo = entrada.nextLine();

        mensaje = String.format("Futbol - Nombre:\n%sEdad: %d, Posición: %s, Ciudad: %s, Equipo: %s",
                nombre, edad, nivel, ciudad, estilo);

        return mensaje;

    }

    public static String registrarParticipanteAtletismo() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String especialidad;
        String ciudad;
        String record;
        String mensaje;
        System.out.println("Nombre del participante:");
        nombre = entrada.nextLine();
        System.out.println("Edad:");
        edad = entrada.nextInt();
        System.out.println("Especialidad (carreras, salto, lanzamiento):");
        especialidad = entrada.nextLine();
        System.out.println("Ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Record personal:");
        record = entrada.nextLine();

        mensaje = String.format("Futbol - Nombre:\n%sEdad: %d, Posición: %s, Ciudad: %s, Equipo: %s",
                nombre, edad, especialidad, ciudad, record);

        return mensaje;

    }

    public static String registrarParticipanteBasquetbol() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String posicion;
        String ciudad;
        String estatura;
        String mensaje;
        System.out.println("Nombre del participante:");
        nombre = entrada.nextLine();
        System.out.println("Edad:");
        edad = entrada.nextInt();
        System.out.println("Posicion preferidad:");
        posicion = entrada.nextLine();
        System.out.println("Ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Estatura:");
        estatura = entrada.nextLine();

        mensaje = String.format("Futbol - Nombre:\n%sEdad: %d, Posición: %s, Ciudad: %s, Equipo: %s",
                nombre, edad, posicion, ciudad, estatura);

        return mensaje;
    }

    public static String registrarParticipanteCiclismo() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String tipo;
        String ciudad;
        String marca;
        String mensaje;
        System.out.println("Nombre del participante:");
        nombre = entrada.nextLine();
        System.out.println("Edad:");
        edad = entrada.nextInt();
        System.out.println("Tipo de ciclismo (montaña, ruta, urbano):");
        tipo = entrada.nextLine();
        System.out.println("Ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Marca de bicicleta favorita:");
        marca = entrada.nextLine();

        mensaje = String.format("Futbol - Nombre:\n%sEdad: %d, Posición: %s, Ciudad: %s, Equipo: %s",
                nombre, edad, tipo, ciudad, marca);

        return mensaje;
    }

    public static String registrarParticipanteTenis() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String mano;
        String mensaje;
        System.out.println("Nombre del participante:");
        nombre = entrada.nextLine();
        System.out.println("Edad:");
        edad = entrada.nextInt();
        System.out.println("Nivel (principiante, intermedio, avanzado):");
        nivel = entrada.nextLine();
        System.out.println("Ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Mano hábil (derecha/izquierda):");
        mano = entrada.nextLine();

        mensaje = String.format("Futbol - Nombre:\n%sEdad: %d, Posición: %s, Ciudad: %s, Equipo: %s",
                nombre, edad, nivel, ciudad, mano);

        return mensaje;

    }

    public static String registrarParticipanteYoga() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String nivel;
        String ciudad;
        String estilo;
        String mensaje;
        System.out.println("Nombre del participante:");
        nombre = entrada.nextLine();
        System.out.println("Edad:");
        edad = entrada.nextInt();
        System.out.println("Nivel (principiante, intermedio, avanzado):");
        nivel = entrada.nextLine();
        System.out.println("Ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Estilo de yoga preferido:");
        estilo = entrada.nextLine();

        mensaje = String.format("Futbol - Nombre:\n%sEdad: %d, Posición: %s, Ciudad: %s, Equipo: %s",
                nombre, edad, nivel, ciudad, estilo);

        return mensaje;

    }

    public static String obtenerInformacion(int total) {
        if (total == 0) {
            System.out.println("Mala campaña, debemos mejorar.");
        } else if (total <= 5) {
            System.out.println("Poca participación en el club, hay que mejorar.");
        } else if (total <= 15) {
            System.out.println("Buena participación, sigan así.");
        } else {
            System.out.println("Excelente campaña del club.");
        }
        return null;
    }
}
