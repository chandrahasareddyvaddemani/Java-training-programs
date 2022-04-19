package OOpsPrograms;

public class Callbyvalue {
	int a;
	 int b;
	 private static void add(int s, int t) //parameters
	 {
		 s=10;
		 System.out.println("resultfrom method"+(s+t));
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callbyvalue op=new Callbyvalue();
		op.a=2;op.b=3;
		System.out.println("before passing"+(op.a+op.b));
		add(op.a,op.b);//args
		System.out.println("after passing"+(op.a+op.b));

	}

}
