package test.statements;

public class MethodExample {
	int a, b, c;

	public void add(int x, int y) {
		a = x;
		b = y;
		c = a + b;

		System.out.println(c);

	}

	public static void main(String... strings) 
	{
		MethodExample ab=new MethodExample();
		ab.add(3, 16);
		ab.add(1, 5);

	}

}
