public class	TestVecteur
{
	public static void main(String [] args)
	{
		 Vecteur v1 = new Vecteur(0,0); 
		 Vecteur v2 = new Vecteur(10,1);
		 Vecteur v3 = new Vecteur(1,2);
		 Vecteur test = v1.addition(v2);
		 
		 System.out.println(test.toString() );
	}
}
