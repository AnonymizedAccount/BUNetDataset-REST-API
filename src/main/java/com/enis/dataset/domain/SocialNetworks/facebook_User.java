package com.enis.dataset.domain.SocialNetworks;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;

/**
 * Created by amina on 01/11/2018.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@NodeEntity
public class facebook_User {
    @GraphId
    private Long id;
    private BigInteger idFbProfile;
    private String idFile;
    private String name;
    private String urlFriendsList;
    private String urlProfile;
    private String friendsNumber;
    private String location;
    private String snLink;
    @Relationship(type = "FB_FriendOf", direction = Relationship.OUTGOING)
    private Collection<facebook_User> friends;

    public facebook_User()  {
    }

    public String getIdFile() {
        return idFile;
    }

    public BigInteger getIdFbProfile() {
        return idFbProfile;
    }

    public String getName() {
        return name;
    }

    public String getUrlFriendsList() {
        return urlFriendsList;
    }

    public String getUrlProfile() {
        return urlProfile;
    }

    public String getFriendsNumber() {
        return friendsNumber;
    }

    public String getLocation() {
        return location;
    }

    public String getSnLink() {
        return snLink;
    }

    public Collection<facebook_User> getFriends() {
        return friends;
    }

}
