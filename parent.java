package instanceoverriding;

public class parent {
	void display()
	{
		System.out.println("inside parent class");
	}

}
class child extends parent
{
	void display()
	{
		System.out.println("inside child class");
	}
}