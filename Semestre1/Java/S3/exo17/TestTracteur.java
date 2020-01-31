public class TestTracteur
{
	public static void main(String[] args)
	{
		Roue rG1 = new Roue (120); 
	  Roue rG2 = new Roue (120); 
		Roue rP1 = new Roue();
		Roue rP2 = new Roue();
		
		Cabine cab = new Cabine(10, "bleu");
		Tracteur t1 = new Tracteur(cab, rG1, rG2, rP1, rP2);
	  Tracteur t2 = t1.clone();
	  t2.peindre("rouge");
	  
	System.out.println(rG1.toString() + rG2.toString() + rP1 .toString()+ rP2.toString());
	System.out.println(t1);
	System.out.println(t2);
	
	}

}
