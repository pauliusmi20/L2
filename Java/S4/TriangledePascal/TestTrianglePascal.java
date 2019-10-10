import java.util.*;
public class TestTrianglePascal
{
	public static void main(String [] args){
			int arg = 0;
			TrianglePascal temp;
		if (args.length != 1) 
			temp = new TrianglePascal(20);
		else 
			temp = new TrianglePascal(Integer.parseInt(args[0]));
		System.out.println(temp.toString());
	}
}
