import java.util.Scanner;
public class Functions {
	static int printAdd(int x,int y) {
		
		System.out.println("the sum of is"+(x+y));
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       int a=10;
//       int b=10;
		System.out.println("enter 2num");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		printAdd(a,b);
	}

}
