package Encapsulation;

public class Account {

	private int accno;
	private String name;
	private double amount;

	// How to generate getters and setters method?
	// Source--> Generate getters and setters --> select All --> Apply or ok
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}




}
