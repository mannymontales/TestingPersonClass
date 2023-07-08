package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    //instance variables (fields)
    private String name;
    private int age;
    private boolean hasPet;
    private char middleInitial;
    private double weight;
    private String address;
    private boolean cartoonCharacter;



    public Person() {
        //this.name = "";
        //this.age = Integer.MAX_VALUE;
        this("", Integer.MAX_VALUE);
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String age) {
        //this.name refers to instance variables  = "age" is the parameter this specific constructor takes
        this.name = age; //setting instance variable
    }

    public  Person(boolean pet){
        this.hasPet = pet;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, boolean pet, char mI, double weight, String addy, boolean anime) {
        this.name = name;
        this.age = age;
        this.hasPet = pet;
        this.middleInitial = mI;
        this.weight = weight;
        this.address = addy;
        this.cartoonCharacter = anime;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }



    //my code

    //GETTERS
    public Boolean getHasPet(){ return this.hasPet;}
    public Character getMiddleInitial(){ return this.middleInitial;}
    public Double getWeight(){ return this.weight;}
    public String getAddress(){ return this.address; }
    public Boolean getCartoon(){ return this.cartoonCharacter;}

    //SETTERS
    public void setHasPet(boolean hasPet) {
        this.hasPet = hasPet;
    }
    public void setMiddleInitial(char mi) { this.middleInitial = mi;}
    public void setWeight(double weight) {this.weight = weight;}
    public void setAddress(String addy){ this.address = addy;};
    public void setCartoonCharacter(boolean cartoonCharacter){ this.cartoonCharacter = cartoonCharacter;}
}
