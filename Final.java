package OOpsPrograms;

  class F
{
	 
	   void fun()
	 {
		 System.out.println("hello");
	 }
}

public class Final extends F {
	  int a=10;
	
	  void fun() {
	 
		 System.out.println("hii");
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F f=new Final();
		//f.a=20;
		//System.out.println(f.a);
		f.fun();//calling method

	}

}
