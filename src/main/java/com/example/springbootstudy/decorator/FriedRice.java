package com.example.springbootstudy.decorator;

/**
 * 炒饭
 *
 * @author mijiahao
 * @date 2022/09/11
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super("炒饭", 1F);
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
