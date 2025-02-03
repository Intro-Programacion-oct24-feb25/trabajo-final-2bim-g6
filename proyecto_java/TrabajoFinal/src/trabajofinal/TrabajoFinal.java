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
        int contadorActividades = 0;
        int[] contadorActividades1 = new int[7];
        boolean bandera = true;
        int opcion;;
        int totalParticipantes;

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
                    System.out.println("lo sentimos, el club no tiene esa opción.\n");
            }

            System.out.print("¿Desea salor del ciclo? Coloque(s) si desea salir del ciclo ");
            String respuesta = entrada.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                bandera = false;
            }

        }
        obtenerInformacion(contadorActividades1);
        obtenerReporte(contadorActividades);
    }

    public static void registrarParticipanteFutbol() {
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
        entrada.nextLine();
        System.out.println("Posicion preferidad:");
        posicion = entrada.nextLine();
        System.out.println("Ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Equipo favorito:");
        equipo = entrada.nextLine();

        mensaje = String.format("Futbol - Nombre:\n%sEdad: %d, Posición: %s, Ciudad: %s, Equipo: %s",
                nombre, edad, posicion, ciudad, equipo);

        System.out.println(mensaje);
    }

    public static void registrarParticipanteNatacion() {

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
        entrada.nextLine();
        System.out.println("Nivel (principiante, intermedio, avanzado):");
        nivel = entrada.nextLine();
        System.out.println("Ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Estilo favorito:");
        estilo = entrada.nextLine();

        mensaje = String.format("Natacion - Nombre:\n%sEdad: %d, Posición: %s, Ciudad: %s, Equipo: %s",
                nombre, edad, nivel, ciudad, estilo);

        System.out.println(mensaje);

    }

    public static void registrarParticipanteAtletismo() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String especialidad;
        String ciudad;
        int record;
        String mensaje;
        System.out.println("Nombre del participante:");
        nombre = entrada.nextLine();
        System.out.println("Edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Especialidad (carreras, salto, lanzamiento):");
        especialidad = entrada.nextLine();
        System.out.println("Ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Record personal:");
        record = entrada.nextInt();

        mensaje = String.format("Atletismo - Nombre:\n%sEdad: %d, Posición: %s, Ciudad: %s, Equipo: %s",
                nombre, edad, especialidad, ciudad, record);

        System.out.println(mensaje);

    }

    public static void registrarParticipanteBasquetbol() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String posicion;
        String ciudad;
        double estatura;
        String mensaje;
        System.out.println("Nombre del participante:");
        nombre = entrada.nextLine();
        System.out.println("Edad:");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Posicion preferidad:");
        posicion = entrada.nextLine();
        System.out.println("Ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Estatura:");
        estatura = entrada.nextDouble();

        mensaje = String.format("Basquetbol - Nombre:\n%sEdad: %d, Posición: %s, Ciudad: %s, Equipo: %s",
                nombre, edad, posicion, ciudad, estatura);

        System.out.println(mensaje);
    }

    public static void registrarParticipanteCiclismo() {
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
        entrada.nextLine();
        System.out.println("Tipo de ciclismo (montaña, ruta, urbano):");
        tipo = entrada.nextLine();
        System.out.println("Ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Marca de bicicleta favorita:");
        marca = entrada.nextLine();

        mensaje = String.format("Ciclismo - Nombre:\n%sEdad: %d, Posición: %s, Ciudad: %s, Equipo: %s",
                nombre, edad, tipo, ciudad, marca);

        System.out.println(mensaje);
    }

    public static void registrarParticipanteTenis() {
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
        entrada.nextLine();
        System.out.println("Nivel (principiante, intermedio, avanzado):");
        nivel = entrada.nextLine();
        System.out.println("Ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Mano hábil (derecha/izquierda):");
        mano = entrada.nextLine();

        mensaje = String.format("Tenis - Nombre:\n%sEdad: %d, Posición: %s, Ciudad: %s, Equipo: %s",
                nombre, edad, nivel, ciudad, mano);

        System.out.println(mensaje);

    }

    public static void registrarParticipanteYoga() {
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
        entrada.nextLine();
        System.out.println("Nivel (principiante, intermedio, avanzado):");
        nivel = entrada.nextLine();
        System.out.println("Ciudad:");
        ciudad = entrada.nextLine();
        System.out.println("Estilo de yoga preferido:");
        estilo = entrada.nextLine();

        mensaje = String.format("Yoga - Nombre:\n%sEdad: %d, Posición: %s, Ciudad: %s, Equipo: %s",
                nombre, edad, nivel, ciudad, estilo);

        System.out.println(mensaje);

    }

    public static int obtenerInformacion(int[] contadorActividades) {

        String[] deporte = {"Fútbol", "Natación", "Atletismo", "Básquetbol", "Ciclismo", "Tenis", "Yoga"};
        int totalParticipantes = 0;

        System.out.println("\nResumen Final:");
        for (int i = 0; i < contadorActividades.length; i++) {
            System.out.printf("%s: %d participantes\n", deporte[i], contadorActividades[i]);
            totalParticipantes = totalParticipantes + contadorActividades[i];

        }
        return totalParticipantes;
    }

    public static void obtenerReporte(int total) {
        System.out.println("\nReporte de Participación:");
        if (total == 0) {
            System.out.println("Mala campaña, debemos mejorar.");
        } else if (total <= 5) {
            System.out.println("Poca participación en el club, hay que mejorar.");
        } else if (total <= 15) {
            System.out.println("Buena participación, sigan así.");
        } else {
            System.out.println("Excelente campaña del club.");
        }

    }
}
