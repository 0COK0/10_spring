package com.ohgiraffers.section01.autowired.subsection02.constructor;


import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceConstructor")
public class BookService {

    private final BookDAO bookDAO;

    /* 생성자가 하나 일 때는 @Autowired 어노테이션 생략 가능 */

//    public BookService() {   // 생성자가 2개면 어떤 걸 주입 받아야 하는지 모르겠다고 오류가 뜸
//        this.bookDAO = null;
//    }
    @Autowired
    public  BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> selectAllBooks() {

        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence) {

        return bookDAO.selectOneBook(sequence);
        }
}