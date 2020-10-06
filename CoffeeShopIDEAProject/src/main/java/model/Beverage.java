package model;

import java.util.List;

public class Beverage implements Identified<Integer>{
    String beverageType; // type of Beverage - Capucino, Latte, Espresso, Americano
    int beverageId;
    int beveragePrice; // retail price

    List<Equipment> equipmentList; // equipment needed to prepare this beverage
    List<Ingridient> ingridientList;

    public double calculateCost(){
        double cost = 0;
        for(Ingridient ing : ingridientList){
            cost += ing.getPrice()*ing.getAmmount();
        }
        return cost;
    }

    void prepareBeverage(){
        for(Equipment eq : equipmentList){
           eq.performAction(ingridientList);
        }
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "beverageType='" + beverageType + '\'' +
                ", beverageId=" + beverageId +
                ", beveragePrice=" + beveragePrice +
                ", equipmentList=" + equipmentList +
                ", ingridientList=" + ingridientList +
                '}';
    }

    public String getBeverageType() {
        return beverageType;
    }

    public void setBeverageType(String beverageType) {
        this.beverageType = beverageType;
    }

    public int getBeverageId() {
        return beverageId;
    }

    public void setBeverageId(int beverageId) {
        this.beverageId = beverageId;
    }

    public int getBeveragePrice() {
        return beveragePrice;
    }

    public void setBeveragePrice(int beveragePrice) {
        this.beveragePrice = beveragePrice;
    }

    public List<Equipment> getEquipmentList() {
        return equipmentList;
    }

    public void setEquipmentList(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }

    public List<Ingridient> getIngridientList() {
        return ingridientList;
    }

    public void setIngridientList(List<Ingridient> ingridientList) {
        this.ingridientList = ingridientList;
    }

    @Override
    public Integer getId() {
        return null;
    }
}
