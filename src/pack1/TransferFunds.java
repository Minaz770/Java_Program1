package pack1;

class Login1{
    void display() {
        System.out.println("login");
    }
}


class AddBen1 extends Login1{
	 void show() {
         System.out.println("AddBen");
     }

}
public class TransferFunds extends AddBen1{
	public static void main(String[] args) {
        // TODO Auto-generated method stub
		TransferFunds ob=new TransferFunds();
        ob.display();
        ob.show();
        ob.transfer();
    }    
    void transfer() {
            System.out.println("Transfer fund");
        }

	

}
