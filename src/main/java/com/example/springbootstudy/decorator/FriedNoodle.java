package com.example.springbootstudy.decorator;

/**
 * 炒面
 *
 * @author mijiahao
 * @date 2022/09/11
 */
public class FriedNoodle extends FastFood{

    public FriedNoodle(String desc, Float price) {
        super(desc, price);
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
