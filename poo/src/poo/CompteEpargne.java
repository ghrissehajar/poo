package poo;

public class CompteEpargne extends CompteBancaire{
	
	private double tauxInteret;
	
	public CompteEpargne(String numeroCompte, String titulaire, double tauxInteret) {
        super(numeroCompte, titulaire);
        this.tauxInteret = tauxInteret;
    }
	 public void calculerInteret() {
	        double interet = getsolde() * tauxInteret / 100;
	        double nouveauSolde = this.getsolde() + interet;
	        super.setsolde(nouveauSolde);
	        System.out.println("Intérêts ajoutés : " + interet + ", Nouveau solde : " + nouveauSolde);
	 }
}
