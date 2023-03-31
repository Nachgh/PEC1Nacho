package edu.ucj.programacion.pec1_Ignacio_FdezdeValderrama;

public class Aula {
	private int numero  ;
	private int planta ;
	private Alumno[] asientos;

	public Aula(int numero, int planta) {
		this.numero = numero;
		this.planta = planta;
		this.asientos = new Alumno[3];
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPlanta() {
		return planta;
	}

	

	public Alumno[] getAsientos() {
 	return asientos;
	}

	
}
