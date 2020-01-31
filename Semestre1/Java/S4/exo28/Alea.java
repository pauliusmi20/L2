public class Alea{

	public static char lettre(){
		return (char)((Math.random()* ('z' - 'a' + 1 ) + 'a' );
	}
	
	public static String chaine(){
		String res = "";
		for(int i = 0; i<10; i++){
			res += lettre;
		} 
		return res;
	}
	
	public static String chaine(n){
		if (n == 0) 
			return "";
		else 
		  return "" + lettre() + chaine(n-1);
	}
	
	
}
