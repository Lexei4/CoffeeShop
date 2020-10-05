package model;


public abstract class Ingridient {
    private String name;
    private Float ammount;
    private Float price;

    public Ingridient() {
    }

    public Ingridient(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAmmount(Float ammount) {
        this.ammount = ammount;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Float getAmmount() {
        return ammount;
    }

    public Float getPrice() {
        return price;
    }






}
