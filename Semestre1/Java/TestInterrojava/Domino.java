public class Domino 
{
	Face gauche, droite;
	public Domino agauche, adroite;

	public Domino()
	{
		this(new Face(), new Face());
	}

	public Domino(Face g, Face d)
	{
		this.gauche = g;
		this.droite = d;
	}

	public String toString()
	{
		return this.gauche + "|" + this.droite;
	}

	public Face getFaceGauche()
	{
		return this.gauche;
	}

	public Face getFaceDroite()
	{
		return this.droite;
	}

	public boolean estLibreGauche() 
	{
		return (this.agauche == null);
	}

	public boolean estLibreDroite()
	{
		return (this.adroite == null);
	}

	public boolean estCompatible(Domino domino)
	{
		return (this.estLibreDroite() && ( this.getFaceDroite().getPoint()== domino.getFaceGauche().getPoint() ) || 
				this.estLibreGauche() && ( this.getFaceGauche().getPoint()== domino.getFaceDroite().getPoint() ) );
	}
	public boolean poser(Domino domino)
	{
		if (this.estCompatible(domino) )
		{
			this.agauche = domino;
			domino.adroite = this;
			return true;
		}
		else return false;
	} 
	public Domino plusAGauche()
	{
		if (this.estLibreGauche())
			return this;

		Domino temp = this;

		while (!temp.estLibreGauche())
		{
			temp = temp.agauche;
		}
		return temp;
	}
	public String getStringChaine()
	{
		String temp = "";

		Domino d = this.plusAGauche();
		
		do 
		{
			temp = temp + " " + d.toString();
			d = d.adroite;
		}while (d.adroite != null);
		return temp;
	}

}