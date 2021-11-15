
// La declaración de herencia no sufre
// ningún cambio con respecto a cómo
// se realizaba entre clases no abstractas

public class EmplDistr extends Asal {

	private String region;
	private double plus;

	public EmplDistr (String n, long dni, double sb, String r){	
		super (n, dni, sb);
		this.region = r;
		this.plus = 10.0;
	}

	public String getRegion ( ){
		return this.region;
	}

	public void setRegion (String nueva_region){
		this.region = nueva_region;
	}

	// Recordamos de nuevo que las clases que heredan de "Asal"
	// deben definir "getPlus(): double" para no
	// seguir siendo abstractas
	public double getPlus ( ){
		return this.plus;
	}
}