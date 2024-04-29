
public class Access {
	int a=10;
	static int  b=20;
	void display()
	{
		System.out.println("value="+b);
	}
	static void display1()
	{
		System.out.println("value="+b);
		
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Access a1=new Access();
		System.out.println(a1.a);
		a1.display();
		System.out.println(Access.b);
		Access.display1();
		
	}

}
