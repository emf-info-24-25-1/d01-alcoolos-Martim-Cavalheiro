package app;

import models.Ami;

public class Application {
    public static void main(String[] args) {
        int saoul = 0;
        boolean saoulCompte1 = false;
        boolean saoulCompte2 = false;
        boolean saoulCompte3 = false;
        Ami ami1 = new Ami("Kris", 14);
        Ami ami2 = new Ami("Frisk", 4);
        Ami ami3 = new Ami("Chara", 27);

        while (saoul < 3) {
            if (ami1.getBieresRestantes() <= 0) {
                System.out.println(ami1.getNom() + " ne peut plus boire de bières.");
                if (saoulCompte1 == false) {
                    ++saoul;
                    saoulCompte1 = true;
                }

            } else {
                System.out.println(ami1.getNom() + " peut boire " + ami1.getBieresRestantes() + " bières.");
            }

            if (ami2.getBieresRestantes() <= 0) {
                System.out.println(ami2.getNom() + " ne peut plus boire de bières.");
                if (saoulCompte2 == false) {
                    ++saoul;
                    saoulCompte2 = true;
                }

            } else {
                System.out.println(ami2.getNom() + " peut boire " + ami2.getBieresRestantes() + " bières.");
            }

            if (ami3.getBieresRestantes() <= 0) {
                System.out.println(ami3.getNom() + " ne peut plus boire de bières.");
                if (saoulCompte3 == false) {
                    ++saoul;
                    saoulCompte3 = true;
                }

            } else {
                System.out.println(ami3.getNom() + " peut boire " + ami3.getBieresRestantes() + " bières.");
            }

            System.out.println();

            ami1.boitUneBiere();
            ami2.boitUneBiere();
            ami3.boitUneBiere();

            System.out.println();
        }
    }
}
