public class ListeLIFO{
	private int taille = 0; 

	public ListeLIFO(){}

	public void push(Object o){
		super();
		taille++;
	}

	public Object pop(){
		throw new RuntimeException("Pile vide"){
			super.remove(taille);	
		} 
	} 
}