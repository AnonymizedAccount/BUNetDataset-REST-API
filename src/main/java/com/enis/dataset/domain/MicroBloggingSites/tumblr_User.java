package com.enis.dataset.domain.MicroBloggingSites;

import com.enis.dataset.domain.SMUser;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by amina on 1211/2018.
 */
@NodeEntity
public class tumblr_User extends SMUser{

    @GraphId
    private Long id;

    public tumblr_User() {
    }
    public tumblr_User(String name, String snLink){
        super(name, snLink);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
