public class Javamon 
{
	private String nom;
	private float force; 
	private float vitalite;
	private float bouclier;
	private int vie;

	public Javamon(String name)
	{
		nom = name;
		force = (float) Math.random();
		bouclier = (float) Math.random();
		vitalite = (float) Math.random();

		force =  force / (force + bouclier + vitalite);
		bouclier = bouclier / (force + bouclier + vitalite);
		vitalite = vitalite / (force + bouclier + vitalite);
	}

	public Javamon(String name, float f, float b,float v )
	{
		nom = name;
		force = f;
		bouclier =b;
		vitalite = v;

		force =  force / (force + bouclier + vitalite);
		bouclier = bouclier / (force + bouclier + vitalite);
		vitalite = vitalite / (force + bouclier + vitalite);

		
	}
	public boolean isDead ()
	{
		return vie <= 0;
	}

	public void infligerDommage(int p)
	{
		vie = vie -p;
	}

	public double getAttaque()
	{
		return (float) Math.random()*force;
	}
	public double getDefense()
	{
		return (float)  Math.random()*bouclier;
	}
	public void initCombat()
	{
		vie = (int) (Math.random()*50*vitalite + 51 );
	}

	public String toString()
	{
		return nom +" (force:" + force + ", bouclier:" + bouclier + ",vitalite:" + vitalite + ") vie: " + vie ;
	}
}