package aula64Aplication.triangulo;

public class Triangulo{
	
	public double a;
	public double b;
	public double c;
	
	public double calculoTriangulo() {
		double p = (a + b + c) / 2;
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
	}
}
