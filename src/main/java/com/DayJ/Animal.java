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



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



















}
