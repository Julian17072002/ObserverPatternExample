import java.util.ArrayList;
import java.util.List;
 
public class Ceo {
	
	public String name;
	private String newWorkstep;
	private List<Employee> employee = new ArrayList<>();
	
	public Ceo(String ceoName) {
		this.name = ceoName;
	}
	
	public boolean isEmployee(Employee em) {
		return this.employee.contains(em);
	}
	
	public void hireEmployee(Employee em) {
		this.employee.add(em);
	}
	
	public void fireEmployee(Employee em) {
		this.employee.remove(em);
	}
	
	public void worksteps(String workstep) {
		this.newWorkstep = workstep;
		for (int i = 0; i < employee.size(); i++) {
			employee.get(i).notifyEmployees(this.newWorkstep, this.name);
		}
	}
	

}
