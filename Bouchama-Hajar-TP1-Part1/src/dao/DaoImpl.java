package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData(){
        System.out.println("version base de données");
        double temperature = Math.random()*40;
        return temperature;
    }
}
