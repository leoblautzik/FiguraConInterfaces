package figura;

public class Triangulo extends Figura implements Desplazable, Comparable<Figura> {

	
	private Punto p2;
	private Punto p3;

	public Triangulo(Punto v1, Punto v2, Punto v3) {
		
		super(v1);
		this.setP2(v2);
		this.setP3(v3);
	}

	private void setP2(Punto p2) {
		this.p2 = p2;
	}

	private void setP3(Punto p3) {
		this.p3 = p3;
	}

	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.p1.desplazar(deltaX, deltaY);
		this.p2.desplazar(deltaX, deltaY);
		this.p3.desplazar(deltaX, deltaY);
	}

	

	@Override
	public String toString() {
		return "Triangulo [p2=" + p2 + ", p3=" + p3 + ", p1=" + p1 + ", calcularArea()=" + calcularArea() + "]";
	}

	@Override
	public Double calcularArea() {
		// La manera de calcular el area de un triángulo
		// definido por sus tres vertices sería así(investigar):
		return Math.abs((p1.getX() * p2.getY() + p2.getX() * p3.getY() + p3.getX() * p1.getY())
				- (p1.getX() * p3.getY() + p3.getX() * p2.getY() + p2.getX() * p1.getY())) / 2;

	}
	
	

}
