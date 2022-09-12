package com.example.springbootstudy;

import com.example.springbootstudy.decorator.Egg;
import com.example.springbootstudy.decorator.FriedRice;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootStudyApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test(){
        FriedRice friedRice = new FriedRice();
        Egg egg = new Egg(friedRice);
        System.out.println("花费："+egg.cost());
    }

}
