public class Hanoi{
	int nbcoups;
	private Tour t1, t2,t3;
	
	public Hanoi(int tour){
	t1 = new Tour("1", tour);
	t2 = new Tour("2", 0);
	t3 = new Tour("3", 0);
	}
	
	public Tour getTour(int i){
		switch (i){
			case 1 : return t1; 
  		case 2 : return t2;
  		case 3 : return t3;
 		  default: return null;
		}
	}
	
	public boolean aGagne(){
		return (t1.estVide() && t2.estVide() );
	} 
	public String toString() {
	return "tour = " + this.nbcoups + t1.toString() + "\n" + t2.toString() + "\n" + t3.toString() + "\n";
	}	
}
