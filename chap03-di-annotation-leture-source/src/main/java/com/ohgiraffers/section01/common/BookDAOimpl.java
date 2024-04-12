package com.ohgiraffers.section01.common;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// impl는 북DAO를 상속할때 사용함
 /* @Component의 세분화 어노테이션의 한 종류로 DAO 타입의 객체에 사용한다. */

// bookDAO 이름을 지어줌
@Repository("bookDAO")
public class BookDAOimpl implements BookDAO {


    private final Map<Integer, BookDTO> bookList;

    public BookDAOimpl() {
        bookList = new HashMap<>();
        bookList.put(1, new BookDTO(1, 123456,"자바의 정석", "남궁성","도우출판",new java.util.Date()));
        bookList.put(2, new BookDTO(2, 654321,"칭찬은 고래도 춤추게 한다", "고래","고래출판",new java.util.Date()));
    }
    @Override
    public List<BookDTO> selectBookList() {

        // ArrayList에 bookList라는 벨류
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO selectOneBook(int sequence) {
        return bookList.get(sequence);
    }

}
