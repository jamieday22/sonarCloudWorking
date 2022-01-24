package com.DayJ;

public class dog extends Mammal{

    ///////////////////////////////////Attributes////////////////////////////////////////

    private String breed;
    private int weight;
    private String sex;
    private String colour;


    /////////////////////////////////////////Constuctors/////////////////////////////////////
    public dog(){
        this("Black");
    }


    public dog(String colour){
        this("DSH",colour);
    }

    public dog(String breed, String colour){
        this(breed,4,colour);
    }

    public dog(String breed, int weight, String colour){
        this(breed,4,"Male",colour);
    }

    public dog(String breed, int weight, String sex, String colour){
        super("dog");
        this.colour = colour;
        this.sex = sex;
        this.weight = weight;
        this.breed = breed;
    }
    public dog(String breed, int weight, String sex, String colour,String name){
        super(name);
        this.colour = colour;
        this.sex = sex;
        this.weight = weight;
        this.breed = breed;
    }

    //////////////////////////////////////////Methods/////////////////////////////////////////

    public void eat(String food){
        System.out.println("I am eating "+food);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
