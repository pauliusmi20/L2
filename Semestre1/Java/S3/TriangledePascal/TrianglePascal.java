import java.util.*;

public class TrianglePascal
{
	private int[][] pascal;
	
	public TrianglePascal(int ligne){
		int j = 1;
		this.pascal = new int[ligne][];
			for(int i = 0; i<ligne; i++){
				this.pascal[i] = new int[j];
				j++;		
		}	
		this.remplirTriangle();	
	}
	
	public void remplirTriangle(){
		int i=0;
		while (i < this.pascal.length)	{
			for ( int j = 0; j < this.pascal[i].length; j++)		
				{
				if (j==0 || j==i)
					this.pascal[i][j] = 1;
				else 	
					this.pascal[i][j] = pascal[i-1] [j-1] + pascal [i] [j-1] ;		
				}
			i++;
			}
		}		
		
	public String toString(){
		String temp = "";		
		for (int i = 0; i< this.pascal.length ; i++)
			temp +=  Arrays.toString(this.pascal[i]) + "\n" ;
		return temp;
	}
}
