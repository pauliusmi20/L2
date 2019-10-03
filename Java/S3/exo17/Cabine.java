public class Cabine 
{
		private String couleur;
		private int m3;
		
	public Cabine (int a , String b)
	{
		this.m3 = a; this.couleur = b;
	}
	
	public void setCouleur(String a )
	{
		this.couleur = a;
	}
	
	public Cabine clone()
	{
		return new Cabine (this.m3, this.couleur);
	}
	
	public String toString()
	{
		return "Cabine de volume: " + m3 + "m3, et de couleur :" + couleur;
	}
}
