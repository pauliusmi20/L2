public class Coureur
{
  private int nuDossard;
  private double tempsAu100;
  private boolean aLeTemoin; 
  
  public Coureur()
  {
    this( (int) ( 1000*Math.random() + 1));
  }

  public Coureur(int nrD)
  {
    nuDossard = nrD;
    tempsAu100 = 12 + Math.random()*4;
    aLeTemoin = false;
  }
  
  public String toString()
  {
    return "nuDossard: " + nuDossard + "\n tempsAu100: " + tempsAu100 + "\n aLeTemoin: " +  aLeTemoin +"\n";
  }
  public int getNuDossard()
  {
  	return this.nuDossard;
  }
  
  public double getTempsAu100() 
  {
  	return this.tempsAu100;
  }
  
  
  public boolean getALeTemoin() 
  {
  	return this.aLeTemoin;
  }
  
  public void setALeTemoin(boolean b) 
	{
		this.aLeTemoin = b;
	}
	public void passeTemoin(Coureur c)
	{
		System.out.println("moi, coureur " + this.getNuDossard() + ", je passe le témoin au coureur "+ c.getNuDossard() );
		if (this.getALeTemoin())
			{
				c.setALeTemoin(true); 
				this.setALeTemoin(false);
			}
	}
	public void courir()
	{
		double timeNow = System.currentTimeMillis();
		double time = timeNow + this.tempsAu100;
		System.out.println("je suis le coureur " + this.getNuDossard() + " je cours. ");
		while (timeNow < time)
		{
			 timeNow = System.currentTimeMillis();
		}
	}
}

