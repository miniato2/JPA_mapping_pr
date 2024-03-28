package com.ohgiraffers.jpamapping.playList;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AddedMemberNo {
    @Column(name = "member_no")
    private int memberNo;

    protected AddedMemberNo(){}

    public AddedMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public int getMemberNo() {
        return memberNo;
    }

    @Override
    public String toString() {
        return "AddedMemberNo{" +
                "memberNo=" + memberNo +
                '}';
    }
}
