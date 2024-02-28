package Assignment5_Part2;

public abstract class Employee {
	private String name, designation, dept, bankName,DOJ ;
	private int employeeId, totalWorkingDays, lop, leavesTaken;
	private long accountNo, UAN, PFNo, ESINo ;
	private double grossWage, basicWage, hra, conveyanceAllowance, medicalAllowance, otherAllowance, EPF, healthInsuranceAmt, PT, loanRecovery, totalDeductions, net_salary,totalEarnings,bonus,bonus_salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getDOJ() {
		return DOJ;
	}
	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getTotalWorkingDays() {
		return totalWorkingDays;
	}
	public void setTotalWorkingDays(int totalWorkingDays) {
		this.totalWorkingDays = totalWorkingDays;
	}
	public int getLop() {
		return lop;
	}
	public void setLop(int lop) {
		this.lop = lop;
	}
	public int getLeavesTaken() {
		return leavesTaken;
	}
	public void setLeavesTaken(int leavesTaken) {
		this.leavesTaken = leavesTaken;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getUAN() {
		return UAN;
	}
	public void setUAN(long uAN) {
		UAN = uAN;
	}
	public long getPFNo() {
		return PFNo;
	}
	public void setPFNo(long pFNo) {
		PFNo = pFNo;
	}
	public long getESINo() {
		return ESINo;
	}
	public void setESINo(long eSINo) {
		ESINo = eSINo;
	}
	public double getGrossWage() {
		return grossWage;
	}
	public void setGrossWage(double grossWage) {
		this.grossWage = grossWage;
	}
	public double getBasicWage() {
		return basicWage;
	}
	public void setBasicWage(double basicWage) {
		this.basicWage = basicWage;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getConveyanceAllowance() {
		return conveyanceAllowance;
	}
	public void setConveyanceAllowance(double conveyanceAllowance) {
		this.conveyanceAllowance = conveyanceAllowance;
	}
	public double getMedicalAllowance() {
		return medicalAllowance;
	}
	public void setMedicalAllowance(double medicalAllowance) {
		this.medicalAllowance = medicalAllowance;
	}
	public double getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	public double getEPF() {
		return EPF;
	}
	public void setEPF(double ePF) {
		EPF = ePF;
	}
	public double getHealthInsuranceAmt() {
		return healthInsuranceAmt;
	}
	public void setHealthInsuranceAmt(double healthInsuranceAmt) {
		this.healthInsuranceAmt = healthInsuranceAmt;
	}
	public double getPT() {
		return PT;
	}
	public void setPT(double pT) {
		PT = pT;
	}
	public double getLoanRecovery() {
		return loanRecovery;
	}
	public void setLoanRecovery(double loanRecovery) {
		this.loanRecovery = loanRecovery;
	}
	public double getTotalDeductions() {
		return totalDeductions;
	}
	public void setTotalDeductions(double totalDeductions) {
		this.totalDeductions = totalDeductions;
	}
	public double getNet_salary() {
		return net_salary;
	}
	public void setNet_salary(double net_salary) {
		this.net_salary = net_salary;
	}
	public double getTotalEarnings() {
		return totalEarnings;
	}
	public void setTotalEarnings(double totalEarnings) {
		this.totalEarnings = totalEarnings;
	}

	public abstract double theMonthly();
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getBonus_salary() {
		return bonus_salary;
	}
	public void setBonus_salary(double bonus_salary) {
		this.bonus_salary = bonus_salary;
	}
	
	
}

package Assignment5_Part2;

public class NormalEmployee extends Employee {

	@Override
	public double theMonthly() {
		
	
		//Earnings
		
		//BasicWage
		setBasicWage(((getGrossWage()/getTotalWorkingDays())*(getTotalWorkingDays()-getLop()))*0.45);
		
		//HRA
		setHra(getBasicWage()*0.4);
		
		//ConveyanceAllowance
		setConveyanceAllowance((1600/getTotalWorkingDays())*(getTotalWorkingDays()-getLop()));
		
		//MedicalAllowance
		setMedicalAllowance((1250/getTotalWorkingDays())*(getTotalWorkingDays()-getLop()));
		
		//OtherAllowance
		setOtherAllowance(((getGrossWage()/getTotalWorkingDays())*(getTotalWorkingDays()-getLop()))-getBasicWage()-getHra()-getConveyanceAllowance()-getMedicalAllowance());
		
		//TotalEarnings
		setTotalEarnings(getBasicWage() + getHra() + getConveyanceAllowance() + getMedicalAllowance() + getOtherAllowance());
				
				
		//Deductions
		
		//EPF
		if(getBasicWage()>=15000)
		{
			setEPF(15000*0.12);
		}
		else {
			setEPF(getBasicWage()*0.15);
		}
		
		//ESI
		if(getGrossWage()<=21000)
		{
			setHealthInsuranceAmt(getTotalEarnings()*0.0075);
		}
		else
		{
			setHealthInsuranceAmt(0);
		}
		
		//ProfessionalTax
		setPT(0);
		
		//LoanRecovery
		setLoanRecovery(0);

		//Total Deductions
		setTotalDeductions(getEPF() + getHealthInsuranceAmt() + getPT() + getLoanRecovery());
		
		//Net_Salary
		setNet_salary(getTotalEarnings() - getTotalDeductions());
		
		return getNet_salary();
		
	}

	
}

package Assignment5_Part2;

public class BonusEmployee extends Employee {

	@Override
	public double theMonthly() {
		
	
		//Earnings
		
		//BasicWage
		setBasicWage(((getGrossWage()/getTotalWorkingDays())*(getTotalWorkingDays()-getLop()))*0.45);
		
		//HRA
		setHra(getBasicWage()*0.4);
		
		//ConveyanceAllowance
		setConveyanceAllowance((1600/getTotalWorkingDays())*(getTotalWorkingDays()-getLop()));
		
		//MedicalAllowance
		setMedicalAllowance((1250/getTotalWorkingDays())*(getTotalWorkingDays()-getLop()));
		
		//OtherAllowance
		setOtherAllowance(((getGrossWage()/getTotalWorkingDays())*(getTotalWorkingDays()-getLop()))-getBasicWage()-getHra()-getConveyanceAllowance()-getMedicalAllowance());
		
		//TotalEarnings
		setTotalEarnings(getBasicWage() + getHra() + getConveyanceAllowance() + getMedicalAllowance() + getOtherAllowance());
				
				
		//Deductions
		
		//EPF
		if(getBasicWage()>=15000)
		{
			setEPF(15000*0.12);
		}
		else {
			setEPF(getBasicWage()*0.15);
		}
		
		//ESI
		if(getGrossWage()<=21000)
		{
			setHealthInsuranceAmt(getTotalEarnings()*0.0075);
		}
		else
		{
			setHealthInsuranceAmt(0);
		}
		
		//ProfessionalTax
		setPT(0);
		
		//LoanRecovery
		setLoanRecovery(0);

		//Total Deductions
		setTotalDeductions(getEPF() + getHealthInsuranceAmt() + getPT() + getLoanRecovery());
		
		//Net_Salary
		setNet_salary(getTotalEarnings() - getTotalDeductions());
		
		//Bonus_salary
		setNet_salary((getNet_salary()*getBonus())+getNet_salary());
		
		
		return getNet_salary();
		
	}

	
}

package Assignment5_Part2;

public class PaySlip {

	public static void main(String[] args) {
		
		
		NormalEmployee employee1 = new NormalEmployee();
		employee1.setName("John Doe");
        employee1.setEmployeeId(123);
        employee1.setDesignation("Sales Head");
        employee1.setDept("Sales");
        employee1.setDOJ("12/02/2023");
        employee1.setUAN(1232765678);
        employee1.setPFNo(56797545);
        employee1.setBankName("SBI");
        employee1.setAccountNo(1234567898);
        
        
        employee1.setGrossWage(21000.0);
        employee1.setTotalWorkingDays(30);
        employee1.setLop(1);
        
        double netSalary = employee1.theMonthly();
        System.out.println("------------Normal Employee------------");
        printPaySlip(employee1, netSalary);
        
        BonusEmployee employee2 = new BonusEmployee();
		employee2.setName("Amy Wilson");
        employee2.setEmployeeId(223);
        employee2.setDesignation("Sales Manager");
        employee2.setDept("Sales");
        employee2.setDOJ("14/09/2021");
        employee2.setUAN(274565678);
        employee2.setPFNo(67497545);
        employee2.setBankName("SBI");
        employee2.setAccountNo(456781298);
        
        
        employee2.setGrossWage(21000.0);
        employee2.setTotalWorkingDays(30);
        employee2.setLop(1);
        
        employee2.setBonus(0.105);
        
        
        double netSalary2 = employee2.theMonthly();
        System.out.println();
        System.out.println();
        System.out.println("------------Bonus Employee------------");
        printPaySlip(employee2, netSalary2);
		

	}
	
	private static void printPaySlip(Employee employee1, double netSalary) {
		
        System.out.println("Pay Slip for Employee:	" + employee1.getName());
        System.out.println("Employee ID:		" + employee1.getEmployeeId());
        System.out.println("Designation:		" + employee1.getDesignation());
        System.out.println("Department:		" + employee1.getDept());
        System.out.println("Date of Joining:		" + employee1.getDOJ());
        System.out.println("UAN:			" + employee1.getUAN());
        System.out.println("PF Number:		" + employee1.getPFNo());
        System.out.println("ESI Number:		" + employee1.getESINo());
        System.out.println();
        
        System.out.println("Bank Name:		" + employee1.getBankName());
        System.out.println("Account Number:		" + employee1.getAccountNo());
        
        System.out.println("Gross Wage:		" + employee1.getGrossWage());
        System.out.println("Total Working Days:	" + employee1.getTotalWorkingDays());
        
        System.out.println("Loss of Pay Days:	" + employee1.getLop());

        
        
        System.out.println();

        // Print salary-Earnings components
        System.out.println("Earnings");
        System.out.println("Basic Wage: 		  " + employee1.getBasicWage());
        System.out.println("HRA: 	    		  " + employee1.getHra());
        System.out.println("Conveyance Allowance:     " + employee1.getConveyanceAllowance());
        System.out.println("Medical Allowance: 	  " + employee1.getMedicalAllowance());
        System.out.println("Other Allowance: 	  " + employee1.getOtherAllowance());
        System.out.println("Total Earnings: 		  " + employee1.getTotalEarnings());
        System.out.println();
        
        // Print salary-Deductions components
        System.out.println("Deductions");
        System.out.println("EPF:			  " + employee1.getEPF());
        System.out.println("Health Insurance: 	  " + employee1.getHealthInsuranceAmt());
        System.out.println("Professional Tax: 	  " + employee1.getPT());
        System.out.println("Loan Recovery:		  " + employee1.getLoanRecovery());
        System.out.println("Total Deductions:	  " + employee1.getTotalDeductions());
        
        

        // Print total earnings, total deductions, and net salary
        
        
        System.out.println();
        System.out.println("Net_Salary");
        System.out.println("Net Salary: 		  " + netSalary);
    }

}
