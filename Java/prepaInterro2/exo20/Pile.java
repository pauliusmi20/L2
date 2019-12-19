public class Pile{
	private int [] pile;
	private int pos;

	public Pile (int max){
		this.pile = new int [max];
		this.pos = 0;
	}

	public void empiler (Machin m){
		if (this.pos++ < pile.length){
			this.pile[pos++] = m;
		}	public int depiler(){
		if (pos == 0) return NULL; 
		int res = pile[pos];
		pos --;
		return res;
	}  

	public boolean estVide(){
		return this.pos == 0;
	}

	public boolean estPleine(){
		return pos == this.pile.length--;
	}

	public toString(){
		String res = "";
		for (int i = pos; i>=0; i--){
			res += "pos:" + i + "va"l
		}
	}

	public static void main(String[] args) {
		
	}
}