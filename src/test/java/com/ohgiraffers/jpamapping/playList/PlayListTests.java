package com.ohgiraffers.jpamapping.playList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.stream.Stream;

@SpringBootTest
public class PlayListTests {

    @Autowired
    private PlayListService playListService;

    private static Stream<Arguments> getMusic(){
        return Stream.of(
                Arguments.of(
                        "아름다운 것",
                        "언니네 이발관",
                        "rock",
                        LocalDate.now()
                ),
                Arguments.of(
                        "아가미",
                        "쏜애플",
                        "indie",
                        LocalDate.now()
                )
        );
    }

    @ParameterizedTest
    @MethodSource("getMusic")
    void testRegistMusic(String musicTitle, String artist, String genre, LocalDate releaseDate){
        MusicRegistDTO music = new MusicRegistDTO(
                musicTitle,
                artist,
                genre,
                releaseDate
        );
        Assertions.assertDoesNotThrow(
                () -> playListService.registMusic(music)
        );
    }

    private static Stream<Arguments> addPlayListInfo(){
        return Stream.of(
                Arguments.of(1, 1, 1),
                Arguments.of(2, 1, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("addPlayListInfo")
    void testAddPlayList(int listNo, int memberNo, int musicNo){
        PlayListDTO playList = new PlayListDTO(listNo, memberNo, musicNo);
        Assertions.assertDoesNotThrow(
                () -> playListService.addPlayList(playList)
        );
    }
}
