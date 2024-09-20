
public class EncapsolutionEX1 {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();//Object creation and memory allocation to the variable emp1 which is type of Employee
		Employee emp2=new Employee();//Object creation and memory allocation to the variable emp2 which is type of Employee
		Employee emp3=new Employee();//Object creation and memory allocation to the variable emp3 which is type of Employee
		Employee emp4=new Employee();//Object creation and memory allocation to the variable emp4 which is type of Employee
		
		System.out.println(emp1); 
		
		emp1.name="Brijesh";
		emp1.setSalary();
		emp1.setCompany();
		
		emp2.name="Dipika";
		emp2.setSalary();
		emp2.setCompany();
		
		emp3.name="Ritik";
		emp3.setSalary();
		emp3.setCompany();
		
		emp4.name="Ashutosh";
		emp4.setSalary();
		emp4.setCompany();
		
		System.out.println(emp1.name+"  "+emp1.getSalary()+"   "+emp1.getCompany());
		System.out.println(emp2.name+"  "+emp2.getSalary()+"   "+emp2.getCompany());
		System.out.println(emp3.name+"  "+emp3.getSalary()+"   "+emp3.getCompany());
		System.out.println(emp4.name+"  "+emp4.getSalary()+"   "+emp4.getCompany());
	}

}
class Employee{
	
	String name;
	private int salary;
	private String cname; //Abstraction 
	
	void setSalary() {
		salary=7000000;
	}
	int getSalary() {
		return salary;
	}
	
	void setCompany() {
		
		cname="Tecresearch";
	}
	String getCompany() {
		return cname;//Abstraction uses a getCompany function key to fetched
	}
}