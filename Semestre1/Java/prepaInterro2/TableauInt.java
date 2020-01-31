public class TableauInt{
		private int [] tab;
		
		public TableauInt(){
			this.tab = new int[10];
			for(int i = 0; i<10; i++)
				tab[i] =  (int)(Math.random()*101);			
		}			
		
		public String toString(){
			String res = "";
			for (int i : tab){
				res += "[" + i + "]";
			}
			return res;
		}	
		
	


	public static void main (String [] args){
		int [] t1 = {1,2,3};
		int [] t2 = {1,2,3};
		int [] t3 = t1;
		TableauInt test = new TableauInt();
		 
		System.out.println(t1 == t2);
		System.out.println(t1 == t3);
		System.out.println(test);

	}
}
