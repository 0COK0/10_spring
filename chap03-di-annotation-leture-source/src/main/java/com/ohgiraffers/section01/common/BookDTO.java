package com.ohgiraffers.section01.common;

import lombok.*;

import java.util.Date;


@NoArgsConstructor  // 기본 생성자를 생성해주는 어노테이션
@AllArgsConstructor // 모든 필드를 초기화하는 생성자
@Getter
@Setter
@ToString   // 만들어 놓으면 안만들어두되는데 지금은 아직 많이 사용안해서 권장안함
public class BookDTO {

    private int sequence;

    private int isbn;
    private String title;

    private String author;

    private String publisher;
    private Date createdDate;
}
