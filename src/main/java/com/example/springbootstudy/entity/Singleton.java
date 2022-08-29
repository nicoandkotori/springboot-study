package com.example.springbootstudy.entity;

/**
 * 单例
 *
 * @author mjh
 * @date 2022/07/23
 */
public enum Singleton {
    INSTANCE("1");

    private String id;

    Singleton(String id){
        this.id = id;
    }

    public void sayOk(){
        System.out.println("are u ok?");
    }

}
