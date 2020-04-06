package figura;

public class Elipse extends Figura implements Comparable<Figura>, Desplazable {

	//centro se hereda de Figura
	private double radioMenor;
	private double radioMayor;
	
	public Elipse(Punto centro, double radioMenor, double radioMayor) {
		super(centro);
		this.radioMenor = radioMenor;
		this.radioMayor = radioMayor;
	}

	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.p1.desplazar(deltaX, deltaY);
	}

	@Override
	public String toString() {
		return "Elipse [radioMenor=" + radioMenor + ", radioMayor=" + radioMayor + ", centro=" + p1 + ", calcularArea()="
				+ calcularArea() +"]";
	}

	@Override
	public Double calcularArea() {
		return this.radioMayor*this.radioMenor*Math.PI;
	}

}
