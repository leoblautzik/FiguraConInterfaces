package figura;

public class Rectangulo extends Figura implements Comparable<Figura>, Desplazable {

	//inferiorIzquierdo se hereda de Figura;
	private Punto superiorDerecho;

	
	public Rectangulo(Punto inferiorIzquierdo, Punto superiorDerecho) {
		super(inferiorIzquierdo);
		this.superiorDerecho = superiorDerecho;
	}

	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.p1.desplazar(deltaX, deltaY);
		this.superiorDerecho.desplazar(deltaX, deltaY);

	}

	@Override
	public Double calcularArea() {
		return Math.abs((this.superiorDerecho.getX() - this.p1.getX())
				* (this.superiorDerecho.getY() - this.p1.getY()));
	}

	@Override
	public String toString() {
		return "Rectangulo [superiorDerecho=" + superiorDerecho + ", inferiorIzquierdo=" + p1 + ", calcularArea()=" + calcularArea()
				+ "]";
	}

}
