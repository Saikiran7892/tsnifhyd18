package overloading;

public class methodoverloading {
	 void run()
	 {
		 System.out.println("instance running");
	 }
	 static void run(int a)
	 {
		 System.out.println(" static running");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading m1=new methodoverloading();
		m1.run();
		m1.run(3);

	}

}
