package dao;

import model.Ingridient;

public interface IngridientDAO extends GenericDAO<Ingridient, Integer>{

    boolean ingridientExist(String username);

    Ingridient findIngridientById(String id);

    Ingridient findIngridientByName(String name);

}
