package com.example.section2week4;

import com.example.section2week4.member.MemberService;
import com.example.section2week4.singleton.SingletonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class SingletonTest {
    //static DenpendencyConfig denpendencyConfig = new DenpendencyConfig();

    /*
    static MemberService memberService1 = denpendencyConfig.memberService();
    static MemberService memberService2 = denpendencyConfig.memberService();

    static SingletonService singletonService1 = SingletonService.getInstance();
    static SingletonService singletonService2 = SingletonService.getInstance();
    public static void main(String[] args) {

        System.out.println("memberService1 : " + memberService1);
        System.out.println("memverService2 : " + memberService2);

        System.out.println("singletonService1 : "+ singletonService1);
        System.out.println("singletonService2 : "+ singletonService2);
    }
    */

    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DenpendencyConfig.class);

    static  MemberService memberService1 = ac.getBean("memberService", MemberService.class);
    static  MemberService memberService2 = ac.getBean("memberService", MemberService.class);


    public static void main(String[] args) {
        System.out.println("memberService1 : " + memberService1);
        System.out.println("memberService2 : " + memberService2);
    }

}
