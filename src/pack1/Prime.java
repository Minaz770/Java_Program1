package pack1;

public class Prime {
	public static void main(String[] args) {
		int n=10,i,flag=1;
		if(n==0 || n==1) {
			flag=0;
		}
		else {
			for(i=2;i<=n;i++) {
				if(n%i==0) {
					flag=1;
					break;
				}
			}
			
		}
		if(flag==0) {
			System.out.print("PRIME NUMBER");
		}
		else {
			System.out.print("NOT A PRIME NUMBER");
		}
	}
	
}
