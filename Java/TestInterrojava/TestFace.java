public class TestFace 
{
	public static void main(String[] args) {
		Face f1 = new Face(3);
		Face f2 = new Face(4);
		Face f3 = new Face(3);
		Face f4 = new Face(4);
		Face f5 = new Face(3);
		Face f6 = new Face(4);
		Face f7 = new Face(3);
		Face f8 = new Face(4);

		Domino test = new Domino(f1, f2);
		Domino test3 = new Domino(f2, f1);

		test.poser(test3);		
		for (int i = 0; i<200; i++)
		{
			if (test.poser(new Domino() ) ){
		 		test = test.agauche; 
			}
		 	
		}
		
		System.out.println(test.toString() + test3.toString() + "\n\n" +test.estCompatible(test3) + test.plusAGauche().toString()
			+ "\n\n" + test.plusAGauche().adroite.toString()
			+ "\n\n\n\n" + test.getStringChaine()	);

	}
}