package OOpsPrograms;
class Animals
{
	void printA()
	{
		System.out.println("animal is running");
	}
}
class Dogs extends Animals
{
	
	void printD()
	{
		System.out.println("Dog is barking");
	}
}
class Cat extends Animals
{

	void printC()
	{
		System.out.println("cat is  says meow");
	}
}

public class Testclassanimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat L=new Cat();
		Dogs d=new Dogs();
 d.printD();
 d.printA();
 L.printC();
 L.printA();
	}

}
