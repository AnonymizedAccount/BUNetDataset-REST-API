package com.enis.dataset.services;

import com.enis.dataset.domain.MicroBloggingSites.twitter_User;
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

    public Collection<twitter_User> getAllUsers(int limit) {
        return twUserRep.getAllUsers(limit);
    }

    public Collection<twitter_User> getFriends(String idTwProfile) {
        return twUserRep.getFriends(idTwProfile);
    }

    public Collection<twitter_User> getTbMeEdges() {
        return twUserRep.getTbMeEdges();
    }

    public Collection<twitter_User> getMeEdges() {
        return twUserRep.getMeEdges();
    }

    public Collection<twitter_User> getTwMeEdgesOf(String idTwProfile) {
        return twUserRep.getTwMeEdgesOf(idTwProfile);
    }

    public Collection<twitter_User> getFbTwBridges(){ return twUserRep.getFbTwBridges();}

    public Collection<twitter_User> getFbMeEdgesOf(String idFbProfile) {
        return twUserRep.getFbMeEdgesOf(idFbProfile);
    }

}
