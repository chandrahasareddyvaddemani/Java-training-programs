package OOpsPrograms;

class B
{
	B getB()
	{
		return this;
	}
	void dis()
	{
		System.out.println("hello");
	}
}

public class Thiskeyword4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B().getB().dis();

	}

}
