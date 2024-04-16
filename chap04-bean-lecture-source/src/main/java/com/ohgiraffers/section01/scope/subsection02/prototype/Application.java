package com.ohgiraffers.section01.scope.subsection02.prototype;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    /* bean scope란 스프링 빈이 생성될 때 생성되는 인스턴스의 범위를 의미한다. 스프링에서는 다양한 Bean scope를 제공한다.
    * singleton : 하나의 인스턴스만을 생성하고, 모든 빈이 하댕 인스턴스를 공유하며 사용한다.
    * portotype : 매번 새로운 인스턴스를 생성한다.
    * Spring Framework에서 Bean의 기본 스코프는 싱글톤이다.
    * 싱글톤 스코프를 갖는 */

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        Product carpBread = context.getBean("carpBread", Bread.class);
        Product milk = context.getBean("milk", Beverage.class);
        Product water = context.getBean("water", Beverage.class);

        /* 첫 번째 소님이 쇼핑 카트를 꺼낸다. */
        ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
        cart1.addItem(carpBread);
        cart1.addItem(milk);

        System.out.println("cart1에 담긴 내용 : " + cart1.getItems());

        /* 두 번째 소님이 쇼핑 카트를 꺼낸다. */
        ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
        cart2.addItem(water);

        System.out.println("cart2에 담긴 내용 : " + cart2.getItems());

        System.out.println("cart1에 hashcode : " + cart1.hashCode());
        System.out.println("cart2에 hashcode : " + cart2.hashCode());

    }
}
