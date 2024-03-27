package pres;

import ext.DapImpl2;
import metier.MetierImpl;
public class Presentation {
    public static void main(String[] args) {
        /*
         * Injection des dependances par
         * instanciation statique => new
         */
        // TODO Auto-generated method stub
        DapImpl2 dao = new DapImpl2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("le resultet est : "+metier.calcul());


    }
}
