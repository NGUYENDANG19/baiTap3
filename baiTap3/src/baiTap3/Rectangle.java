package baiTap3;

public class Rectangle extends Shape {
	private double a;
	private double b;
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public Double chuVi() {
		// TODO Auto-generated method stub
		return 2 * (a + b);
	}
	@Override
	public Double dienTich() {
		// TODO Auto-generated method stub
		return a *b;
	}
	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + "]";
	}
	

}
