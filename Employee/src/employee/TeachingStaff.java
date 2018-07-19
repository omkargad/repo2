package employee;

public class TeachingStaff extends Staff {
private Integer numOfTeachingHours;
	
	public void teach(){
		System.out.println("Teaching now");
	}
	public TeachingStaff(){
		super();
		numOfTeachingHours=0;
	}
	public TeachingStaff(Integer numOfTeachingHours) {
		super();
		this.numOfTeachingHours = numOfTeachingHours;
	}
	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		System.out.println("Teaching staff salary");		
	}
	
	
}
