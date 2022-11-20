package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Ngawang Dakpa");
		employee.setAge(27);
		employee.setSex('M');
		employee.setUsCitizen(true);
		System.out.println("Employee Name: " + employee.getName() + "\nAge: " + employee.getAge() + "\nSex: "
				+ employee.getSex() + "\nusCitizen: " + employee.isUsCitizen());

	}

}
