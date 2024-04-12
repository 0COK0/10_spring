package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        /* GenericXmlApplicationContext로 XML 파일의 정보를 읽어와서
            ApplicationContext라는 객체를 생성해 담아주고
            MemberDTO member context에 getBean()
            */

        ApplicationContext context
                //GenericXmlApplicationContext 클래스를 이용하여 생성된 객체에 접근
                // XML 파일로부터 정보를 읽어와 객체를 생성하고 초기화
                = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");
        // getBean() 메서드 역할(생성자 주입)
        // 빈 객체를 검색 -> 생성 -> 의존성 주입 : 수행
        MemberDTO member = context.getBean(MemberDTO.class);

        //
        System.out.println("member = " + member);

        // account 맴버 getPersonalAccount로 가지고 오겠다.
        Account account = member.getPersonalAccount();


        System.out.println(account.getBalance());

        System.out.println(account.deposit(10000));

        System.out.println(account.getBalance());

        System.out.println(account.withDraw(10000));

        System.out.println(account.getBalance());
    }
}
