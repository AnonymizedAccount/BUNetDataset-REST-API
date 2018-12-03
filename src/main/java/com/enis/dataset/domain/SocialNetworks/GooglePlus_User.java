package com.enis.dataset.domain.SocialNetworks;

import com.enis.dataset.domain.SMUser;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by amina on 09/11/2018.
 */
@NodeEntity
public class GooglePlus_User extends SMUser{

    @GraphId
    private Long id;

    public GooglePlus_User() {
    }
    public GooglePlus_User(String name, String snLink){
        super(name, snLink);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
