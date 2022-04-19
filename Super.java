package OOpsPrograms;
class Device{
	void display1() 
	{
		System.out.println("Am a electronic");
	}
	
	
}
class Tv extends Device
{
	void display()
	{
		System.out.println(" am a tv");
	}
}
public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Tv t=new Tv();
      
       t.display();
       t.display1();
       
	}

}
