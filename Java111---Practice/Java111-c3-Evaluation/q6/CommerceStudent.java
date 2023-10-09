package q6;

public class CommerceStudent implements Student{
	
	private Integer accountMarks;
	private Integer economicMarks;
	private Integer businessStudiesMarks;
	
	public CommerceStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommerceStudent(Integer accountMarks, Integer economicMarks, Integer businessStudiesMarks) {
		super();
		this.accountMarks = accountMarks;
		this.economicMarks = economicMarks;
		this.businessStudiesMarks = businessStudiesMarks;
	}

	public Integer getAccountMarks() {
		return accountMarks;
	}

	public void setAccountMarks(Integer accountMarks) {
		this.accountMarks = accountMarks;
	}

	public Integer getEconomicMarks() {
		return economicMarks;
	}

	public void setEconomicMarks(Integer economicMarks) {
		this.economicMarks = economicMarks;
	}

	public Integer getBusinessStudiesMarks() {
		return businessStudiesMarks;
	}

	public void setBusinessStudiesMarks(Integer businessStudiesMarks) {
		this.businessStudiesMarks = businessStudiesMarks;
	}

	@Override
	public String toString() {
		return "CommerceStudent [accountMarks=" + accountMarks + ", economicMarks=" + economicMarks
				+ ", businessStudiesMarks=" + businessStudiesMarks + "]";
	}

	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		return (accountMarks + economicMarks + businessStudiesMarks)/3.0;
	}
	
	

}
