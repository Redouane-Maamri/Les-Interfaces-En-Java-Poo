// Interface Paiement
interface Paiement {
    void payer(double montant);
}

// Implémentation : Carte bancaire
class CarteBancaire implements Paiement {
    @Override
    public void payer(double montant) {
        System.out.println("💳 Paiement de :" + montant + " MAD par carte bancaire.");
    }
}

// Implémentation : PayPal
class PayPal implements Paiement {
    @Override
    public void payer(double montant) {
        System.out.println("🅿️ Paiement de :" + montant + " MAD via PayPal.");
    }
}

// Implémentation : Crypto
class CryptoMonnaie implements Paiement {
    @Override
    public void payer(double montant) {
        System.out.println("🪙 Paiement de " + montant + " MAD en cryptomonnaie.");
    }
}

class Bitcoin implements Paiement {
    @Override
    public void payer(double montant){
        System.out.println("Paiement de  : " + montant + "$ en Bitcoin");
    }
}

class AmericanExpress implements Paiement{
    @Override
    public void payer(double montant){
        System.out.println("Paiement By  : " + montant + "$ en American Express");
    }
}

// Classe principale avec polymorphisme
public class ApplicationPaiement {

    // Méthode polymorphe
    public static void traiterPaiement(Paiement methode, double montant) {
        methode.payer(montant);
    }

    public static void main(String[] args) {
        Paiement cb = new CarteBancaire();
        Paiement paypal = new PayPal();
        Paiement crypto = new CryptoMonnaie();
        Paiement bitcoin=new Bitcoin();
        Paiement american=new AmericanExpress();

        // Utilisation du polymorphisme
        traiterPaiement(cb, 200);
        traiterPaiement(paypal, 150);
        traiterPaiement(crypto, 300);
        traiterPaiement(bitcoin, 8000);
        traiterPaiement(american, 100000);
    }
}
