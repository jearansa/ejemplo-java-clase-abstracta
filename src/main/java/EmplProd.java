
public class EmplProd extends Asal {

	private String turno;
	private static double plus = 15.0;

	// Recordar los comentarios de la clase EmplDistr
	public EmplProd (String n, long dni, double sb, String turno){
		super (n, dni, sb);
		this.turno = turno;
	}

	public String getTurno ( ){
		return this.turno;
	}

	public void setTurno (String nuevo_turno){
		this.turno = nuevo_turno;
	}

	public double getPlus( ){
		return EmplProd.plus;
	}
}