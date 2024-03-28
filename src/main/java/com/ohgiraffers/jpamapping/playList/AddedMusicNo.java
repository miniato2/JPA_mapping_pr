package com.ohgiraffers.jpamapping.playList;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AddedMusicNo {
    @Column(name = "music_no")
    private int musicNo;

    protected AddedMusicNo(){}

    public AddedMusicNo(int musicNo) {
        this.musicNo = musicNo;
    }

    public int getMusicNo() {
        return musicNo;
    }

    @Override
    public String toString() {
        return "AddedMusicNo{" +
                "musicNo=" + musicNo +
                '}';
    }
}
