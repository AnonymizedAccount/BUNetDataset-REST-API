package com.enis.dataset.domain.MicroBloggingSites;
import com.enis.dataset.domain.Blogs.Blogspot_User;
import com.enis.dataset.domain.Blogs.Medium_User;
import com.enis.dataset.domain.Blogs.NumeroUnity_User;
import com.enis.dataset.domain.Blogs.WordPress_User;
import com.enis.dataset.domain.ContentCommunities.*;
import com.enis.dataset.domain.ReviewSites.Amazon_User;
import com.enis.dataset.domain.SocialNetworks.Facebook_User;
import com.enis.dataset.domain.SocialNetworks.Academia_User;
import com.enis.dataset.domain.SocialNetworks.GooglePlus_User;
import com.enis.dataset.domain.SocialNetworks.Linkedin_User;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by amina on 01/11/2018.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@NodeEntity (label = "twitter_User")
public class Twitter_User {
    @GraphId
    private Long id;
    private BigInteger idTwProfile;
    private String name;
    private String twFollowersNumber;
    private String twFriendsNumber;

    @Relationship(type = "TW_FriendOf", direction = Relationship.OUTGOING)
    private List<Twitter_User> friends;
    @Relationship(type = "Me_Edge", direction = Relationship.UNDIRECTED)
    private List<Facebook_User> facebookMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<Tumblr_User> tumblrMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<Blogspot_User> blogSMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<Medium_User> mediumMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<NumeroUnity_User> numUnitMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<WordPress_User> wordPressMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<Flickr_User> flickrMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<Instagram_User> instagramMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<Soundcloud_User> soundCloudMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<Vimeo_User> vimeoEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<Vsco_User> vscoMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<YouTube_User> youtubeMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<Amazon_User> amazonMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<Academia_User> academiaMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<GooglePlus_User> googleplusMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<Linkedin_User> linkedinMeEdges;
    public Twitter_User() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getIdTwProfile() {
        return idTwProfile;
    }

    public void setIdTwProfile(BigInteger idTwProfile) {
        this.idTwProfile = idTwProfile;
    }

    public String getTwFollowersNumber() {
        return twFollowersNumber;
    }

    public void setTwFollowersNumber(String twFollowersNumber) {
        this.twFollowersNumber = twFollowersNumber;
    }

    public String getTwFriendsNumber() {
        return twFriendsNumber;
    }

    public void setTwFriendsNumber(String twFriendsNumber) {
        this.twFriendsNumber = twFriendsNumber;
    }

    public List<Twitter_User> getFriends() {
        return friends;
    }

    public void setFriends(List<Twitter_User> friends) {
        this.friends = friends;
    }

    public List<Tumblr_User> getTumblrMeEdges() {
        return tumblrMeEdges;
    }

    public List<Blogspot_User> getBlogSMeEdges() {
        return blogSMeEdges;
    }

    public List<Medium_User> getMediumMeEdges() {
        return mediumMeEdges;
    }

    public List<NumeroUnity_User> getNumUnitMeEdges() {
        return numUnitMeEdges;
    }

    public List<WordPress_User> getWordPressMeEdges() {
        return wordPressMeEdges;
    }

    public List<Flickr_User> getFlickrMeEdges() {
        return flickrMeEdges;
    }

    public List<Instagram_User> getInstagramMeEdges() {
        return instagramMeEdges;
    }

    public List<Soundcloud_User> getSoundCloudMeEdges() {
        return soundCloudMeEdges;
    }

    public List<Vimeo_User> getVimeoEdges() {
        return vimeoEdges;
    }

    public List<Vsco_User> getVscoMeEdges() {
        return vscoMeEdges;
    }

    public List<YouTube_User> getYoutubeMeEdges() {
        return youtubeMeEdges;
    }

    public List<Amazon_User> getAmazonMeEdges() {
        return amazonMeEdges;
    }

    public List<Academia_User> getAcademiaMeEdges() {
        return academiaMeEdges;
    }

    public List<GooglePlus_User> getGoogleplusMeEdges() {
        return googleplusMeEdges;
    }

    public List<Linkedin_User> getLinkedinMeEdges() {
        return linkedinMeEdges;
    }

    public List<Facebook_User> getFacebookMeEdges() {
        return facebookMeEdges;
    }

    public void setFacebookMeEdges(List<Facebook_User> facebookMeEdges) {
        this.facebookMeEdges = facebookMeEdges;
    }
}
