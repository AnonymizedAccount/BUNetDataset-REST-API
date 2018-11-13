package com.enis.dataset.domain.ContentCommunities;

import com.enis.dataset.domain.SMUser;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by amina on 01/11/2018.
 */
@NodeEntity
public class flickr_User extends SMUser{
    @GraphId
    private Long id;

    public flickr_User() {
    }
    public flickr_User(String name, String snLink){
        super(name, snLink);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
