public class TestVie {
	public static void main(String[] argv)
	{
		Monde temp = new Monde(0.2D);
		Cellule cel = new Cellule(false);
				
	
	System.out.println(temp.toString() + temp.nbVoisins(1,0) );
		
	}
	 
}
