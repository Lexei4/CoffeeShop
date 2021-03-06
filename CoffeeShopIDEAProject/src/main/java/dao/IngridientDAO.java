package dao;

import model.Ingridient;

import java.util.UUID;

public interface IngridientDAO extends GenericDAO<Ingridient, UUID>{

    boolean ingridientExist(String username);

    Ingridient findIngridientById(String id);

    Ingridient findIngridientByName(String name);

}
