package pack1;
abstract class Class1{
	abstract void method1();
	void method2(){
		System.out.println("Hello Everyone");
	}
}
public class Class2 extends Class1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 a= new Class2();
		a.method2();
		a.method1();
		
	

	}
	

	void method1() {
		System.out.println("How are you");
		
	}
}

