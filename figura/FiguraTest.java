package figura;

import org.junit.Assert;
import org.junit.Test;

public class FiguraTest {

	@Test
	public void testDesplazar() {
		Punto p=new Punto(1,1);
		p.desplazar(1, 1);
		Assert.assertEquals(p,new Punto(2,2));
	}
	
	@Test
	public void testAreaElipse() {
		Punto centro=new Punto(3,3);
		Figura elipse=new Elipse(centro,2,3);
		Assert.assertEquals(elipse.calcularArea(),Math.PI*3*2,0.1);
		elipse.desplazar(-2, -1);
		Assert.assertEquals(elipse.calcularArea(),Math.PI*3*2,0.1);		
	}
	
	@Test
	public void testAreaTrianguloPunto() {
		Punto v1=new Punto(3,3);
		Punto v2=new Punto(3,3);
		Punto v3=new Punto(3,3);
		Figura triangulo=new Triangulo(v1,v2,v3);
		Assert.assertEquals(triangulo.calcularArea(),0,0.1);
		triangulo.desplazar(-2, -1);
		Assert.assertEquals(triangulo.calcularArea(),0,0.1);		
	}
	
	@Test
	public void testAreaTrianguloSegmento() {
		Punto v1=new Punto(3,3);
		Punto v2=new Punto(3,4);
		Punto v3=new Punto(3,5);
		Figura triangulo=new Triangulo(v1,v2,v3);
		Assert.assertEquals(triangulo.calcularArea(),0,0.1);
		triangulo.desplazar(-2, -1);
		Assert.assertEquals(triangulo.calcularArea(),0,0.1);		
	}
	
	@Test
	public void testAreaTrianguloSobreY() {
		Punto v1=new Punto(0,-4);
		Punto v2=new Punto(0,4);
		Punto v3=new Punto(2,2);
		Figura triangulo=new Triangulo(v1,v2,v3);
		Assert.assertEquals(8,triangulo.calcularArea(),0.1);
		triangulo.desplazar(-2, -1);
		Assert.assertEquals(8,triangulo.calcularArea(),0.1);		
	}
	
	public void testAreaTrianguloSobreX() {
		Punto v1=new Punto(-4,0);
		Punto v2=new Punto(4,0);
		Punto v3=new Punto(0,4);
		Figura triangulo=new Triangulo(v1,v2,v3);
		Assert.assertEquals(32,triangulo.calcularArea(),0.1);
		triangulo.desplazar(-2, -1);
		Assert.assertEquals(32,triangulo.calcularArea(),0.1);		
	}
	
	



}
