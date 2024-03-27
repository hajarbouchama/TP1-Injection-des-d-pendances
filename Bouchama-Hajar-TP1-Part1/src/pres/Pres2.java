package pres;
import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {

        // TODO Auto-generated method stub
        Scanner scan = new Scanner(new File("src/config.txt"));

        String daoClassName = scan.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao =(IDao) cDao.newInstance();

        String metierClassName = scan.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier =(IMetier) cMetier.newInstance();
        // c'est spring qui va permetre de ne pas creer ses ligne il fait l'injection de dependances

        Method method = cMetier.getMethod("setDao", IDao.class);
        method.invoke(metier,dao);
        System.out.println("Resultat = "+metier.calcul());

    }

}
