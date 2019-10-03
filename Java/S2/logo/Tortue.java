import java.awt.Graphics;

public class Tortue
{
	Vecteur position, direction;
	boolean draw;
	Graphics g;
	
	public Tortue(Graphics gg)
	{
		this.direction = new Vecteur(1,0);
		this.position = new Vecteur(200,200);
		this.draw = true;
		this.g = gg;
	}
	public void leverStylo()
	{
		this.draw = false; 
	}
	public void baisserStylo()
	{
		this.draw = true; 
	}
	public void avancer(int lg)
	{
	
		for (int i = 0; i<lg; i++ )
		{
					if (draw)
	 				{						
        	g.drawLine( (int) this.position.getX()  , (int) this.position.getY() ,(int) this.position.addition(direction).getY(), (int) this.position.addition(direction).getY() );
										
					}			
					else this.position.addition(direction); 		
		}
	}
	
	public void rotation(double theta)
	{
		this.direction.rotation(theta);
	}
	
}

 
