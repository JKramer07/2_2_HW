package com.company;

public class Apples extends Food implements Printable{
    private int weight;


    public Apples(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void print() {
        System.out.println(getName()+"\nWeight: "+weight);
    }
}
