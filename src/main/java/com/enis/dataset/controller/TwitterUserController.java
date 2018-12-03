package com.enis.dataset.controller;

import com.enis.dataset.domain.MicroBloggingSites.Twitter_User;
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
@RequestMapping("/rest/BUNet")
public class TwitterUserController {

    @Autowired
    TwitterUserService twUserServ;

    public TwitterUserController(TwitterUserService twUserServ) {
        this.twUserServ = twUserServ;
    }

    @GetMapping("/twUsers")
    public Collection<Twitter_User> getAllUsers(@RequestParam(value = "limit",required = false) Integer limit) {
        return twUserServ.getAllUsers(limit == null ? 100: limit);
    }

    @GetMapping("/twUser")
    public Twitter_User getUser(@RequestParam(value = "idTwProfile") String idTwProfile) {
        return twUserServ.getUser(idTwProfile);
    }

    @GetMapping("/twFriendsOf")
    public Collection<Twitter_User> getFriends(@RequestParam(value = "idTwProfile") String idTwProfile) {
        return twUserServ.getFriends(idTwProfile);
    }

    @GetMapping("/SMBridges")
    public Collection<Twitter_User> getSMMeEdges(@RequestParam(value = "name") String name) {
        return twUserServ.getSMMeEdges(name);
    }

    @GetMapping("/AllMeEdges")
    public Collection<Twitter_User> getMeEdges(@RequestParam(value = "limit", required=false) Integer limit) {
        return twUserServ.getMeEdges(limit == null ? 100: limit);
    }

    @GetMapping("/twMe_EdgesOf")
    public Collection<Twitter_User> getMeEdgesOf(@RequestParam(value = "idTwProfile") String idTwProfile) {
        return twUserServ.getTwMeEdgesOf(idTwProfile);
    }
    @GetMapping("/fbMe_EdgesOf")
    public Collection<Twitter_User> getFbMeEdgesOf(@RequestParam(value = "idFbProfile")String idFbProfile) {
        return twUserServ.getFbMeEdgesOf(idFbProfile);
    }
    @GetMapping("/FbTwMeEdges")
    public Collection<Twitter_User> getFbTwBridges(@RequestParam(value = "limit",required = false) Integer limit) {
        return twUserServ.getFbTwBridges(limit == null ? 100: limit);
    }



}
