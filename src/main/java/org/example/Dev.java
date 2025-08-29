package org.example;


public class Dev {
    private int age ;
    private Laptop laptop;

    public Dev(){
        System.out.println("Dev Constructor");
    }

    public Dev(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Dev1");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
        //System.out.println("Spring without boot");
        laptop.compile();
    }
}
