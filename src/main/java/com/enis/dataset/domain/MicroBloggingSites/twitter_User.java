package com.enis.dataset.domain.MicroBloggingSites;
import com.enis.dataset.domain.Blogs.blogspot_User;
import com.enis.dataset.domain.Blogs.medium_User;
import com.enis.dataset.domain.Blogs.numeroUnity_User;
import com.enis.dataset.domain.Blogs.wordpress_User;
import com.enis.dataset.domain.ContentCommunities.*;
import com.enis.dataset.domain.ReviewSites.amazon_User;
import com.enis.dataset.domain.SocialNetworks.academia_User;
import com.enis.dataset.domain.SocialNetworks.facebook_User;
import com.enis.dataset.domain.SocialNetworks.googleplus_User;
import com.enis.dataset.domain.SocialNetworks.linkedin_User;
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
@NodeEntity
public class twitter_User {
    @GraphId
    private Long id;
    private BigInteger idTwProfile;
    private String name;
    private String twFollowersNumber;
    private String twFriendsNumber;

    @Relationship(type = "TW_FriendOf", direction = Relationship.OUTGOING)
    private List<twitter_User> friends;
    @Relationship(type = "Me_Edge", direction = Relationship.UNDIRECTED)
    private List<facebook_User> facebookMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<tumblr_User> tumblrMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<blogspot_User> blogSMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<medium_User> mediumMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<numeroUnity_User> numUnitMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<wordpress_User> wordPressMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<flickr_User> flickrMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<instagram_User> instagramMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<soundcloud_User> soundCloudMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<vimeo_User> vimeoEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<vsco_User> vscoMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<youtube_User> youtubeMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<amazon_User> amazonMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<academia_User> academiaMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<googleplus_User> googleplusMeEdges;
    @Relationship(type = "Me_Edge", direction = Relationship.INCOMING)
    private List<linkedin_User> linkedinMeEdges;
    public twitter_User() {
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

    public List<twitter_User> getFriends() {
        return friends;
    }

    public void setFriends(List<twitter_User> friends) {
        this.friends = friends;
    }

    public List<tumblr_User> getTumblrMeEdges() {
        return tumblrMeEdges;
    }

    public List<blogspot_User> getBlogSMeEdges() {
        return blogSMeEdges;
    }

    public List<medium_User> getMediumMeEdges() {
        return mediumMeEdges;
    }

    public List<numeroUnity_User> getNumUnitMeEdges() {
        return numUnitMeEdges;
    }

    public List<wordpress_User> getWordPressMeEdges() {
        return wordPressMeEdges;
    }

    public List<flickr_User> getFlickrMeEdges() {
        return flickrMeEdges;
    }

    public List<instagram_User> getInstagramMeEdges() {
        return instagramMeEdges;
    }

    public List<soundcloud_User> getSoundCloudMeEdges() {
        return soundCloudMeEdges;
    }

    public List<vimeo_User> getVimeoEdges() {
        return vimeoEdges;
    }

    public List<vsco_User> getVscoMeEdges() {
        return vscoMeEdges;
    }

    public List<youtube_User> getYoutubeMeEdges() {
        return youtubeMeEdges;
    }

    public List<amazon_User> getAmazonMeEdges() {
        return amazonMeEdges;
    }

    public List<academia_User> getAcademiaMeEdges() {
        return academiaMeEdges;
    }

    public List<googleplus_User> getGoogleplusMeEdges() {
        return googleplusMeEdges;
    }

    public List<linkedin_User> getLinkedinMeEdges() {
        return linkedinMeEdges;
    }

    public List<facebook_User> getFacebookMeEdges() {
        return facebookMeEdges;
    }

    public void setFacebookMeEdges(List<facebook_User> facebookMeEdges) {
        this.facebookMeEdges = facebookMeEdges;
    }
}
