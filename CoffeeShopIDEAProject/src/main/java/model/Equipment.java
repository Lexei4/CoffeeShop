package model;

import java.util.List;

public abstract class Equipment implements  Identified<Long>{
    String name; // CoffeeMachine, Grinder, Scale

    public Equipment() {
    }

    public Equipment(String name) {
        this.name = name;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract String performAction(List<Ingridient> ingridients); // performs an action that is required by this equipment
}
