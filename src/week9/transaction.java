package week9;

public class transaction{
	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	public transaction(char type, double amount, double balance, String description) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
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
