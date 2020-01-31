public class Canard extends Animal{
	private static int cpt = 0;

	public Canard() {
		super(++cpt,false, String.format("C%02d",cpt) );
	}
}