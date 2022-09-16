package pack1;

public class compare_string {
	public static void main(String[]args) {
		String str1="Hello World", str2="Hello";
		if(str1.length()>str2.length()) {
			System.out.print("String 1 is greater than String 2");
		}
		else if(str1.length()==str2.length()){
			System.out.print("String 1 is equal to String 2");
			
		}
		else {
			System.out.print("String 1 is lesser than String 2");
		}
	}

}
