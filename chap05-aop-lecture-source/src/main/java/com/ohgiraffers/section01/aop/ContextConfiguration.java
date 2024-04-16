package com.ohgiraffers.section01.aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true) // aop기능이 활성화가 됨
/* aspectj의 autoProxy 사용해 관한 설정을 해 주어야 advice가 등장한다. (공통로직을 처리할 수 있음)*/
public class ContextConfiguration {



}
