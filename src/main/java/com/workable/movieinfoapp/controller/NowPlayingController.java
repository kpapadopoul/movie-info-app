package com.workable.movieinfoapp.controller;

import com.workable.movieinfoapp.model.NowPlayingControllerResponse;
import com.workable.movieinfoapp.service.NowPlayingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NowPlayingController {

    private NowPlayingService nowPlayingService;

    @Autowired
    public NowPlayingController(NowPlayingService nowPlayingService) {
        this.nowPlayingService = nowPlayingService;
    }

    @GetMapping("/nowPlaying")
    public NowPlayingControllerResponse getNowPlaying() {
        return nowPlayingService.getNowPlaying();
    }

}
