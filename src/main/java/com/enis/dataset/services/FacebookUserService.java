package com.enis.dataset.services;

import com.enis.dataset.domain.SocialNetworks.facebook_User;
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

    public Collection<facebook_User> getAllUsers(int limit) {
        return fbUserRep.getAllUsers(limit);
    }

    public Collection<facebook_User> getFriends(String idFbProfile) {
        return fbUserRep.getFriends(idFbProfile);
    }

}
