import com.ibm.emp.Employee;
import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmployeeJava {
	
	public static void main(String[] args) {
//		Employee e1 = new Employee("Ankita",1000000);
//		e1.payslip();
//		System.out.println(e1.getSalary());
//		
//		Employee e2 = new Employee();
//		e2.payslip();
//		
//		Manager m1 = new Manager("Ashwini",20000, 1000);
//		System.out.println("---------Manager--------");
//		m1.payslip();
//		System.out.println(m1.getSalary());
//		
//		Executive ex1 = new Executive("Shruti",80000, 1000);
//		System.out.println("---------Executive--------");
//		ex1.payslip();
//		System.out.println(ex1.getSalary());
		
		Manager m1 = new Manager("Ashwini",20000, 1000);
		Executive ex1 = new Executive("Shruti",80000, 1000);
		
		showSalary(m1);
		showSalary(ex1);

	}

	//polymorphism
	private static void showSalary(Employee e1) {
			//System.out.println("Employee salary: " + e1.getSalary());
			if (e1 instanceof Manager) //runtime identity
				System.out.println("Manager Salary : "+ e1.getSalary());
			else
				System.out.println("Executive Salary : "+ e1.getSalary());
	}
	
	

//	private static void showSalary(Executive ex1) {
//		
//		System.out.println("Executive Salary: " + ex1.getSalary());
//	}
//
//	private static void showSalary(Manager m1) {
//		
//		System.out.println("Manager Salary : "+ m1.getSalary());
//	}
}
