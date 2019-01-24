package org.apex.work;

public class Employee {
	private int empNo, zipCode, experienceinYears;
	private String phone;
	private double basic, hra, bonus;
	private String empName, address, State, designation,emailAddress;

	public Employee() {
		super();
	}



	public Employee(int empNo,String empName, String address,String state,int zipCode, String phone,String designation, int experienceinYears,String emailAddress, double basic, double hra, double bonus) {
		super();
		this.setEmpNo(empNo);
		this.setZipCode(zipCode);
		this.setPhone(phone);
		this.setExperienceinYears(experienceinYears);
		this.setBasic(basic);
		this.setHra(hra);
		this.setBonus(bonus);
		this.setEmpName(empName);
		this.setAddress(address);
		this.setState(state);
		this.setDesignation(designation);
		this.setEmailAddress(emailAddress);
	}



	public int getEmpNo() {
		return empNo;
	}



	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}



	public int getZipCode() {
		return zipCode;
	}



	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public int getExperienceinYears() {
		return experienceinYears;
	}



	public void setExperienceinYears(int experienceinYears) {
		this.experienceinYears = experienceinYears;
	}



	public double getBasic() {
		return basic;
	}



	public void setBasic(double basic) {
		this.basic = basic;
	}



	public double getHra() {
		return hra;
	}



	public void setHra(double hra) {
		this.hra = hra;
	}



	public double getBonus() {
		return bonus;
	}



	public void setBonus(double bonus) {
		this.bonus = bonus;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getState() {
		return State;
	}



	public void setState(String state) {
		State = state;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public double totalSalary() {
		double bonusValue= (this.getBonus()/100) * this.getBasic();
		return (this.getBasic()+ this.getHra() + bonusValue);
	}
	
	public void display() {
		System.out.println("Employee Number: "+ this.getEmpNo());
		System.out.println("Employee Name: "+ this.getEmpName());
		System.out.println("Address: "+ this.getAddress());
		System.out.println("State: "+ this.getState());
		System.out.println("Zip Code: "+ this.getZipCode());
		System.out.println("Phone: "+ this.getPhone());
		System.out.println("Designation: "+ this.getDesignation());
		System.out.println("Exp In Years: "+ this.getExperienceinYears());
		System.out.println("Email: "+ this.getEmailAddress());
		System.out.println("Basic Salary: "+ this.getBasic());
		System.out.println("HRA: "+ this.getHra());
		System.out.println("Bonus Percentage: "+ this.getBonus()+"%");
		System.out.println("Total Salary: "+ this.totalSalary());
		
	}
}
