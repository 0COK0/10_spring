package com.ohgiraffers.section01.autowired.subsection02.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {


    public static void main(String[] args) {

        // ACAC로 빈을 찾아서 AC라는 객체를 생성 context라는 변수를 생성함
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        // 북서비스로 변수 선언
        BookService bookService = context.getBean("bookServiceConstructor", BookService.class);

        // bookService
        bookService.selectAllBooks().forEach(System.out::println);

        System.out.println(bookService.searchBookBySequence(1));


    }
}
