package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class AnimalTest {

    @Test
    public void getFamilyReturnsCorrectString() {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, animal.getFamily());
    }

    @Test
    public void getFoodThrowsException() {
        Animal animal = new Animal();
        try {
            animal.getFood("Всеядное");
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }

}

