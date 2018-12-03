package com.enis.dataset.controller;

import com.enis.dataset.services.FacebookUserService;
import com.enis.dataset.domain.SocialNetworks.Facebook_User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by amina on 07/11/2018.
 */
@RestController
@RequestMapping("/rest/BUNet")
public class
FacebookUserController {

    @Autowired
    FacebookUserService fbUserServ;

    public FacebookUserController(FacebookUserService fbUserServ) {
        this.fbUserServ = fbUserServ;
    }

    @GetMapping("/fbUser")
    public Facebook_User getUser(@RequestParam(value = "idFbProfile") String idFbProfile) {
        return fbUserServ.getUser(idFbProfile);
    }

    @GetMapping("/fbUsers")
    public Collection<Facebook_User> getAllUsers(@RequestParam(value = "limit", required=false)Integer limit) {
        return fbUserServ.getAllUsers(limit == null ? 100: limit);
    }

    @GetMapping("/fbFriendsOf")
    public Collection<Facebook_User> getFriends(@RequestParam(value = "idFbProfile") String idFbProfile) {
        return fbUserServ.getFriends(idFbProfile);
    }


}

