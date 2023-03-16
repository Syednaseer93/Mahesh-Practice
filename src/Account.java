public class Account {
	String accType;
	String accHolderName;
	double balance;
	int custId;
	boolean isEligibleForLoan;

	
		Account(int custId,String accHolderName,double balance)
		{
			this.custId=custId;
			this.accHolderName=accHolderName;
			this.balance=balance;
		}


		@Override
		public String toString() {
			return "Account [accType=" + accType + ", accHolderName=" + accHolderName + ", balance=" + balance
					+ ", custId=" + custId + ", isEligibleForLoan=" + isEligibleForLoan + "]";
		}
		
		
		
		

	

}
