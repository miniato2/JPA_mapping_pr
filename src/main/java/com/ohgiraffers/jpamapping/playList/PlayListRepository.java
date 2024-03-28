package com.ohgiraffers.jpamapping.playList;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class PlayListRepository {

    @PersistenceContext
    private EntityManager manager;

    public void registMusic(Music music) {
        manager.persist(music);
    }

    public void addPlayList(PlayList addedPlayList) {
        manager.persist(addedPlayList);
    }
}
