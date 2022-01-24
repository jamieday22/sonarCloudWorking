package com.DayJ;

import java.time.LocalDate;

public abstract class Animal {

/////////////////////////////////////Attributes//////////////////////////////////////////////

    private String name;





    /////////////////////////////////////Constructors/////////////////////////////////////////////

    public Animal(String name){
        this.name = name;
    }






    /////////////////////////////////////Methods//////////////////////////////////////////////////

    public abstract void eat(String food);

    public abstract void breathe();


    public void die(){
        System.out.println("I am dead!");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



















}
