package poo;

import java.util.ArrayList;
import java.util.List;

public class CompteBancaire {
	//Attributs
	private String numeroCompte;
	private double solde;
	private String titulaire ;
	private List<Transaction> transactions; 

	//constructeur
	public CompteBancaire() {}
	public CompteBancaire (String nC,  String t) {
	this.numeroCompte=nC;
	this.solde=0.0;
	this.titulaire=t;
	 this.transactions = new ArrayList<>(); // Initialisation de la liste des transactions 
	
	}
	//methodes
	 public void deposer(double montant) {
	        if (montant > 0) {
	            this.solde += montant;
	            transactions.add(new Transaction("credit", montant));  // Enregistre la transaction

	            System.out.println("Montant déposé : " + montant);
	        } else {
	            System.out.println("Le montant doit être positif.");
	        }
	    }
	 public void retirer(double montant) {
	        if (montant > 0 && this.solde >= montant) {
	            this.solde -= montant;
	            transactions.add(new Transaction("debit", montant));  // Enregistre la transaction

	            System.out.println("Montant retiré : " + montant);
	        } else if (montant <= 0) {
	            System.out.println("Le montant doit être positif.");
	        } else {
	            System.out.println("Solde insuffisant.");
	        }
	    }
	public void afficherSolde() {
		System.out.println("le solde est:"+ this.solde);
		
	}
	//getset
	public String getnumeroCompte() {
		return this.numeroCompte;
	}
	public double getsolde() {
		return this.solde;
	}
	public void settitulaire(String t) {
		this.titulaire=t;
	}
	public void setsolde(double nouveausolde) {
		// TODO Auto-generated method stub
		this.solde=solde;
	}
	public ArrayList<Transaction> getTransactions() {
        return (ArrayList<Transaction>) transactions;
    }
	public void afficherHistoriqueTransactions() {
		// TODO Auto-generated method stub
		
	}
	
}
