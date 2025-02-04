package models;

public class Ami {
    
    // Atributs
    private final String nom;
    private int bieresRestantes;

    // Constructeur
    public Ami(String nom, int bieresRestantes) {
        this.nom = nom;
        this.bieresRestantes = bieresRestantes;
    }

    // Méthodes publiques
    public void boitUneBiere() {
        if (bieresRestantes > 0) {
            bieresRestantes--;
            System.out.println(nom + " a bu une bière. Il lui reste " + bieresRestantes
                    + " bières avant d'être saoul.");
        } else {
            System.out.println(nom + " est déjà saoul et ne peut plus boire !");
        }
    }

    // Getter et Setters
    public String getNom() {
        return nom;
    }

    public int getBieresRestantes() {
        return bieresRestantes;
    }
    
    public void setBieresRestantes(int bieresRestantes){
        this.bieresRestantes = bieresRestantes;
    }
}