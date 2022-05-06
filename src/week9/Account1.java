package week9;

import java.util.ArrayList;

public class Account1 extends Account{
	public static void main(String[] args) {
		Account1 account = new Account1("George", 1122, 1000);
		account.setAnnualInterestRate(1.65);
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);
		System.out.println("Name: "+ account.customer);
		System.out.println("Annual interest rate: "+account.getAnnualInterestRate());
		System.out.println("Balance: "+account.getBalance());
		System.out.println("Date                              Type       Amount       Balance");
		for(int i=0; i < account.transactions.size(); i++) {
			System.out.print(account.transactions.get(i).getDate());
			System.out.print("        ");
			System.out.print(account.transactions.get(i).getType());
			System.out.print("        ");
			System.out.print(account.transactions.get(i).getAmount());
			System.out.print("        ");
			System.out.print(account.transactions.get(i).getBalance());
			System.out.println();
		}
	}
	
	
	
	private String customer;
	private ArrayList<Transaction> transactions = new ArrayList<>();
	
	public Account1(String name, int id, double balance) {
		super.setId(id);
		super.setBalance(balance);
		this.customer = name;
	}
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		Transaction transaction = new Transaction('W', amount, super.getBalance(), "");
		transactions.add(transaction);
		
	}
	@Override
	public void deposit(double amount) {
		super.deposit(amount);
		Transaction transaction = new Transaction('D', amount, super.getBalance(), "");
		transactions.add(transaction);
	}
	public class Transaction {
		private java.util.Date date;
		private char type;
		private double amount;
		private double balance;
		private String description;
		
		public Transaction(char type, double amount, double balance, String description) {
			this.date = new java.util.Date();
			this.type = type;
			this.amount = amount;
			this.balance = balance;
			this.description = description;
		}
		public java.util.Date getDate() {
			return date;
		}
		public char getType() {
			return this.type;
		}
		public double getAmount() {
			return this.amount;
		}
		public double getBalance() {
			return this.balance;
		}
		public String getDescription() {
			return this.description;
		}
		public void setType(char type) {
			this.type = type;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
}
