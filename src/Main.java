
public class Main {

	public static void main(String[] args) {
		Triangulo bermudas = new Triangulo("Bermudas",20,10,15);
		Triangulo t= new Triangulo ("Triangulote",250,175,145);
		Cuadrado bob= new Cuadrado ("Bob Esponja",50);
		Rectangulo r= new Rectangulo ("Rectangulo",50,20);
		Rombo R= new Rombo ("Rombo",50,20,40);
		Romboide re= new Romboide ("Romboide",50,20);
		Trapecio T= new Trapecio ("Trapecio",250,175,145,63);
		imprimirCalculo(bermudas);imprimirCalculo(t);
		imprimirCalculo(bob);imprimirCalculo(r);
		imprimirCalculo(R);imprimirCalculo(re);
		imprimirCalculo(T);
	}//main
	
	public static void imprimirCalculo(FiguraGeometrica f) {
		System.out.println(f.toString());
		System.out.println("+==================================");
		System.out.println("| El area de ["+ f.getNombre()
					+"] es :"+ f.calcularArea());
		System.out.println("| El perimetro de ["+ f.getNombre()
					+"] es :"+ f.calcularPerimetro());
		System.out.println("+====================================");
	}

}//classmain
