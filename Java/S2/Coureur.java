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
}
