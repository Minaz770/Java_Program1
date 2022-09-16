package pack1;

public class employee {
	int emp_id;
	String emp_name;
	int emp_salary;
	String emp_des;
	static String company="Evry";
	static String collegeName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee emp= new employee();
		emp.init(1,"John", 20000,"Manager");
		display1();
		emp.display();
		emp.init(2,"Harry", 800000,"CA");
		display1();
		emp.display();
		emp.init(1,"Anu", 20000,"Manager");
		display1();
		emp.display();
		
	}
	void init(int id, String name, int salary, String designation) {
		emp_id=id;
		emp_name=name;
		emp_salary=salary;
		emp_des=designation;
		
	}
	void display() {
		
		System.out.println("Company name: "+company+" Employee id is :"+emp_id+ " Employee name :"+emp_name+ " Employee salary is :"+emp_salary+ " Employee designation is :"+emp_des+ " College name: "+collegeName);
	}
	static void  display1(){
		collegeName="MITE";
		
		
	}
	static {
		System.out.println("Welcome to evry");
	}
}
