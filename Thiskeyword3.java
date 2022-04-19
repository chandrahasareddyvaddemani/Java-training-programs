package OOpsPrograms;


class C
{Thiskeyword3 ob;
	C(Thiskeyword3 ob)
	{
		
		this.ob=ob;
	}


void display()
{
	System.out.println(ob.data);
	}

}

public class Thiskeyword3 {
	int data =100;
	Thiskeyword3()
	{
		C c=new C(this);
		c.display();
	}

   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeyword3 t=new Thiskeyword3();
         
	}

}
