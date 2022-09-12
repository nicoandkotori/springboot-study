package com.example.springbootstudy.decorator;

/**
 * 装饰
 *
 * @author mijiahao
 * @date 2022/09/11
 */
public abstract class Garnish extends FastFood{

    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(String desc, Float price, FastFood fastFood) {
        super(desc, price);
        this.fastFood = fastFood;
    }


}
