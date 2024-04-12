package com.ohgiraffers.section01.autowired.subsection03.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = context.getBean("bookServiceSetter", BookService.class);

        // 북서비스에서
        bookService.selectAllBooks().forEach(System.out::println);
        /* forEach 함수는 배열을 순회해서 처리하는데 사용되는 메서드로 배열의 각 요소에 대해 주어진
            함수를 순서대로 한 번씩 실행합니다.
            함수를 사용하면 반복문을 통해 배열의 요소를 접근하지 않고도 간편하게 배열 요소들을 처리할 수 있다. */
    }
}
