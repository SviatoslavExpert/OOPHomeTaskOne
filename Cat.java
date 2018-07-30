package com.gmail.s.granovskiy;

/*  declaration and description of Cat class  */
public class Cat {
    private String name;
    private String color;
    private double weight;
    private int age;
    private int strength;
    private int health;
    private int intellect;

    /* object constructor of Cat class */
    /*  access modifier: public !!! */
    public Cat(String name, String color, double weight, int age, int strength, int health, int intellect) {
        super();            /*  constructor by default  */
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
        this.strength = strength;
        this.health = health;
        this.intellect = intellect;
    }

    /* getters and setters of Cat class */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    /* methods of Cat class */
    /* method mew */
    public void mew() {
        System.out.println("Mew!!!");
    }

    /* method scream */
    public void scream() {
        System.out.println("Mew-Mew-Mew-Mew-Mew!!!!!");
    }

    /*  method print  */
    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Age: " + age);
        System.out.println("Strength: " + strength);
        System.out.println("Health: " + health);
        System.out.println("Intellect: " + intellect);
    }

    /* changeTwoProperties method  */
    /*  access modifier: public !!! */
    public Cat changeTwoProperties(Cat a, double newWeight, int newAge){
        a.weight = newWeight;
        a.age = newAge;
        return a;
    }
    /*  changeThreeProperties  */
    /*  access modifier: public !!! */
    public Cat changeThreeProperties(Cat b, int newStrength, int newHealth, int newIntellect){
        b.strength = newStrength;
        b.health = newHealth;
        b.intellect = newIntellect;
        return b;
    }
    /*  The toString() method returns the string representation of the object.  */
    public String toString() {
        return "Cat [name=" + name + ", color=" + color + ", weight=" + weight + ",  age=" + age + ", strength=" + strength + ", health=" + health + ", intellect=" + intellect + "]";
    }
}
