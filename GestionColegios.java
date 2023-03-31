package edu.ucj.programacion.pec1_Ignacio_FdezdeValderrama;

import java.util.List;

public class GestionColegios {

	public static void main(String[] args) {

		int numAulas = Integer.valueOf(args[2]);    
		int numAlumnos = Integer.valueOf(args[3]);
		Colegio colegio = new Colegio(args[0], args[1], numAulas);   //Creamos el colegio a partir de los argumentos previamente introduciods en configurations
		AsignacionSitios(colegio, numAlumnos);                       
	}

	public static void AsignacionSitios(Colegio colegio, int numAlumnos) {
		List<Alumno> listaAlumnos = UtilsColegio.crearAlumnos(numAlumnos);  // con los alumnos creados hacemos  una lista
		for (int j = 0; j < numAlumnos; j++) {
			colegio.agregar_alumno(listaAlumnos.get(j));                    // llamas a cada alumno de la lista y le asignas un sitio a traves del metodo agregar alumno en colegio
		}
	}

}