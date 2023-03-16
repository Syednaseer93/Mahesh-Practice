
public class AccountUtility {
	void generateAccountType(Account a)
	{
		if(a.balance>=10000)
		{
			System.out.println("Current account");
		}
		else if(a.balance>1000 && a.balance<10000)
		{
			System.out.println("Savings account");
		}
		else if(a.balance>500 && a.balance<1000)
		{
			System.out.println("Student Account");
		}
		else
		{
			System.out.println("Account is Inactive");
		}


	}
	void blackListAccount(Account a)
	{
		if(a.balance>1000000)
		{

			System.out.println("Account BlackListed");
		}
		
	}

	void markLoanEligibility(Account a)
	{ 

		if(a.balance>500000)
		{
			a.isEligibleForLoan=true;
			System.out.println(a.isEligibleForLoan);
		}
		else
			a.isEligibleForLoan = false;
		System.out.println(a.isEligibleForLoan);
	}
	public static void main(String[] args) {
		AccountUtility au=new AccountUtility();
		Account a=new Account(1022,"Naseer",5000);
	//	Account a2=new Account(1022,"Naseer",5000);
		



		au.generateAccountType(a);
	//	au.blackListAccount(a);
	//	au.markLoanEligibility(a);







	}

}
