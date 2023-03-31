package edu.ucj.programacion.pec1_Ignacio_FdezdeValderrama;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UtilsColegio { 
    public static List<Alumno> crearAlumnos(int numAlumnos) {   // Listas de datos para facilitar el proceso
        List<String> nombres = new ArrayList<>(List.of(           
                "Carlos", "Sofía", "Pablo", "Laura", "José", "María", "Miguel", "Ana", "Diego", "Natalia",
                "Pedro", "Elena", "Juan", "Lucía", "Antonio", "Cristina", "Javier", "Isabel", "Rubén", "Olga"
        ));
        List<String> apellidos = new ArrayList<>(List.of(
                "García", "Rodríguez", "Martínez", "Fernández", "González", "López", "Sánchez", "Pérez", "Gómez", "Romero",
                "Jiménez", "Ruiz", "Navarro", "Molina", "Díaz", "Torres", "Vega", "Moreno", "Alonso", "Hernández"
        ));
        List<String> dniss = new ArrayList<>(List.of(
                "12345678A", "23456789B", "34567890C", "45678901D", "56789012E",
                "67890123F", "78901234G", "89012345H", "90123456I", "01234567J",
                "23456789K", "34567890L", "45678901M", "56789012N", "67890123O",
                "78901234P", "89012345Q", "90123456R", "01234567S", "12345678T"
        ));

        List<Alumno> alumnos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);   // creamos un objeto para escanear la consola cuando se introduzcan cosas. 

        for (int i = 0; i < numAlumnos; i++) {
            //System.out.println("Introduce los datos del alumno " );
        	//System.out.print("Nombre: ");
            String nombre = nombres.get((int) (Math.random() * nombres.size()));     // Asignamos un nombre de la lista cogiendo uno aleatoriamente 
            //System.out.print("Apellidos: ");
            String apellido1 = apellidos.get((int) (Math.random() * apellidos.size()));
            String apellido2 = apellidos.get((int) (Math.random() * apellidos.size()));
            //System.out.print("DNI: ");
            //String dni = scanner.nextLine();
            String dni = dniss.get((int) (Math.random() * dniss.size())); 
            alumnos.add(new Alumno(nombre, apellido1 + " " + apellido2, dni));      //Creamos el objeto Alumno  con los datos escogidos
        }

        return alumnos;
    }
}