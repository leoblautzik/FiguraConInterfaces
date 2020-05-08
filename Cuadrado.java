package figura;

public class Cuadrado extends Rectangulo {
	
	
	public Cuadrado(Punto p1, double lado) {
		super(p1,new Punto(p1.getX()+lado,p1.getY()+lado) );
		
	}

	
}
