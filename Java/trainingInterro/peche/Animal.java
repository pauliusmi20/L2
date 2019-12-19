public abstract class Animal{
	protected int pts;
	protected boolean perdu;
	protected String representation;

	public Animal(int pts, boolean perdu, String representation){
		this.pts = pts;	
		this.perdu = perdu;
		this.representation = representation;
	}
	public String getType(){
		return this.representation;
	}
	public String toString(){
		return " " + pts + perdu + representation;
	}
} 