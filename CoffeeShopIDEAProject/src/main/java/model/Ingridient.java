package model;


public class Ingridient implements  Identified<Integer>{
    private int id;
    private String origin;
    private double ammount;
    private int price;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public Ingridient() {
    }

    public Ingridient(String origin) {
        this.origin = origin;
    }


    @Override
    public String toString() {
        return "Ingridient{" +
                "id=" + id +
                ", origin='" + origin + '\'' +
                ", ammount=" + ammount +
                ", price=" + price +
                '}';
    }
}
