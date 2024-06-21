

public class Rombo implements FiguraGeometrica{
	private String nombre;
	private double lado;
	private double DiagMayor;
	private double DiagMenor;
	public Rombo(String nombre, double DiagMayor, double DiagMenor, double lado) {
		this.nombre=nombre;
		this.lado=lado;
		this.DiagMayor=DiagMayor;
		this.DiagMenor=DiagMenor;
	}//constructor
	public double calcularArea() {
		return (DiagMayor*DiagMenor)/2;
	}//calcularArea
	public double calcularPerimetro() {
		return (2*lado);
	}
	public String getNombre() {
		return nombre;
	}//calcularPerimetro
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getlado() {
		return lado;
	}
	public void setDiagMayor(double DiagMayor) {
		this.DiagMayor = DiagMayor;
	}
	public double getDiagMenor() {
		return DiagMenor;
	}
}//class Rombo