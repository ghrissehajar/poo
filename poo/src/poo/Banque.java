package poo;
import java.util.ArrayList;
public class Banque {
	//Attributs
	private ArrayList<CompteBancaire> comptes;
	private static int nombreComptes = 0;

//constructeur
public Banque() {
    this.comptes = new ArrayList<>();
}
public void ajouterCompte(CompteBancaire compte) {
    this.comptes.add(compte);
    nombreComptes++;
    System.out.println("Compte ajouté : " + compte.getnumeroCompte());
}
public CompteBancaire chercherCompte(String numeroCompte) {
    for (CompteBancaire compte : comptes) {
        if (compte.getnumeroCompte().equals(numeroCompte)) {
            return compte;
        }
    }
    System.out.println("Compte non trouvé : " + numeroCompte);
    return null;
}

public void transfert(String numeroSource, String numeroDest, double montant) {
	CompteBancaire source = chercherCompte(numeroSource);
    CompteBancaire destination = chercherCompte(numeroDest);
    if (source != null && destination != null) {
       if(source.getsolde()>= montant) {
    	   source.retirer(montant);
           destination.deposer(montant);
           System.out.println("Transfert de " + montant + " effectué de " + numeroSource + " à " + numeroDest);
       } else {
           System.out.println("Solde insuffisant pour effectuer le transfert.");
       }
   } else {
       System.out.println("Opération annulée : compte source ou destination introuvable.");
   }
}
public static void afficherNombreComptes() {
    System.out.println("Nombre total de comptes bancaires : " + nombreComptes);
}
}
