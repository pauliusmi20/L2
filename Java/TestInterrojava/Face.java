public class Face 
{
	private int point;

	public Face()
	{
		this.point = (int) ( 7 * Math.random() ) ;
	} 

	public Face(int temp)
	{
		this.point = temp;
	
}
	public String toString()
	{
		return "" + this.point;
	}

	public int getPoint()
	{
		return this.point;
	}
}