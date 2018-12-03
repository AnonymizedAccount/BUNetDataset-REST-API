package com.enis.dataset.domain.SocialNetworks;

import com.enis.dataset.domain.SMUser;
import com.sun.xml.internal.ws.protocol.soap.ServerMUTube;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by amina on 12/11/2018.
 */
@NodeEntity
public class Academia_User extends SMUser{
    @GraphId
    private Long id;

    public Academia_User() {
    }
    public Academia_User(String name, String snLink){
        super(name, snLink);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}


