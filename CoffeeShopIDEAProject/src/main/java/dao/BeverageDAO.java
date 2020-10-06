package dao;

import model.Beverage;
import model.Ingridient;

public interface BeverageDAO  extends GenericDAO<Beverage, Integer>{


    Beverage findBeverageById(String id);

    Beverage findBeverageByName(String name);
}
