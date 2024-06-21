
public class Rectangulo implements FiguraGeometrica{
	private String nombre;
	private double base;
	private double altura;
	public Rectangulo(String nombre, double base, double altura) {
		this.nombre=nombre;
		this.base=base;
		this.altura=altura;
	}//constructor
	public double calcularArea() {
		return base*altura;
	}//calcularArea
	public double calcularPerimetro() {
		return (2*base+2*altura);
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
}//class Rectangulo