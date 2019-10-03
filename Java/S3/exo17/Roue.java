public class Roue 
{
	private int diametre;
	
	public Roue()
	{
		this(60);
	}
	public Roue(int diametre)
	{
		this.diametre = diametre;
	}

	public Roue clone()
	{
		return new Roue(this.diametre);
	}	
	public String toString()
	{
		return "Diametre de la roue: " + this.diametre + "cm.";
	}
	
}
