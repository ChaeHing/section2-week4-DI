package com.example.section2week4.member;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService {

    // 직접 객체를 생성하기 때문에 결합도가 높다
    //private final MemberRepository memberRepository = new MemberRepository();
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void createMember(Member member){
        memberRepository.postMember(member);
    }

    public Member getMember(Long memberId){
        return memberRepository.getMember(memberId);
    }

    public void deleteMember(Long memberId){
        memberRepository.deleteMember(memberId);
    }

}
