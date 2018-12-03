package com.enis.dataset.services;

import com.enis.dataset.domain.SocialNetworks.Facebook_User;
import com.enis.dataset.repositories.FacebookUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by amina on 09/11/2018.
 */
@Service
public class FacebookUserService {

    @Autowired
    FacebookUserRepository fbUserRep;

    public Facebook_User getUser(String idFbProfile) {
        return fbUserRep.getUser(idFbProfile);
    }

    public Collection<Facebook_User> getAllUsers(Integer limit) {
        return fbUserRep.getAllUsers(limit);
    }

    public Collection<Facebook_User> getFriends(String idFbProfile) {
        return fbUserRep.getFriends(idFbProfile);
    }

}
