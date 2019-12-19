public class Nom{
	private static char [] cons;
	private static char [] voy;

	public rendAlea(int inf, int sup){
		return (int) (Math.random()*(sup - inf + 1) + inf );
	}
	public static boolean pair(int n){
		return (n%2 == 0);
	}
}