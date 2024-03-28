package com.ohgiraffers.jpamapping.playList;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlayListService {

    private PlayListRepository playListRepository;

    public PlayListService(PlayListRepository playListRepository){
        this.playListRepository = playListRepository;
    }

    @Transactional
    public void registMusic(MusicRegistDTO newMusic) {
        Music music = new Music(
                newMusic.getMusicTitle(),
                newMusic.getArtist(),
                newMusic.getGenre(),
                newMusic.getReleaseDate()
        );
        playListRepository.registMusic(music);
    }
    @Transactional
    public void addPlayList(PlayListDTO playList) {
        PlayList addedPlayList = new PlayList(
                playList.getListNo(),
                new AddedPlayListCompositeKey(
                        new AddedMusicNo(playList.getMusicNo()),
                        new AddedMemberNo(playList.getMemberNo())
                )
        );
        playListRepository.addPlayList(addedPlayList);
    }

}
