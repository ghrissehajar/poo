package poo;

public class CompteCourant extends CompteBancaire {
	
	private double decouvertAutorise ;
	
	public CompteCourant(String numeroCompte, String titulaire, double decouvertAutorise) {
		super(numeroCompte,titulaire);// Appel au constructeur de la classe mère
		this.decouvertAutorise=decouvertAutorise;
	}
	public void retirer(double montant) {
		if(montant<=0) {
			System.out.println("Le montant doit être positif");
			return;
		}
		if(this.getsolde()+decouvertAutorise>=montant) {
			double nouveausolde=this.getsolde()-montant;
			super.setsolde(nouveausolde);//msj
			System.out.println("montant retiré : " + montant + ", Nouveau solde : " + nouveausolde);	
		}
		else {
			System.out.println("Retrait refusé : Montant supérieur au solde et au découvert autorisé.");
		}
	}
	
}
