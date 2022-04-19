package OOpsPrograms;

public class Concollege {
	int a;
	String b;
	Concollege(int c,String d)
	{
		a=c;
		b=d;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concollege c=new Concollege(45,"sun");
		Concollege c1=new Concollege(50,"sunny");
		System.out.println(c.a+c.b);
		System.out.println(c1.a+c1.b);

	}

}
