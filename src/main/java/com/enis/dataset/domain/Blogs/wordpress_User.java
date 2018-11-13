package com.enis.dataset.domain.Blogs;

import com.enis.dataset.domain.SMUser;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by amina on 01/11/2018.
 */
@NodeEntity
public class wordpress_User extends SMUser{
    @GraphId
    private Long id;

    public wordpress_User() {
    }
    public wordpress_User(String name, String snLink){
        super(name, snLink);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
