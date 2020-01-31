/*******************************

	cette class aurait est abstraite

************************************/

abstract public class Acc{
	protected static int cpt = 0;
	protected int numero;
	protected String categorie;

	public Acc(String categorie){
		this.categorie = categorie;
		numero = cpt;
		cpt++;
	}
	protected abstract int getPoids();
	/*
	  *remarque: on ne connait pas le poid de cette objet, mais on va redéfinir la méthode get nous même
	  *cette classe est abstraite elle ne peux instanciee
	*/

	public String toString(){	
		return String.format("chaine=%s entier=%d reel=%.2f",this.categorie , numero,
this.getPoids());
	}


}