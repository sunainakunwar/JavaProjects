package Assignments;

public class sarathPandInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int DepositAmount = 500000;
		int timeInYear=5;
		double IntersteRate= 6.8;
		
		double TotalIntersteAmount= DepositAmount*timeInYear*IntersteRate/100;
		
		double TotalAmountbyEndOfFiveYear=DepositAmount+IntersteRate;
		
		
		System.out.println(" Total intrest Amount"+ "\t$" +TotalIntersteAmount );
		
		System.out.println(" Total Amount at end of 5 Years"+ "\t$" +TotalAmountbyEndOfFiveYear );
		
	}

}
