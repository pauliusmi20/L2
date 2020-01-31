public  class Pomme extends Acc implements Mangeable {
	private double rayon;

	public Pomme(){
		super("Pomme");
	}

	@Override
	public  double getPoids(){
		return (this.rayon**3 )* (4 / 3000)* Math.PI; 
	}
	public String toString(){
		super.toString();
	}	
}