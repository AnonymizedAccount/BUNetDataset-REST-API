package com.enis.dataset.controller;

import com.enis.dataset.services.FacebookUserService;
import com.enis.dataset.domain.SocialNetworks.facebook_User;
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
@RequestMapping("/rest/dataset")
public class
FacebookUserController {

    @Autowired
    FacebookUserService fbUserServ;

    @GetMapping("/facebook/users")
    public Collection<facebook_User> getAllUsers(int limit) {
        return fbUserServ.getAllUsers(limit);
    }

    @GetMapping("/facebook/friendsOf")
    public Collection<facebook_User> getFriends(@RequestParam(value = "idFbProfile") String idFbProfile) {
        return fbUserServ.getFriends(idFbProfile);
    }


}

