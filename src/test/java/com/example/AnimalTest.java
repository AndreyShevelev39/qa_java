package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class AnimalTest {

    @Test
    public void getFamilyReturnsCorrectString() {
        Animal animal = new Animal();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertTrue(animal.getFamily().contains(expected));
    }
}