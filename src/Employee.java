
public class Employee {

	public String name;
		
		public Employee(String name) {
			this.name = name;
		}
		public void notifyEmployees(String workstep, String ceoName) {
			System.out.println("" + this.name + ", " + ceoName + " has created a new work order. " + 
					"Title: " + workstep);
		}
		
		private boolean isEmployedInTheCompany(Ceo c1) {
			return c1.isEmployee(this);
		}
		
		public void employee(Ceo c1) {
			if (this.isEmployedInTheCompany(c1)) {
				System.out.println("Already hired");
			}
			else {
				c1.hireEmployee(this);
			}
		}
		
		public void fireEmployee(Ceo c1) {
			if (this.isEmployedInTheCompany(c1)) {
				c1.fireEmployee(this);
			}
			else {
				System.out.println("Already fired");
			}
		}
	

}
