public class Cone{
	private double r;
	private double h;
	public final static double PI = 3.141D;
	private static int nbCones = 0;
	
	public Cone(double r, double h){
		this.r = r; 
		this.h = h;
		nbCones++;
	}
	public Cone(){
		this( (int)(Math.random()*10),(int)(Math.random()*10));
	}
	
	public double getVolume(){
		return 1/3*this.PI*(this.r * this.r);
	}
	public String toString(){
		return "r: " + this.r + ", h:"+ this.h + "  ,nbCones: " + this.nbCones;
	}
	public int getCones(){
		return this.nbCones;
	}

}
