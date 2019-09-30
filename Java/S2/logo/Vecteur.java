public class Vecteur
{
	double x,y;
	
	public Vecteur()
	{
		this(0.0D,0.0D);
	}
	
	public Vecteur(double a, double b)
	{
		this.x = a; 
		this.y = b;
	}
	
	public Vecteur addition(Vecteur v2)
	{
	  Vecteur res = new Vecteur(this.x + v2.x,this.y + v2.y); 
		return res;
	}
	
	public String toString()
	{
		return "x: " + this.x + "y: "+ this.y; 
	}
	
	public Vecteur rotation(Vecteur v1, double angle)
	{
		Vecteur v2 = new Vecteur();
		angle = (double) angle*180D / Math.PI;
		
		v2.x = v1.x * Math.cos(angle) - v1.y * Math.sin(angle);
		v2.y = v1.x * Math.sin(angle) + v1.y * Math.cos(angle);

	}
}
