package OOpsPrograms;
class Animalss
{
	static void run1()
	{
		
		System.out.println(" h--animal id running");
	}
    
	void run2()
	{ 
		
		System.out.println("o-- animal is running");
	}
}
class Cheetha extends Animalss
{
	static void run1()
	{
		
		System.out.println("chetha runs fastly");
	}
	void run2()
	{
		
		System.out.println("o--  cheetha runs fastly");
	}
}




public class Methodhiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animalss a=new Cheetha();
		a.run1();//hiding
		a.run2();//overiding
		
	}

}
