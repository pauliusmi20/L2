public class Adresse{
	private static int [] tab = {192,168,0,0};

	private Adresse(){}
	
	public static String getAdresseIP(){
		if (tab[3] == 256){
			if (tab [2] == 256){
				tab[2] = tab[3] = 0;
			}
			else {
				tab[2]++;
				tab[3]=0; 			
			}
		}
		else {
			tab[3]++;
		}
		
		return "" + tab[0] + "." + tab[1] + "." + tab[2] + "."  + tab[3] ; 	
	}			

	public static void main(String [] args){
		for (double i =0 ; i<10000000 ;i++){
			System.out.println(Adresse.getAdresseIP());
		}
	}

}
