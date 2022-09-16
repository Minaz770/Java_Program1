package pack1;

public class Overloading1 {
	int a,b,c;
	float  x,y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading1 obj=new Overloading1();
		obj.sub(30,20);
		obj.sub(10,2,3);
		obj.sub(10.1f,2.6f);
		

	}
	void sub( int a, int b) {
		System.out.println(a-b);
	}
	void sub( int a, int b,int c) {
		System.out.println((a-b)-c);
	}
	void sub(float x, float y) {
		System.out.println(x-y);
	}

}
