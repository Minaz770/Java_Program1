package pack1;
class Login{
    void display() {
        System.out.println("login");
    }
}


    
   
class AddBen extends Login{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AddBen ob=new AddBen();
        ob.display();
        ob.show();
    }    
    void show() {
            System.out.println("AddBen");
        }

   }

