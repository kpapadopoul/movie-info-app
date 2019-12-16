package com.workable.movieinfoapp.controller;

import com.workable.movieinfoapp.model.NowPlayingControllerResponse;
import com.workable.movieinfoapp.service.NowPlayingService;
import com.workable.movieinfoapp.service.NowPlayingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NowPlayingController {

    private NowPlayingService nowPlayingService;

    @Autowired
    public NowPlayingController(NowPlayingServiceImpl nowPlayingService) {
        this.nowPlayingService = nowPlayingService;
    }

    @GetMapping("/nowPlaying")
    public NowPlayingControllerResponse getNowPlaying() {
        return nowPlayingService.getNowPlaying();
    }

}
