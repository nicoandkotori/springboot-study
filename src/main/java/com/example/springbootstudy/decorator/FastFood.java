package com.example.springbootstudy.decorator;

/**
 * 快餐
 * 快餐类（装饰者模式）
 *
 * @author mijiahao
 * @date 2022/09/11
 */
public abstract class FastFood {

    private String desc;
    private Float price;

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public FastFood(String desc, Float price) {
        this.desc = desc;
        this.price = price;
    }

    public abstract float cost();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
