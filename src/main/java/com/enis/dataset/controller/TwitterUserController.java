package com.enis.dataset.controller;

import com.enis.dataset.domain.MicroBloggingSites.twitter_User;
import com.enis.dataset.services.TwitterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by amina on 09/11/2018.
 */
@RestController
@RequestMapping("/rest/dataset")
public class TwitterUserController {

    @Autowired
    TwitterUserService twUserServ;

    @GetMapping("/twitter/users")
    public Collection<twitter_User> getAllUsers(int limit) {
        return twUserServ.getAllUsers(limit);
    }

    @GetMapping("/twitter/friendsOf")
    public Collection<twitter_User> getFriends(@RequestParam(value = "idTwProfile") String idTwProfile) {
        return twUserServ.getFriends(idTwProfile);
    }

    @GetMapping("/TumblrBridges")
    public Collection<twitter_User> getFbMeEdges() {
        return twUserServ.getTbMeEdges();
    }

    @GetMapping("/AllMeEdges")
    public Collection<twitter_User> getMeEdges() {
        return twUserServ.getMeEdges();
    }

    @GetMapping("/twitter/Me_EdgesOf")
    public Collection<twitter_User> getMeEdgesOf(String idTwProfile) {
        return twUserServ.getTwMeEdgesOf(idTwProfile);
    }

    @GetMapping("/FbTwBridges")
    public Collection<twitter_User> getFbTwBridges(){return twUserServ.getFbTwBridges();}
    @GetMapping("/facebook/Me_EdgesOf")
    public Collection<twitter_User> getFbMeEdgesOf(String idFbProfile) {
        return twUserServ.getFbMeEdgesOf(idFbProfile);
    }

}
