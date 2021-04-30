class calc
{
	int a,b,c;
	void add()
	{
		a=10;
		b=20;
		c = a+b;
		System.out.print(c);
	}
	}
public class MethodReference {
	public static void main(String[] args) {
		calc cal = new calc();
		cal.add();
		
	}
}
