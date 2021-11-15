
public class Principal{

	public static void main (String [] args){

		// Es importante recordar que no podemos
		// construir objetos de la clase "Asal"
		// Lo siguiente produciría un error de compilación
		// Asal ao = new Asal (...);

		// La clase abstracta puede ser usada para declarar
		// objetos pertenecientes a la misma
		Asal a1 = new EmplProd ("Juan Abad", 112233, 1500, "Tarde");
		Asal a2 = new EmplDistr ("Pedro Ríos", 221133, 1800, "Norte");
		Asal a3 = new EmplProd ("Antonio León", 445566, 1200, "Noche");
		Asal a4 = new EmplDistr ("Antoni Camino", 55366, 1200, "Granada");

		// También podemos usar la clase para declarar vectores,
		// parámetros de funciones auxiliares...
		Asal [] v = { a1, a2, a3, a4 };

		for (Asal a: v){
			System.out.println ("El objeto pertenece a la clase "
						+ a.getClass().getName());
			System.out.println ("\t El salario del empleado es : "
						+ a.getSalario());
			System.out.println ("\t El plus del empleado en porcentaje es : "
						+ a.getPlus());
		}
	}

	// La clase Asal también puede ser usada como parámetro de funciones auxiliares:

	public static void muestraSalario (Asal a){
		System.out.println ("\t El salario del empleado es : "
						+ a.getSalario());

	}

}