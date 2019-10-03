public class Tracteur
{
	private Cabine cab;
	private Roue f1 , f2 , b1, b2;
	
	public Tracteur( Cabine cab , Roue f1, Roue f2, Roue b1, Roue b2 )
	{
		this.cab = cab;
		this.f1 = f1;
		this.f2 = f2;
		this.b1 = b1;
		this.b2 = b2;
	}
	
	public void peindre(String a)
	{
		this.cab.setCouleur(a);
	}
	public Tracteur clone()
	{
		return new Tracteur(this.cab.clone() , this.f1, this.f2, this.b1, this.b2);
	}
	
	public String toString()
	{
		return "Tracteur = " + "\n" + this.cab.toString() + "\n\n" + this.f1.toString() + "\n" + f2.toString() + "\n"+ this.b1.toString() + "\n" + b2.toString() ;  
	}

}
