package employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeachingStaff staff2 = new TeachingStaff();
		Staff staff3 = new TeachingStaff();
		Staff staff4 = new NonTeachingStaff();
		
		staff3.calculateSalary();
		staff4.calculateSalary();
		
		staff2.teach();

	}

}
