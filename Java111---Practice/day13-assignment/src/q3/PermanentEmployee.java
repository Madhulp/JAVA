package q3;

public class PermanentEmployee extends Employee{
	
	private Double basicPay;

	public PermanentEmployee(Integer employeeId, String employeeName, Double basicPay) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
		this.basicPay = basicPay;
		calculateSalary();
	}

	public Double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(Double basicPay) {
		this.basicPay = basicPay;
	}
	
	@Override
	public void calculateSalary() {
		double pFAmount = basicPay * 0.12;
		Salary = basicPay - pFAmount;
	}
	

}
