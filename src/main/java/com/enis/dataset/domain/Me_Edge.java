package com.enis.dataset.domain;

import com.enis.dataset.domain.MicroBloggingSites.Twitter_User;
import com.enis.dataset.domain.SocialNetworks.Facebook_User;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * Created by amina on 09/11/2018.
 */
@RelationshipEntity(type = "Me_Edge")
public class Me_Edge {

    @GraphId
    private Long id;
    private String role;
    @StartNode
    private Twitter_User startNode;
    @EndNode
    private Facebook_User bridgeUser;

    public Me_Edge() {
    }

    public Object getBridgeUser() {
        return bridgeUser;
    }

    public void setBridgeUser(Facebook_User bridgeUser) {
        this.bridgeUser = bridgeUser;
    }
}
