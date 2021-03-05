package com.company;

public class Bread extends Food implements Printable{
    private int price;


    public Bread(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String print() {
        System.out.println(getName()+"\nPrice: "+price);
        return null;
    }
}
