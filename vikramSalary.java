package Assignments;

public class vikramSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v_baseSalary=85000;
		int totalAmountofTax=(v_baseSalary)*20/100;
		int v_totalSalaryAfterTax= v_baseSalary-totalAmountofTax;
		int v_salaryperyear=v_totalSalaryAfterTax*12;
		
		System.out.println("Total Amount of Tax    $" +totalAmountofTax);
		
		System.out.println("Vikaram Total Salary after tax  $" +v_totalSalaryAfterTax);
		
		System.out.println("Vikram total salary per Year is   $"+v_salaryperyear);
		
		
		
	}

}
