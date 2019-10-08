public class Tour 
{
	private String nom;
	private Disque haut;
	
	public boolean estVide(){
		return haut == null;
	}
	public Disque getHaut(){
		return this.haut;
	} 
	public String getNom(){
		return this.nom;
	}
	private boolean empiler(Disque d) {
	 	return d.empilerSur(this.haut);
	}
	public boolean bougerVers(Tour t) {
		if (this.estVide() )
			return false;		
	  return (t.empiler(this.haut) && this.haut.depiler() );
	}
	
	public Tour(String nom, int nb){
		this.nom = nom;
		Disque temp;
		for(int i = nb ; i>0; i++){
			temp = new Disque(i);
			this.empiler(temp);
			}		
		}
	}	
	public String toString(){
	
		String temp = "" + this.nom + ": ";	
		Disque d = this.haut;
		
		if( this.estVide() )
			return temp + "est vide.";
			
		while ( d != null)  {
			temp += " " + d.getRayon();
			d = d.getDessous();
		}
		return temp;
	}
}

