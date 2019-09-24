import java.util.Scanner;
class MainApp
{
	public static void main(String[] args)
	{
		int i = 3;
		int u0 = i;
		int n = 10;
		for (int j=0; j<n ; j++)
			i = suite(i);
		System.out.println("u0 = " + u0 + " n = " + n + "retourne" + i );
		affiche_mot();

	}
	public static int suite(int u0)
	{
		return (3*u0 + 2 );
	}
    public static void affiche_mot()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot :");
		String str = sc.nextLine();
		sysout	
		System.out.println("Vous avez saisi : " + str); 
	}
}
