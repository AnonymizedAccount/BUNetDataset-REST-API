package com.enis.dataset.domain.MicroBloggingSites;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * Created by amina on 12/11/2018.
 */
@RelationshipEntity(type="TW_FriendOf")
public class TW_FriendOf {
    @GraphId
    private Long id;
    private String role;
    @StartNode
    private Twitter_User startNode;
    @EndNode
    private Twitter_User friend;

    public TW_FriendOf() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setStartNode(Twitter_User startNode) {
        this.startNode = startNode;
    }

    public Twitter_User getFriend() {
        return friend;
    }

}

