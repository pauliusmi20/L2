import java.util.*;

public class TestMain implements Inter{
	public Set test;

	public TestMain(){
		this.test = new HashSet();
	}
	public static void main(String[] args) {
		TestMain a = new TestMain();
		a.test();
	}
}