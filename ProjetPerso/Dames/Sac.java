import java.lang.RuntimeException;
import java.util.ArrayList; 

class Sac extends Acc 
{		
	//Va contenire contenue du sac
	private Acc [] tab;
	/** 
	*Constructeur: fais appel a super contructeur de Acc
	*et initialize
	*/
	public Sac() {
		super("Sac");
		this.tab = new Acc[5]; 
	} 
	public int size(){
		return this.tab.length;
	}
	public void ajouter(Acc a){
		for( int i = 0; i< tab.length ; i++){
			if (tab[i] == null){
				tab[i] = a;
			}
			if ( i == tab.length -1) {
				RuntimeException e = new RuntimeException("Pas de place");
				throw e;
			}
		}
	}
	
	protected int getPoids(){
		int cpt = 0;
		for(Object i : tab){
			if ( i.getClass() == Acc.getClass()){
				cpt += i.getPoids();
			}
		}
		return cpt;
	}



	public String toString(){
		return super.toString();
	}

	
}