package model;

public abstract class Equipment {
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

    public abstract String performAction(); // performs an action that is required by this equipment
}
