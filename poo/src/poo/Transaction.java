package poo;

import java.util.Date;

public class Transaction {
	private String type;
	private double montant;
	private Date date;
	
	public Transaction(String type, double montant) {
		this.type=type;
		this.montant=montant;
		this.date= date;
	}
	public String gettype() {
		return type;
	}
	public double getmontant() {
		return montant;
	}
	public Date getdate() {
		return date;
	}
public void afficherTransaction() {
	System.out.println("type :" + type + ", montant :" + montant + ", date :" + date);
}
}
