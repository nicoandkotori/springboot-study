package com.example.springbootstudy.decorator;

public class Egg extends Garnish{


    public Egg(FastFood fastFood) {
        super("鸡蛋", 1F, fastFood);
    }

    @Override
    public float cost() {

        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+getFastFood().getDesc();
    }
}
