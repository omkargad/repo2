package employee;

public class NonTeachingStaff extends Staff {
	private Integer noOfAdminLeaves;

	public NonTeachingStaff() {
		super();
		noOfAdminLeaves = 0;
	}

	public NonTeachingStaff(Integer noOfAdminLeaves) {
		super();
		this.noOfAdminLeaves = noOfAdminLeaves;
	}

	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Non teaching salary");
		
	}
	
	
}
