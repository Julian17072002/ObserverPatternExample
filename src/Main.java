
public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee("Marsha Boone");
		Employee e2 = new Employee("Albert Hansen");
		Employee e3 = new Employee("Jerry Jones");
		
		Ceo c1 = new Ceo("Julian Spreng");
		
		e1.employee(c1);
		e2.employee(c1);
		e3.employee(c1);
		
		c1.worksteps("Develop new product");
		
		e2.fireEmployee(c1);
			
		System.out.println("");
		c1.worksteps("Marketing for the new product"); //keine Nachricht mehr an e2
		
	}

}
