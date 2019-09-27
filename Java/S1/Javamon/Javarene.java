public class Javarene
{
	private Javamon j1;
	private Javamon j2;

	public Javarene ()
	{
		j1 = new Javamon("Beevis");
		j2 = new Javamon("Butthead");
		j1.initCombat();
		j2.initCombat();
	}
	int getDommage(double a, double d)
	{
		if (a<=d)
			return 0;
		else return (int ) ((a - d)*10 );
	}
	public void duel(Javamon a, Javamon d  )
	{
		d.infligerDommage( getDommage(a.getAttaque(), d.getDefense() ) );
	}
	public String toString()
	{
		return j1.toString() + "\n" + j2.toString() + "\n\n";
	}
	public void combat ()
	{
		int cpt = 0;
		int tour = 0;
		do {
			cpt = cpt %2;
			if (cpt == 0)
				duel(j1,j2);
			else duel(j2,j1);
			cpt++;tour++;
		System.out.println(this.toString());
		System.out.println("tour:" + tour);

		}while (!j1.isDead() && !j2.isDead()) ;
	}
}