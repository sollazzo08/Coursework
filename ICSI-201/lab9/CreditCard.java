package lab9;

public class CreditCard {

	private Person owner; //the owner information
	private Money balance;//the balance on the account 
	private Money creditLimit; //the credit limit on the account 
	
	/**
	 * Constructor
	 * @param newCardHolder the name of credit card owner
	 * @param limit the credit limit 
	 */
	public CreditCard(Person newCardHolder, Money limit) {
	
		creditLimit = limit;
		balance = new Money(0);
		owner = newCardHolder;
	
	}

	/**
	 *
	 * @return The balance on the account
	 */
		public Money getBalance(){
			
		
		return balance;
		}
		
	/**
	 * 	
	 * @return The credit limit on the account
	 */
		public Money getCreditLimit() {
			
		creditLimit = new Money(1000);
			
		return creditLimit;
			
		}
		
	/**
	 * 	
	 * @return The information of the owner
	 */
		public String getPersonals() {
			
		
		String str = owner.toString();
			
		return str;
	
	
			
		}
		
		
	/**
	 * 	
	 * @param amount The amount being charged to the account 
	 */
		public void charge(Money amount) {
		
		//stepping into Money class to use its add method,
		//to add the amount to the balance.
		Money obj = new Money(amount); 
		obj = amount.add(balance);
		
		//  seeing if the amount if larger than credit limit.
		if(obj.compareTo(creditLimit) == -1 ) {
			
			balance = balance.add(amount);	
			System.out.println("Charge: " + amount);
		}
		else {
			System.out.println("Exceeds Credit Limit");
		}
		
		
			
		}

		
	/**
	 * 	
	 * @param amount The amount being paid towards the account 
	 */
		public void payment(Money amount) {
			
			balance = balance.subtract(amount);
			System.out.println("Payment: " + amount);
			
		}
	
}

