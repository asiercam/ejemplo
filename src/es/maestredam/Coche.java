package es.maestredam;

public class Coche {

	// Constantes
	final protected static String MATR_DEF = "--- ----";
	final protected static int 	ANIO_DEF = 2025;
	final public static int 	TIPO_ELECTRICO 	= 0;
	final public static int 	TIPO_HIBRIDO 		= 1;
	final public static int 	TIPO_GASOLINA 	= 2;
	
	// Características
	protected String matricula;
	protected int anioCompra;
	protected int volDeposito;
	protected int tipo;
	
	// Estado
	protected double numKm;
	protected boolean encendido;
	protected double velocidad;
	protected double combustible;

	// Constructor
	public Coche(int tipo, int volDeposito) {
		this(MATR_DEF, ANIO_DEF, tipo, volDeposito);
		
	}
	
	public Coche(String matricula, int anioCompra, int tipo, int volDeposito) {
		this.matricula 		= matricula;
		this.anioCompra 	= anioCompra;
		this.volDeposito 	= volDeposito;
		this.tipo 				= tipo;
		this.numKm 		= 0;
		this.encendido 	= false;
		this.velocidad		= 0;
		this.combustible	= 0;
		
	}

	public String getMatricula() {
		return matricula;
	}
	
	public double getNivelCombustible() {
		return combustible;
	}
	
	public double getVelocidad() {
		return velocidad;
	}
	
	public void arrancar () {
		encendido = true;
		System.out.println("Arrancando...");
	}
	
	public void parar () {
		encendido = true;
		System.out.println("Parando...");
	}
	
	public double desplazar (double km) {
		this.numKm=numKm + km;
		System.out.printf("se ha desplazado %.2f kilometros %n",numKm);
		return numKm;
	}
	
	public double repostar () {
		combustible = volDeposito;
		return combustible;
	}
	
	public double acelerar (double km) {
		this.velocidad=km;
		return velocidad;
	}
	

	/*@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", anioCompra=" + anioCompra + ", volDeposito=" + volDeposito
				+ ", tipo=" + tipo + ", combustible=" + combustible + ", kilometros=" + numKm + ", encendido="
				+ encendido + ", velocidad=" + velocidad + "]";
	}*/
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Coche)) {
			throw new IllegalArgumentException("No es un Coche");
			//return false;
		}
		
		Coche otroCoche = (Coche)obj;
		
		if (this.matricula.equalsIgnoreCase(otroCoche.matricula)) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
