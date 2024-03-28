package com.ohgiraffers.jpamapping.playList;

import java.time.LocalDate;

public class MusicRegistDTO {

    private String musicTitle;      //노래 제목
    private String Artist;          //가수
    private String genre;           //장르
    private LocalDate releaseDate;  //발매날짜

    public MusicRegistDTO() {
    }

    public MusicRegistDTO(String musicTitle, String artist, String genre, LocalDate releaseDate) {
        this.musicTitle = musicTitle;
        Artist = artist;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public String getMusicTitle() {
        return musicTitle;
    }

    public void setMusicTitle(String musicTitle) {
        this.musicTitle = musicTitle;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "MusicRegistDTO{" +
                "musicTitle='" + musicTitle + '\'' +
                ", Artist='" + Artist + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
