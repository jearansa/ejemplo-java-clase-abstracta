
// La única modificación que hemos llevado a cabo sobre
// la clase Asal es que en la declaración de la misma
// ahora aparece la palabra "abstract"
// Recuerda que eso tiene como consecuencia que
// no se podrán crear objetos de dicha clase

// A pesar de ser la clase abstracta, la misma
// contiene atributos, constructores, métodos definidos...

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

	// Podemos observar que dentro del método
	// "getSalario(): double" hacemos uso del
	// método "getPlus(): double" ya que el mismo,
	// aun siendo abstracto, pertenece a la interfaz de
	// la clase "Asal"

	public double getSalario ( ){
		return (this.salarioBase * (1 + this.getPlus() / 100));
	}

	// Ídem a los comentarios del método anterior
	public void setSalario(double s){
		this.salarioBase = s / (1 + this.getPlus() / 100);
	}

	// El siguiente método es el único declarado como "abstract"
	// dentro de la clase; se puede notar que eso conlleva la
	// obligatoriedad de declarar la clase como "abstract".
	// Otra consecuencia importante es que todas las clases que
	// hereden de "Asal" deben implementar el método
	// "getPlus(): double", o también serán abstractas
	public abstract double getPlus ( );
}