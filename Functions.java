package OOpsPrograms;

public class Functions {
	  int I=10; // instance
	 static int s =20;// static
	 void printvalue()
	 {
		 System.out.println(""+I);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions f1=new Functions();
		System.out.println(""+Functions.s);
		System.out.println(""+f1.s);
        System.out.println(""+s);
        f1.printvalue();
	}

}
