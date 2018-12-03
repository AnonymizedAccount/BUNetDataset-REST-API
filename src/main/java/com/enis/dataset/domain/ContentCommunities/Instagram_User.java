package com.enis.dataset.domain.ContentCommunities;

import com.enis.dataset.domain.SMUser;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by amina on 01/11/2018.
 */
@NodeEntity (label = "instagram_User")
public class Instagram_User extends SMUser{
    @GraphId
    private Long id;

    public Instagram_User() {
    }
    public Instagram_User(String name, String snLink){
        super(name, snLink);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
