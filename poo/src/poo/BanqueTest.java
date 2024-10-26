package poo;

public class BanqueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banque banque=new Banque();
		
		CompteBancaire compte1= new CompteBancaire("001","Hajar");
		CompteBancaire compte2= new CompteBancaire("002","Ibrahim");
		CompteBancaire compte3= new CompteBancaire("003","Hiba");

		banque.ajouterCompte(compte1);
		banque.ajouterCompte(compte2);
		banque.ajouterCompte(compte3);
		
		// Effectuer plusieurs transactions sur le compte1
        compte1.deposer(1000);
        compte1.retirer(200);
        compte1.deposer(500);

        // Effectuer plusieurs transactions sur le compte2
        compte2.deposer(1500);
        compte2.retirer(300);
        compte2.retirer(100);

        // Effectuer plusieurs transactions sur le compte3
        compte3.deposer(2000);
        compte3.retirer(500);
        compte3.deposer(300);
        
        
		//dépots
		compte1.deposer(1000);
		compte2.deposer(1500);
		compte3.deposer(2000);
		
		//reteaits
		compte1.retirer(200);
		compte2.retirer(300);
		compte3.retirer(500);
		
		banque.transfert("001", "002", 100);// Transférer 100 de compte1 à compte2
		banque.transfert("002", "003", 200);
		
		compte1.afficherSolde();
		compte2.afficherSolde();
		compte3.afficherSolde();
		
		
		CompteCourant compteCourant = new CompteCourant("001", "Amine", 1000);
	    CompteEpargne compteEpargne = new CompteEpargne("002", "Maha", 2.5);
	    
	    banque.ajouterCompte(compteCourant);
	    banque.ajouterCompte(compteEpargne);
	    
	    compteCourant.deposer(1000);
        compteCourant.retirer(1500);
        
        compteEpargne.deposer(2000);
        compteEpargne.calculerInteret();
	    
        
        compte1.afficherSolde();
        compteCourant.afficherSolde();
        compteEpargne.afficherSolde();
        
     // Afficher l'historique des transactions pour chaque compte
        System.out.println("\nHistorique des transactions du compte 1 :");
        compte1.afficherHistoriqueTransactions();

        System.out.println("\nHistorique des transactions du compte 2 :");
        compte2.afficherHistoriqueTransactions();

        System.out.println("\nHistorique des transactions du compte 3 :");
        compte3.afficherHistoriqueTransactions();
		
        banque.afficherNombreComptes();

	}

    
    

}
