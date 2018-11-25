package com.enis.dataset.repositories;

import com.enis.dataset.domain.MicroBloggingSites.twitter_User;
import com.enis.dataset.domain.SocialNetworks.facebook_User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

/**
 * Created by amina on 09/11/2018.
 */
public interface FacebookUserRepository extends Neo4jRepository<facebook_User, Long> {

    @Query("match (user:facebook_User) return user limit {limit}")
    Collection<facebook_User> getAllUsers(@Param("limit") int limit);

    @Query("match (n)-[r:FB_FriendOf]->(m)  where n.idFbProfile={idFbProfile}  return m")
    Collection<facebook_User> getFriends(@Param("idFbProfile") String idFbProfile);


}
