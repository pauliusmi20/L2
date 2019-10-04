public class Test
{

	static public int addition(int... args)
	{
		int res = 0;
		for (int i : args)
			res+=i;
		return res;
	}

	public static void main(String[] args) {
		int res = 0; 
		res = addition(1,3,6);
		System.out.println(res);
	}
}