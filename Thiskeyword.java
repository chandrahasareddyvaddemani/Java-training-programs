package OOpsPrograms;

public class Thiskeyword {

	String n;
	Thiskeyword(String n)
	{
		this.n=n;
	}
	 void display()
	 {
		 System.out.println( "tutorial abt this key word "+n);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeyword t=new Thiskeyword("sun");
		t.display();

	}

}
