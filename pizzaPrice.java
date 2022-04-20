package Assignments;

public class pizzaPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pizzaPrice=300;
		// Discount on each pizza is 20%
		// Number of Pizza order  is 2
		int totalpizzaAmount= pizzaPrice *2;
		int totaldiscouunt= totalpizzaAmount*20/100;
		int finalPrice=totalpizzaAmount-totaldiscouunt;
		
		System.out.println("Total Discount" +"\t"   +totaldiscouunt);
		
		System.out.println("Total Final Price  "+"\t" +finalPrice);
		
		
	}

}
