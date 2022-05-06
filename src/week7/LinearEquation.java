package week7;

public class LinearEquation {

	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	LinearEquation(double a, double b, double c, double d, double e, double f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	double getA() {
		return this.a ;
	}
	double getB() {
		return this.b ;
	}
	double getC() {
		return this.c ;
	}
	double getD() {
		return this.d ;
	}
	double getE() {
		return this.e ;
	}
	double getF() {
		return this.f ;
	}
	
	boolean isSolved() {
		boolean isSolved = false;
		if(this.a*this.d-this.b*this.c == 0) {
			isSolved = true;
		}
		return isSolved;
	}
	
	double getX() {
		double X = (this.e*this.d-this.b*this.f)/(this.a*this.d-this.b*this.c);
		return X;
	}
	
	double getY() {
		double Y = (this.a*this.f-this.e*this.c)/(this.a*this.d-this.b*this.c);
		return Y;
	}

}
