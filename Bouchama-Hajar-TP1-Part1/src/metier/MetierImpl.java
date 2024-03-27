package metier;
import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double calcul() {
        double t=dao.getData();
        double res = t*540/Math.cos(t*Math.PI);
        return res;
    }
    /* il permet d'affecter ou bien injecter dans la variable dao
     * un objet d'une classe qui implemente l'interface IDao
     *
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

}