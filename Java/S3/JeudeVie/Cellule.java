public class Cellule
{
	private int age;
	
	public Cellule(){
		this.age = 0;
	}
	
	public Cellule(boolean isDead ){
	if (isDead)
		this.age = -1;
	else this.age = 0;  
	}
	
	public void viellir (boolean b){
		if (!b) this.age = -1; else this.age++;
	}
	
	public boolean vivante(){
		return this.age != -1;
	} 
	
	void mourir() {
		this.age = -1;
	}
	
	public void naitre(){
		this.age = 0;
	}
	
	public String toString() {
		if (this.vivante() ) return "*"; else return ".";
	}
}
