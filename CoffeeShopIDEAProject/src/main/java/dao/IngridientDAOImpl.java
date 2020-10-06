package dao;

import model.Ingridient;

import java.util.HashMap;
import java.util.UUID;

public class IngridientDAOImpl extends AbstractDao<Ingridient, Integer> implements IngridientDAO {

    public IngridientDAOImpl() {
        super(Ingridient.class, new HashMap<>());
    }

    public boolean ingridientExist(String name){
        for (Ingridient el : elements.values()) {
            if (el.getOrigin().equals(name)) {
                return true;
            }
        }
        return false;
    };
    public Ingridient findIngridientById(String id){
        throw new UnsupportedOperationException("Not exists operation");
    };

    public Ingridient findIngridientByName(String name){
        throw new UnsupportedOperationException("Not exists operation");
    };
}
