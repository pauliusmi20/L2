import java.awt.Graphics;

public class Tortue
{
	Vecteur position, direction;
	boolean draw;
	Graphics g;
	
	public Tortue(Graphics g)
	{
		this.direction = new Vecteur(1,0);
		this.position = new Vecteur(200,200);
		this.draw = true;
		this.g = g;
	}
	public void leverStylo()
	{
		this.draw = false; 
	}
	public void baisserStylo()
	{
		this.draw = true; 
	}
	
/*	
	public void avancer(int lg)
	{
		Tortue temp = new Tortue(g);
		
	
		for (int i = 0; i<lg; i++ )
		
		temp.addition
		{ 
		
		System.out.println("debut " + position);		System.out.println(direction);
		
		
			
					if (draw)
	 				{	System.out.println("dans if" + position);		System.out.println(direction);						
        	g.drawLine( (int) this.position.getX()  , (int) this.position.getY() ,(int) this.position.addition(direction).getX(), (int) this.position.getY() );
							
					}			
					else this.position.addition(direction);
					
					System.out.println("else" + position);		
					
					System.out.println("\n\n\n\n")	;	


		}			
	}
	*/
		public void avancer(int lg)
		{		
		for (int i = 0; i<=lg; i++ )
		{		
		
		Vecteur positionDest = this.position.clone().addition(this.direction);		

	  System.out.println("Dest : " + positionDest) ;
	  
				if (draw)
				{
					if  (this.position.getX() > 0.5) 
						this.position.setX(this.position.getX() + 1) ; 
					if  (this.position.getY() > 0.5) 					
						this.position.setY(this.position.getY() + 1) ; 
		g.drawLine( (int) positionDest.getX(), (int) positionDest.getY(), (int) this.position.getX(), (int) this.position.getY() );		
				}
				
		position = positionDest;
		}	
}

	
	
	public void rotation(double theta)
	{
		this.direction.rotation(theta);
	}
	
	public void rond()
	{
		for (int i = 0; i<=359; i++)
		{
			this.avancer(1);
			this.rotation(Math.PI/180);
		}
	}
	
	public void rond(int tour)
	{
		for (int i = 0; i<=tour; i++)
		{
			this.avancer(1);
			this.rotation(Math.PI/180);
		}
	}
	
	public void rosace(int tour)
	{
		for (int i = 0; i<=tour ;i++) 
		{
			this.rond();
			this.rotation(Math.PI/50*2);
		}
	}
	
	
}

 
