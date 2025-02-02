package Ami;

public class Application {
        static class Ami {
                String nom;
                int bieresRestantes;

                public Ami(String nom, int bieresRestantes) {
                        this.nom = nom;
                        this.bieresRestantes = bieresRestantes;
                }

                String getNom() {
                        return nom;
                }

                int getBieresRestantes() {
                        return bieresRestantes;
                }

                void boitUneBiere() {
                        if (bieresRestantes > 0) {
                                bieresRestantes--;
                                System.out.println(nom + " a bu une bière. Il lui reste " + bieresRestantes
                                                + " bières avant d'être saoul.");
                        } else {
                                System.out.println(nom + " est déjà saoul et ne peut plus boire !");
                        }
                }
        }

        public static void main(String[] args) {
                Ami ami1 = new Ami("Kris", 13);
                Ami ami2 = new Ami("Frisk", 3);
                Ami ami3 = new Ami("Chara", 26);

                System.out.println(ami1.getNom() + " peut boire " + ami1.getBieresRestantes() + " bières.");
                System.out.println(ami2.getNom() + " peut boire " + ami2.getBieresRestantes() + " bières.");
                System.out.println(ami3.getNom() + " peut boire " + ami3.getBieresRestantes() + " bières.");


                System.out.println();

                ami1.boitUneBiere();
                ami2.boitUneBiere();
                ami3.boitUneBiere();

                System.out.println();

                System.out.println(ami1.getNom() + " peut boire " + ami1.getBieresRestantes() + " bières.");
                System.out.println(ami2.getNom() + " peut boire " + ami2.getBieresRestantes() + " bières.");
                System.out.println(ami3.getNom() + " peut boire " + ami3.getBieresRestantes() + " bières.");
        }

}
