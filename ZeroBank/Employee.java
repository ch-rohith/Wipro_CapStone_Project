package Control_statement_practise;

public class Employee {
	Employee()
	{
		System.out.println("Default constructor");
	}
	Employee(int id, String name)
	{
		System.out.println("Id is="+id);
		System.out.println("Name is="+name);		
	}
	Employee(String name, int id)
	{
		System.out.println("Name is="+name);
		System.out.println("Id is="+id);
		
	}
	Employee(String name, int id,float salary)
	{
		System.out.println("Name is"+name);
		System.out.println("Id is"+id);
		System.out.println("Salary is"+salary);
	}

	public static void main(String[]args) {
		Employee emp = new Employee("rohith",21,25000);
	}
	

	

}
