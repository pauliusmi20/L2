public class TestCoureur
{
  public static void main (String [] args)
  {
    Coureur c1 = new Coureur();
    Coureur c2 = new Coureur();
    Coureur c3 = new Coureur();
    Coureur c4 = new Coureur();
    System.out.println(c1.toString()  + c2.toString() + c3.toString() + c4.toString() );
		c1.setALeTemoin(true);
		

				c1.courir();
				c1.passeTemoin(c2);
				c2.courir();
				c2.passeTemoin(c3);
				c3.courir();
				c3.passeTemoin(c4);
				c4.courir();
		
  }
}
