package com.example;

import java.util.List;

public class CatTest {

    Predator predator;

    public CatTest(FelineTest feline) {
        this.predator = feline;
    }

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

}
