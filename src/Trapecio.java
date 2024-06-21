
public class Trapecio implements FiguraGeometrica{
	private String nombre;
	private double Base;
	private double base;
	private double altura;
	private double lado;
	public Trapecio(String nombre,double Base, double base, double altura, double lado) {
		this.nombre=nombre;
		this.Base=Base;
		this.base=base;
		this.altura=altura;
		this.lado=lado;
	}//constructor
	public double calcularArea() {
		return (altura*(Base+base))/2;
	}//calcularArea
	public double calcularPerimetro() {
		return (lado+lado+lado+lado);
	}
	public String getNombre() {
		return nombre;
	}//calcularPerimetro
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	} 
	
	//1.Constructor
	//2.Getter and stee
	//3.
}//class Triangulo
