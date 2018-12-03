package com.enis.dataset.domain.MicroBloggingSites;

import com.enis.dataset.domain.SMUser;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by amina on 1211/2018.
 */
@NodeEntity (label = "tumblr_User")
public class Tumblr_User extends SMUser{

    @GraphId
    private Long id;

    public Tumblr_User() {
    }
    public Tumblr_User(String name, String snLink){
        super(name, snLink);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
