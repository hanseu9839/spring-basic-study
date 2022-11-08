package com.hello.core.discount;

import com.hello.core.member.Grade;
import com.hello.core.member.Member;

public class FixDiscountPolicy implements  DiscountPolicy {
    private int discountFixMount = 1000; //1000원 할인
    @Override
    public int discount(Member member, int itemPrice) {
        if(member.getGrade() == Grade.VIP){
         return discountFixMount;
        }else {
            return 0;
        }
    }
}
