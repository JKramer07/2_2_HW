package com.company;

public class Rise extends Food implements Printable{
    private String grade;

    public Rise(String name, String grade){
        super(name);
        this.grade = grade;
    }

    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }

    @Override
    public void print() {
        System.out.println(getName()+"\nGrade: "+grade);
    }
}
