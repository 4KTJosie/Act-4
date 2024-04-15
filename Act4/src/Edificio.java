/*Actividad: Tomando como base la Actividad elaborar una aplicación de consola que permita almacenar información sobre un visitante a un edifiCi0 de departamentos utilizando todos los tipos de datos primitivos en Java. Diseña un
programa que lea por teclado todas las Visitas que realice dicha persona durante una semana y que al final calcule la cantidad total de visitas, el tiempo prornedi0 de estadía de todas las visitas, y Si la persona es mayor o menor de edad.
ya no se admiten valores constantes.*/

import java.util.Scanner;

class Edificio {
    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);

        String nom;
        String ape;
        String ced;
        byte edad;
        char gen;
        String mayor;
        String menor;

        int[] visitasPorDia = new int[7];
        int totalVisitas = 0;


        //entrada
        System.out.println("\nBienvenido a LA 15 PISOS ");
        System.out.println("\nCuál es su nombre?: ");
        nom = j.nextLine();
        System.out.println("Cuál es su apellido?: ");
        ape = j.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = j.nextByte();

        j.nextLine();
        System.out.println("Ingrese su cédula: ");
        ced = j.nextLine();

        do {
            System.out.println("Ingrese su género (masculino[M]/femenino[F]");
            gen = Character.toLowerCase(j.next().charAt(0));
            if (gen != 'm' && gen != 'f') {
                System.out.println("OMBE, pon una M si eres hombre o una F si eres mujer, seriedad por favor..");
            }
        } while (gen != 'm' && gen != 'f');

        for (int i = 0; i < visitasPorDia.length; i++) {
            System.out.println("Ingrese la cantidad de vistas del día: ");
            visitasPorDia[i] = j.nextInt();
            totalVisitas += visitasPorDia[i];
        }

        int totalDias = visitasPorDia.length;
        double promedioEstadia = (double) totalVisitas / totalDias;

        //salida
        System.out.println("El usuario es: " + nom + " " + ape);
        System.out.println("Tiene " + edad + " años");
        System.out.println("Con cédula de identidad: " + ced);
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("es menor de edad");
        }
        if (gen == 'm') {
            System.out.println("Género masculino");
        } else {
            System.out.println("Género femenino");
        }

        System.out.println("Total de visitas realizadas durante la semana: " + totalVisitas);
        System.out.printf("Tiempo promedio de estadía: " + promedioEstadia + " visitas por día");

    }
}



