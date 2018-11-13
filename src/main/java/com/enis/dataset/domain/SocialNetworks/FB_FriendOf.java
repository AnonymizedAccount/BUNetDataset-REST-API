package com.enis.dataset.domain.SocialNetworks;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * Created by amina on 09/11/2018.
 */
@RelationshipEntity(type = "FB_FriendOf")
public class FB_FriendOf {
    @GraphId
    private Long id;
    private String role;
    @StartNode
    private facebook_User startNode;
    @EndNode
    private facebook_User friend;

    public FB_FriendOf() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setStartNode(facebook_User startNode) {
        this.startNode = startNode;
    }

    public facebook_User getStartNode() {
        return startNode;
    }

    public void setFriend(facebook_User friend) {
        this.friend = friend;
    }
    public facebook_User getFriend() {
        return friend;
    }

}
