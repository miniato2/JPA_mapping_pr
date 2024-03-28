package com.ohgiraffers.jpamapping.playList;

public class PlayListDTO {
    private int listNo;     //플리순서번호
    private int memberNo;   //회원번호
    private int musicNo;    //노래번호

    public PlayListDTO() {
    }

    public PlayListDTO(int listNo, int memberNo, int musicNo) {
        this.listNo = listNo;
        this.memberNo = memberNo;
        this.musicNo = musicNo;
    }

    public int getListNo() {
        return listNo;
    }

    public void setListNo(int listNo) {
        this.listNo = listNo;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public int getMusicNo() {
        return musicNo;
    }

    public void setMusicNo(int musicNo) {
        this.musicNo = musicNo;
    }

    @Override
    public String toString() {
        return "PlayListDTO{" +
                "listNo=" + listNo +
                ", memberNo=" + memberNo +
                ", musicNo=" + musicNo +
                '}';
    }
}
