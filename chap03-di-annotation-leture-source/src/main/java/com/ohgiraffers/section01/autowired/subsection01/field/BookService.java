package com.ohgiraffers.section01.autowired.subsection01.field;


import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* @Service : @컴포넌트의 세분화 어노테이션의 한 종류의 서비스 계층에서 사용한다. */
@Service("bookServiceField")
public class BookService {

    // @Autowired 없을 때 나는 오류 서비스를 불러오는데 필드 주입이 안되서 그런 것
    // 서비스를 찾아야 하는데 @Autowired 서비스를 없어서 찾지 못한다고 함.
    // 서비스를 찾으려고 BookDAO 빈으로 만들어서 서비스를 찾는 어노테이션
    @Autowired
    private BookDAO bookDAO;

    public List<BookDTO> selectAllBooks() {

        return bookDAO.selectBookList();

    }

    public BookDTO searchBookBySequence(int sequence) {

        return bookDAO.selectOneBook(sequence);
    }

}
