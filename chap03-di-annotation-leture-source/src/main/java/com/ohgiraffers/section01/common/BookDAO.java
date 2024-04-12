package com.ohgiraffers.section01.common;


import java.util.List;

// 데이터 베이스 엑세스 오프젝트
public interface BookDAO {
    
    List<BookDTO> selectBookList();


    BookDTO selectOneBook(int sequence);
}
