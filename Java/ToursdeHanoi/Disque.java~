public class Disque
{
	private int rayon;
	private Disque dessus , dessous;
	
	
	public Disque( int rayon)
	{
		this.rayon = rayon;
	}
	public Disque getDessus() 
	{
		return this.dessus;
	} 
	public Disque getDessous()
		{
		return this.dessous;
	} 
	public int getRayon()
	{
		return this.rayon;
	} 
	public boolean depiler() 
	{
		if ( dessus == null)
		{
		this.rayon = dessous.rayon;
		return true;
		}
		else
			return false; 
	}
	
	public boolean empilerSur(Disque d)
	{
		if (d.rayon > this.rayon || d == null )
		{	
		d.dessus = this;
		this.dessous = d;
		this.dessus = null;
		return true;
	  } 
		else return false;
	}
	
	/*public String toString()
	{
		return "rayon : " + this.rayon + "dessous :" + this.dessous.toString() + "dessus  " + this.dessus.toString() ; 
	}
	*/
}
