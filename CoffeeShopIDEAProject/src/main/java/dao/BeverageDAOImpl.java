package dao;

import model.Beverage;
import java.util.HashMap;

public class BeverageDAOImpl extends AbstractDao<Beverage, Integer> implements BeverageDAO {

    private BeverageDAO beverageDAO;

    public BeverageDAOImpl() {super(Beverage.class, new HashMap<>());
    }

    @Override
    public Beverage findBeverageById(String id) {
        return null;
    }

    @Override
    public Beverage findBeverageByName(String name) {
        return null;
    }

}
