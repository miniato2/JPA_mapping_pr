package com.ohgiraffers.jpamapping.playList;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_music")
public class Music {

    @Id
    @Column(name = "music_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int musicNo;            //노래 번호
    @Column(name = "music_title")
    private String musicTitle;      //노래 제목
    @Column(name = "artist")
    private String artist;          //가수
    @Column(name = "genre")
    private String genre;           //장르
    @Column(name = "release_date")
    private LocalDate releaseDate;  //발매날짜

    protected Music(){}

    public Music(String musicTitle, String artist, String genre, LocalDate releaseDate) {
        this.musicTitle = musicTitle;
        this.artist = artist;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public Music(int musicNo, String musicTitle, String artist, String genre, LocalDate releaseDate) {
        this.musicNo = musicNo;
        this.musicTitle = musicTitle;
        this.artist = artist;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }
}
