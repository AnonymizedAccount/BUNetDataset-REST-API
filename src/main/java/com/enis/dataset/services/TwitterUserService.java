package com.enis.dataset.services;

import com.enis.dataset.domain.MicroBloggingSites.Twitter_User;
import com.enis.dataset.repositories.TwitterUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by amina on 09/11/2018.
 */
@Service
public class TwitterUserService {

    @Autowired
    TwitterUserRepository twUserRep;
public Twitter_User getUser(String idTwProfile){ return twUserRep.getUser(idTwProfile);}
    public Collection<Twitter_User> getAllUsers(int limit) {
        return twUserRep.getAllUsers(limit);
    }

    public Collection<Twitter_User> getFriends(String idTwProfile) {
        return twUserRep.getFriends(idTwProfile);
    }

    public Collection<Twitter_User> getSMMeEdges(String name) {
        return twUserRep.getSMMeEdges(name);
    }

    public Collection<Twitter_User> getMeEdges(int limit) {
        return twUserRep.getMeEdges(limit);
    }

    public Collection<Twitter_User> getTwMeEdgesOf(String idTwProfile) {
        return twUserRep.getTwMeEdgesOf(idTwProfile);
    }

    public Collection<Twitter_User> getFbTwBridges(int limit){ return twUserRep.getFbTwBridges(limit);}

    public Collection<Twitter_User> getFbMeEdgesOf(String idFbProfile) {
        return twUserRep.getFbMeEdgesOf(idFbProfile);
    }

}
