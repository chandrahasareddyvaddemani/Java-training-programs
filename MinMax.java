package OOpsPrograms;

import java.util.Scanner;

public class MinMax {

	int I;
	int S;
	static void min(int a,int b)//parameters
	{
		if(a>b)
			System.out.println(+a+"is max");
		else
			System.out.println(+b+"is max");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinMax m1=new MinMax();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 no");
		int c=sc.nextInt();
		int d=sc.nextInt();
		min(c, d);//arguments

	}

}
