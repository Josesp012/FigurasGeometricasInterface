

public class Triangulo implements FiguraGeometrica{
	private String nombre;
	private double base;
	private double altura;
	private double lado;
	public Triangulo(String nombre, double base, double altura, double lado) {
		this.nombre=nombre;
		this.base=base;
		this.altura=altura;
		this.lado=lado;
	}//constructor
	public double calcularArea() {
		return (base*altura)/2;
	}//calcularArea
	public double calcularPerimetro() {
		return (lado+lado+lado);
	}
	public String getNombre() {
		return nombre;
	}//calcularPerimetro
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}//class Triangulo
