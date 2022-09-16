package pack1;

public class Overloading {
	int a,b,c;
	float  x,y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj=new Overloading();
		obj.add(10,20);
		obj.add(1,2,3);
		obj.add(10.1f,12.6f);
		

	}
	void add( int a, int b) {
		System.out.println(a+b);
	}
	void add( int a, int b,int c) {
		System.out.println(a+b+c);
	}
	void add(float x, float y) {
		System.out.println(x+y);
	}

}
