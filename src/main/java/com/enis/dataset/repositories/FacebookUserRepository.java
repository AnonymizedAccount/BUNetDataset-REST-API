package com.enis.dataset.repositories;

import com.enis.dataset.domain.SocialNetworks.Facebook_User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

/**
 * Created by amina on 09/11/2018.
 */
public interface FacebookUserRepository extends Neo4jRepository<Facebook_User, Long> {

    @Query("match (user:facebook_User) return user limit {limit}")
    Collection<Facebook_User> getAllUsers(@Param("limit") Integer limit);

    @Query("match (user:facebook_User) where user.idFbProfile={idFbProfile} return user")
    Facebook_User getUser(@Param("idFbProfile") String idFbProfile);

    @Query("match (n)-[r:FB_FriendOf]->(m)  where n.idFbProfile={idFbProfile}  return m")
    Collection<Facebook_User> getFriends(@Param("idFbProfile") String idFbProfile);


}
