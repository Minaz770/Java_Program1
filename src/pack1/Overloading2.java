package pack1;

public class Overloading2 {
	int a,b,c;
	float  x,y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading2 obj=new Overloading2();
		obj.mul(10,20);
		obj.mul(1,2,3);
		obj.mul(10.1f,12.6f);
		
		

	}
	void mul( int a, int b) {
		System.out.println(a*b);
	}
	void mul( int a, int b,int c) {
		System.out.println(a*b*c);
	}
	void mul(float x, float y) {
		System.out.println(x*y);
	}

}
