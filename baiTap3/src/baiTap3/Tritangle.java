package baiTap3;

public class Tritangle extends Shape {
	private double a;
	private double b;
	private double c;
	public Tritangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	@Override
	public Double chuVi() {
		// TODO Auto-generated method stub
		return a + b+ c;
	}
	@Override
	public Double dienTich() {
		// TODO Auto-generated method stub
		double p = chuVi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	@Override
	public String toString() {
		return "Tritangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
}
