package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List; 

public class Q7 {
	
	public class Employee implements Comparator<Employee> {
		String name, department;
		Integer age;
		
		//public age;
		
		public int compare(Employee employee, Employee otherEmployee) {
			if (employee.name == otherEmployee.name) {
				//Sort on other attributes
				if (employee.department == otherEmployee.department ) {
					//Sort by age
					return employee.age.compareTo(otherEmployee.age);
				} else {
					return employee.department.compareTo(otherEmployee.department);
				}
			} else {
				return employee.name.compareTo(otherEmployee.name);
				}
			}
		
		public String toString() {
			return name + "," + department + "," + age + " ";
			
		}
		}
	public <T> void Compare() {
		
		Employee nicole = new Employee();
		nicole.name = "Nicole";
		nicole.department = "Accounting";
		nicole.age = 43;
		
		Employee john = new Employee();
		john.name = "John";
		john.department = "Accounting";
		john.age = 47;
		
		Employee nicole2 = new Employee();
		nicole2.name = "Nicole";
		nicole2.department = "Nicole";
		nicole2.age = 45;
		
		Employee john2 = new Employee();
		john2.name = "John";
		john2.department = "Sales";
		john2.age = 38;
		
		ArrayList<Employee> employees = new ArrayList<Employee>(); 
		employees.add(nicole);
		employees.add(john);
		employees.add(nicole2);
		employees.add(john2);
		
		
		Collections.sort((List<T>) employees);
		
		for (int i = 0; i <employees.size(); ++i) {
			System.out.println(employees.get(i).toString());
			
		}
	}

	
}
