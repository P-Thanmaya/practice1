package Assignment;
abstract class Bank {
	abstract void withdraw(double balance, double minimumBalance);
}
class Customer extends Bank{
	int customerid;
	String customerName;
	String emailId;
	void setcustomerid(int customerid) {
		this.customerid=customerid;
		
	}
	void setcustomerName(String customerName) {
		this.customerName=customerName;
		
	}
	void setemailId(String emailId) {
		this.emailId=emailId;
		
	}

	int getcustomerid() {
		return customerid;
	}
	String getcustomerName() {
		return customerName;
	}
	String getemailId() {
		return emailId;
	
    }
	@Override
	void withdraw(double balance, double minimumBalance) {
		// TODO Auto-generated method stub
		
	}
}
class SavingsAcco extends Customer{
	long accountno;
	double balance;
	double minimumBalance;
	double withdraw;
	Customer c;
	void setaccountno(long accountno) {
		this.accountno=accountno;
	}
	void setbalance(double balance) {
		this.balance=balance;
	}
	void setminimumBalance(double minimumBalance) {
		this.minimumBalance=minimumBalance;
	}
	void setwithdraw(double withdraw) {
		this.withdraw=withdraw;
	}
	void setCustomer(Customer c) {
		System.out.println(c.getcustomerid());
		System.out.println(c.getcustomerName());
		System.out.println(c.getemailId());
		}
	long getaccountno() {
		return accountno;
	}
	double getbalance() {
		return balance;
	}
	double getminimumBalance() {
		return minimumBalance;
		
	}
	/*double getwithdraw() {
		return withdraw;
	}*/
	
	
	@Override
	void withdraw(double balance,double minimumBalance) {
		// TODO Auto-generated method stub
		this.balance=balance;
		this.minimumBalance=minimumBalance;
		boolean value=false;
		if(withdraw>balance) {
			System.out.println(value+" "+"failed");
			
		}
		else {
			System.out.println((!value)+" "+"withdraw sucessful");
		}
		
	}
	
	
}

class Bank1{

	public static void main(String args[]) {
		Customer c=new Customer();
		
		c.setcustomerid(101);
		c.setcustomerName("thanmaya");
		c.setemailId("thanmaya@gmail.com");
		//c.getcustomerid();
		//c.getcustomerName();
		//c.getemailId();
		SavingsAcco s=new SavingsAcco();
		s.setCustomer(c);
		s.setaccountno(12344675444l);
		s.getaccountno();
		s.setbalance(40000.0);
		s.getbalance();
		s.setminimumBalance(10000.0);
		s.setwithdraw(30000.0);
		s.withdraw(s.getbalance(),s.getminimumBalance());
		
		

		
		
		
		
	}
		
		
	
}