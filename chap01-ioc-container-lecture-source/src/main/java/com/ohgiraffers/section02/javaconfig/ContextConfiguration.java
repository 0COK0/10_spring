package com.ohgiraffers.section02.javaconfig;


import com.ohgiraffers.section01.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// 해당 클래스는 설정 파일이 되고, 빈을 생성하는 클래스임을 표기
@Configuration  // 현업에서는 xml 도 써서 둘다 아는게 좋음
public class ContextConfiguration {

    @Bean(name="member")   // 빈을 등록 해준 것
    // gerMember 가 id라 gerMember라는 명으로 찾아도 됨
    public MemberDTO gerMember() {

        // @Configuration 찾아서 객체를 달아주는 것이고
        return new MemberDTO(1, "user01", "pass01", "홍길동");
    }

}
