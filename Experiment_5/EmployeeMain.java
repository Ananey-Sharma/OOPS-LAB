

//Base class Employee
class Employee {

  void work() {
      System.out.println("Employee is working");
  }

  double getSalary() {
      return 50000; // Example fixed salary
  }
}

//Subclass HRManager extends Employee
class HRManager extends Employee {

  @Override
  void work() {
      System.out.println("HR Manager is managing HR tasks");
  }

  void addEmployee() {
      System.out.println("New employee added by HR Manager");
  }
}

public class EmployeeMain {

	public static void main(String[] args) {
		HRManager hr = new HRManager();

        hr.work();   // Overridden method

        System.out.println("Salary: " + hr.getSalary());  // Inherited method

        hr.addEmployee();   // New method in subclass
    


	}

}