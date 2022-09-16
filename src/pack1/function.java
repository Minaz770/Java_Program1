package pack1;

public class function {
	public static void main(String[] args) {
		int a=10,b=5,result,result1;
		function obj=new function();
		result=obj.add(a,b);
		result1=obj.sub(a,b);
		System.out.println("Sum is "+result);
		System.out.println("Difference is "+result1);
		obj.mul(a,b);
		obj.div(a,b);		
	}
   int add(int a, int b) {
	   return a+b;
   }
   int sub(int a, int b) {
	   return a-b;
   }
   void div(int a, int b) {
	   System.out.println("Quotient is "+a/b);
   }
   void mul(int a, int b) {
	   System.out.println("Product is "+a*b);
   }
   
	

}
