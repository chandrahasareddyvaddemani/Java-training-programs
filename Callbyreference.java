package OOpsPrograms;

public class Callbyreference {
	int a;
	int b;
	private static void add( Callbyreference op,Callbyreference op1)
	{
		op.a=10;
		System.out.println("result from method:"+(op.a+op.b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callbyreference op=new Callbyreference();//objects
		Callbyreference op1=new Callbyreference();
		op.a=2;op.b=3;
		System.out.println("befor passing :" +(op.a+op.b));
		add(op,op);//call method//reference variable
		System.out.println("a f:"+(op.a+op.b));
	}

}
