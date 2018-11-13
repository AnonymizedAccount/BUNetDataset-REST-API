package com.enis.dataset.domain.Blogs;

import com.enis.dataset.domain.SMUser;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by amina on 12/11/2018.
 */
@NodeEntity
public class medium_User extends SMUser{
    @GraphId
    private Long id;

    public medium_User() {
    }
    public medium_User(String name, String snLink){
        super(name, snLink);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
