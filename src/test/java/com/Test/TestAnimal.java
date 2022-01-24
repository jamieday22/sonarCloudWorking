
package com.Test;
import com.DayJ.Animal;

import com.DayJ.Animal;
import org.junit.jupiter.api.Test;

public class TestAnimal {
    @Test
    void setNameTest(){
        Animal testAnimal;
        testAnimal = new Animal("Dave") {
            @Override
            public void eat(String food) {

            }

            @Override
            public void breathe() {

            }
        };
        assertEquals (testAnimal.getName());
        }

    private void assertEquals(String name) {
    }
}


