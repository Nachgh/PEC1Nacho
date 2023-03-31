package edu.ucj.programacion.pec1_Ignacio_FdezdeValderrama;


public class Colegio {
	private String nombre;
	private String direccion;
	private Aula[] aulas;

	public Colegio(String nombre, String direccion, int numAulas) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.aulas = new Aula[numAulas];
		for (int i = 0; i < numAulas; i++) {
			this.aulas[i] = new Aula(i + 1, 1); //todas las aulas en la planta 1
		}
	}

	public  void agregar_alumno(Alumno alumno) {
		boolean condicion = false;// creamos la condicion para que una vez se le haya asignado el sitio, no se le siga asignando a mas asientos
		for (int i = 0; i < aulas.length; i++) {
			for (int j = 0; j < aulas[i].getAsientos().length; j++) {

				if (aulas[i].getAsientos()[j] == null && condicion == false) {  // si el asiento  es igual a null es que esta vacio
					aulas[i].getAsientos()[j] = alumno;
					System.out.println("Alumno: " + alumno.getNombre());
					System.out.println("DNI: " + alumno.getDni());
					System.out.println("Aula: " + aulas[i].getNumero());
					System.out.println("Asiento: " + (j + 1));
					condicion = true;
				}
			}
			if (condicion == true) {
				break;
			}

		}

		if (condicion == false) {
			System.out
					.println("No se ha podido asignar al alumno a un asiento ya que todos los asientos estan ocupados");
		}
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Aula[] getAulas() {
		return aulas;
	}

    public void setAulas(Aula[] aulas) {
	   this.aulas = aulas;
    }
    
}
    
    