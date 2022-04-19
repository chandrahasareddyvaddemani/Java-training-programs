package OOpsPrograms;

public class Function {
	int I=10;
	static int s=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function f1=new Function();
		Function f2=new Function();
		 
		System.out.println(""+f1.I);
		System.out.println(""+f1.I);
	    System.out.println(""+s);
	    System.out.println(""+s);
        f1.I=100;f1.s=200;
	    System.out.println("-------");
	    
	    System.out.println(""+f1.I);
	    System.out.println(""+f2.I);
	    System.out.println(""+s);
	    System.out.println(""+f2.I);
	    f1.s=300;
	    System.out.println(""+s);
	    System.out.println(""+s);
	}

}
