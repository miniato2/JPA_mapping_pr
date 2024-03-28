package com.ohgiraffers.jpamapping.playList;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class AddedPlayListCompositeKey implements java.io.Serializable{
    @Embedded
    private AddedMusicNo musicNo;
    @Embedded
    private AddedMemberNo memberNo;

    protected AddedPlayListCompositeKey(){}

    public AddedPlayListCompositeKey(AddedMusicNo musicNo, AddedMemberNo memberNo) {
        this.musicNo = musicNo;
        this.memberNo = memberNo;
    }

    public AddedMusicNo getMusicNo() {
        return musicNo;
    }

    public AddedMemberNo getMemberNo() {
        return memberNo;
    }

    @Override
    public String toString() {
        return "AddedPlayListCompositeKey{" +
                "musicNo=" + musicNo +
                ", memberNo=" + memberNo +
                '}';
    }
}
