package com.enis.dataset.repositories;

import com.enis.dataset.domain.MicroBloggingSites.Twitter_User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

/**
 * Created by amina on 09/11/2018.
 */
public interface TwitterUserRepository extends Neo4jRepository<Twitter_User,Long>{

    @Query("match (user:twitter_User)return user limit {limit}")
    Collection<Twitter_User> getAllUsers(@Param("limit")Integer limit);
    @Query("match (user:twitter_User)where user.idTwProfile={idTwProfile} return user ")
    Twitter_User getUser(@Param("idTwProfile")String idTwProfile);
    @Query ("match (n)-[r:TW_FriendOf]-> (m)  where n.idTwProfile={idTwProfile}  return m")
    Collection<Twitter_User> getFriends(@Param("idTwProfile")String idTwProfile);
    @Query("match (n:twitter_User)<-[r:Me_Edge]-(m) where m.name= {name} return n,r,m limit 10")
    Collection<Twitter_User> getSMMeEdges(@Param("name")String name);
    @Query("match (n:twitter_User)-[r:Me_Edge]-(m) return n,r,m limit {limit}")
    Collection<Twitter_User> getMeEdges(@Param("limit")Integer limit);
    @Query("match (n:twitter_User)-[r:Me_Edge]-(m) where n.idTwProfile={idTwProfile} return n,r,m")
    Collection<Twitter_User> getTwMeEdgesOf(@Param("idTwProfile")String idTwProfile);
    @Query("match (n:twitter_User)-[r:Me_Edge]-(m:facebook_User) return n,r,m")
    Collection<Twitter_User> getFbTwBridges(@Param("limit")Integer limit);
    @Query("match (n)-[r:Me_Edge]-(m) where m.idFbProfile={idFbProfile} return n,r,m")
    Collection<Twitter_User> getFbMeEdgesOf(@Param("idFbProfile")String idFbProfile);

}
