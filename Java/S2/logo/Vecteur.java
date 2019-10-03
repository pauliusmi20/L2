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
	public Vecteur clone()
	{
		return new Vecteur(this.x,this.y);
	}
	
	public void setX(double x)
	{
		this.x = x;
	}

	public void setY(double y)
	{
		this.y = y;
	}


	public double getX()
	{
		return this.x ;
	}

	public double getY()
	{
		return this.y;
	} 


	public Vecteur addition(Vecteur v2)
	{
				return new Vecteur(this.x + v2.getX(), this.y + v2.getY() ); 

	}
	
	public String toString()
	{
		return "x: " + this.x + "y: "+ this.y; 
	}
	
	public double conversionDegToRad(double angle)
	{
		return (double) angle*180D / Math.PI;
	}
	
	public void rotation(double angle)
	{
		this.x = this.x * Math.cos(angle) - this.y * Math.sin(angle);
		this.y = this.x * Math.sin(angle) + this.y * Math.cos(angle);
	}
}
