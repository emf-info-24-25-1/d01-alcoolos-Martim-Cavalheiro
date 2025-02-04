package app;

import models.Ami;

public class Application {
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

