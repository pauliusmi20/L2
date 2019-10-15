
public interface Test
{	

	 public static int addition(int... args)
	{
		int res = 0;
		for (int i : args)
			res+=i;
		return res;
	}


}
