package pack1;

class Animals{
	void animal(){
		System.out.println("ANIMALS");
		
	}
}

public class MethodOverriding extends Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding obj= new MethodOverriding();
		obj.animal();
		
		
		

	}
	void animal(){
		super.animal();
		System.out.println("DOGS");
		
		
	}

}
