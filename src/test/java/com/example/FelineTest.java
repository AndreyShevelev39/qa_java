package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void eatMeatReturnsCorrectFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyReturnsCats() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensNoArgsReturnsOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithArgsReturnsInput() {
        assertEquals(10, feline.getKittens(10));
    }

    @Test
    public void getFoodHerbivoreReturnsCorrectList() throws Exception {
        assertEquals(List.of("Трава", "Различные растения"), feline.getFood("Травоядное"));
    }

    @Test(expected = Exception.class)
    public void getFoodInvalidKindThrowsException() throws Exception {
        feline.getFood("Всеядное");
    }
}