package p5;

public class Employee {
	private String IdNumber;
	private String HourlyWage;
	
	public Employee() {
		super();
	}

	public Employee(String idNumber, String hourlyWage) {
		super();
		IdNumber = idNumber;
		HourlyWage = hourlyWage;
	}

	public String getIdNumber() {
		return IdNumber;
	}

	public void setIdNumber(String idNumber) {
		IdNumber = idNumber;
	}

	public String getHourlyWage() {
		return HourlyWage;
	}

	public void setHourlyWage(String hourlyWage) {
		HourlyWage = hourlyWage;
	}
	
	

}
