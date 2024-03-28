package com.ohgiraffers.jpamapping.playList;

import jakarta.persistence.*;

@Entity(name = "EntityPlayList")
@Table(name = "tbl_playlist")
public class PlayList {
    @Column(name = "list_no")
    private int listNo;
    @EmbeddedId
    private AddedPlayListCompositeKey playListInfo;

    protected PlayList(){}

    public PlayList(int listNo, AddedPlayListCompositeKey playListInfo) {
        this.listNo = listNo;
        this.playListInfo = playListInfo;
    }

    public int getListNo() {
        return listNo;
    }

    public AddedPlayListCompositeKey getPlayListInfo() {
        return playListInfo;
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "listNo=" + listNo +
                ", playListInfo=" + playListInfo +
                '}';
    }
}
