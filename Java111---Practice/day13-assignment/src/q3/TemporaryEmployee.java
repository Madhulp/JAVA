package q3;

public class TemporaryEmployee extends Employee{
	
	private Integer houseWorked;
	private Integer hourlyWages;
	
	public TemporaryEmployee(Integer houseWorked, Integer hourlyWages, Integer employeeId, String employeeName) {
		super(employeeId, employeeName);
		this.houseWorked = houseWorked;
		this.hourlyWages = hourlyWages;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		
		calculateSalary();
	}
	
	
	public Integer getHouseWorked() {
		return houseWorked;
	}


	public void setHouseWorked(Integer houseWorked) {
		this.houseWorked = houseWorked;
	}


	public Integer getHourlyWages() {
		return hourlyWages;
	}


	public void setHourlyWages(Integer hourlyWages) {
		this.hourlyWages = hourlyWages;
	}


	@Override
	public void calculateSalary() {
		// TODO Auto-generated method stub
		Salary =(double) (hourlyWages * houseWorked);
	}
	

}
