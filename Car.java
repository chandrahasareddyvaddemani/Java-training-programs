package OOpsPrograms;
abstract class parts
{
	String n;
	parts(String n)
	{
		this.n=n;
	}
	abstract void function();
	void f()
	{
		
		System.out.println(n);
		
	}
	
   
}
class Brakes extends parts

{
	String n;
	Brakes(String n)
	{
		super(n);
		
	}
	
	
  void function ()
  {
	  //method body
	   
	  System.out.println("car shd be halted");
	  
	  
  }

}
class Accelerator extends parts
{
	
	Accelerator(String n)
	{
		super(n);
		
	}
	
 void function ()
 {
	 // method boady
	 System.out.println("car is accelerating");
 }
}
class Gear extends parts
{int ge;
	
	Gear (String n,int ge)
	{
		super(n);
		this.ge=ge;
	}
	void function ()
	
	{
		System.out.println(" car gear should be change"+ge);
		
	}
}
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Brakes b=new Brakes("Brakes");b.function();
		b.f();
		Accelerator a=new Accelerator("Accelerator");a.function();
		a.f();
		Gear g =new Gear("Gear",5);g.function();// this three objects

	}

}
