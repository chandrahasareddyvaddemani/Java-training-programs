package OOpsPrograms;

public class Bike {
        
	static int wheels=2;
	String color="";
	static void braking() {
		
		System.out.println("bike halts when breakes applying");
	}
	void milage( int s) 
	{
		
		System.out.println("milage is"+ s +"kilometers");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Bike RoyalEnfield=new Bike();
     Bike Duke =new Bike();
     Bike R15=new Bike();
//     System.out.println("no of wheels"+RoyalEnfield.wheels);
//     System.out.println("no of wheels"+Duke.wheels);
//     System.out.println("no of wheels"+R15.wheels);
//     RoyalEnfield.color="Black";
//     R15.color="blue";
//     Duke.color="orange";
//     System.out.println(""+RoyalEnfield.color);
//     System.out.println(""+Duke.color);
//     System.out.println(""+R15.color);
//     RoyalEnfield.braking();
//     Duke.braking();
//     R15.braking();
     RoyalEnfield.milage( 40);
     Duke.milage(35);
     R15.milage(28);
	}

}
