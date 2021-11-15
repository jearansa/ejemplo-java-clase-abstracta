
// La �nica modificaci�n que hemos llevado a cabo sobre
// la clase Asal es que en la declaraci�n de la misma
// ahora aparece la palabra "abstract"
// Recuerda que eso tiene como consecuencia que
// no se podr�n crear objetos de dicha clase

// A pesar de ser la clase abstracta, la misma
// contiene atributos, constructores, m�todos definidos...

public abstract class Asal {

	private	String nombre;
	private long dni;
	private double salarioBase;

	public Asal (String n, long dni, double sb){
   		this.nombre = n;
   		this.dni = dni;
   		this.salarioBase = sb;
	}

	public String getNombre ( ){
     		return this.nombre;
	}

	public void setNombre (String nn){
     		this.nombre = nn;
	}

	public long getDni ( ){
     		return this.dni;
	}

	public void setDni (long nd){
     		this.dni = nd;
	}

	// Podemos observar que dentro del m�todo
	// "getSalario(): double" hacemos uso del
	// m�todo "getPlus(): double" ya que el mismo,
	// aun siendo abstracto, pertenece a la interfaz de
	// la clase "Asal"

	public double getSalario ( ){
		return (this.salarioBase * (1 + this.getPlus() / 100));
	}

	// �dem a los comentarios del m�todo anterior
	public void setSalario(double s){
		this.salarioBase = s / (1 + this.getPlus() / 100);
	}

	// El siguiente m�todo es el �nico declarado como "abstract"
	// dentro de la clase; se puede notar que eso conlleva la
	// obligatoriedad de declarar la clase como "abstract".
	// Otra consecuencia importante es que todas las clases que
	// hereden de "Asal" deben implementar el m�todo
	// "getPlus(): double", o tambi�n ser�n abstractas
	public abstract double getPlus ( );
}