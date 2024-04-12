package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context =                                    // 상위로 경로를 잡아서 빈을 찾아줌
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = context.getBean("bookServiceField", BookService.class);

        List<BookDTO> books = bookService.selectAllBooks();

        for (BookDTO book : books) {
            System.out.println(book);
        }


    }
}
