package figura;

public abstract class Figura implements Comparable<Figura>, Desplazable {

	protected Punto p1;

	public Figura(Punto p) {
		this.p1 = p;
	}

	public abstract Double calcularArea();

//	@Override
//	public int compareTo(Figura o) {
//		if (this.calcularArea() < o.calcularArea())
//			return -1;
//		if (this.calcularArea() > o.calcularArea())
//			return 1;
//		return 0;
//	}

	 @Override
	 public int compareTo(Figura o) {
	
	 return this.calcularArea().compareTo(o.calcularArea());
	 }

}
