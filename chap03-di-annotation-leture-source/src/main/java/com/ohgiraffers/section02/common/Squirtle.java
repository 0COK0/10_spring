package com.ohgiraffers.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component // 따로 지정 안해줌 클래스 명이 스프링에서는 빈객체를 찾을 때 소문자로
public class Squirtle implements Pokemon{

    @Override
    public void attack() {
        System.out.println("꼬부기 물대포 발사~~꼬~~~뿍~~~~!!!!");
    }
}
