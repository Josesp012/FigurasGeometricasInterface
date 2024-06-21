
public class Cuadrado implements FiguraGeometrica{
	private String nombre;
	private double lado;
	public Cuadrado(String nombre, double lado) {
		this.nombre=nombre;
		this.lado= lado;
	}//constructor
	public double calcularArea() {
		return Math.pow(lado, 2);
	}//calcularArea
	public double calcularPerimetro() {
		return 4*lado;
	}
	public String getNombre() {
		return nombre;
	}//calcularPerimetro
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}//class Cuadrado

