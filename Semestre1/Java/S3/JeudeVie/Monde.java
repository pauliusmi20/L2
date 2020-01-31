public class Monde 
{
	public Cellule[][] tabCells;
	private int nbGen;
	
	public Monde( double seuil){	
		this.nbGen = 0;
		this.tabCells = new Cellule[20][20];
		for(int i = 0;  i < 20 ; i++ )			
		{
			for(int j = 0; j < 20 ; j++)	
			{	
			if (Math.random() < seuil)
				this.tabCells[i][j] = new Cellule(false);
				
			else 
				this.tabCells[i][j] = new Cellule(true);
			//System.out.println(tabCells[i][j].toString() );
			}
		}
	}
	 
	public Monde(int x, int y, double seuil){
				this.nbGen = 0;
		for(int i = 0;i < x  ;i++  )
		{
			for (int j = 0; j < y; j++)
			{
			if (Math.random() < seuil) 
				this.tabCells[i][j] = new Cellule(false);
			else 
				this.tabCells[i][j] = new Cellule(true);
			}
		}
	}
	public int getX(){
		return this.tabCells.length -1;
	}
	public int getY(){
		return this.tabCells[0].length -1;
	}
	public int getNbGen(){
		return this.nbGen;
	}
	public Cellule get(int x, int y){
		return this.tabCells[x][y];
	}
	public String toString() {
		String temp = "";
		for (int i = 0; i< this.getX() ; i++){
			for (Cellule j : tabCells[i] )
				temp += j.toString();
			temp+= "\n";	
		}
		return "generation :" + this.nbGen + "\ncontient : \n" + temp;
	}
	
	public int nbVoisins(int x, int y){
		int voisins = 0, int _i = -1 , int _j = -1 ;	
		
		
	
		if( 
			
			this.get( (x  + this.getX()) % this.getX() , (x + this.getX()) % this.getX())||	
								
			this.get( (x  + this.getX()) % this.getX() , (x + this.getX()) % this.getX() )

		
		
		)
	

		
	
		
		for (int i = (x -1 + this.getX()) % this.getX() ; i <= 	(x +1 + this.getX()) % this.getX(); i++ ) 
			for (int j = (y -1 + this.getY()) % this.getY()  ; 		j <= (y +1 + this.getY()) % this.getY() ; j++ ) 
				if (tabCells[i][j].vivante()) voisins++;			
		return voisins;
	} 
}

