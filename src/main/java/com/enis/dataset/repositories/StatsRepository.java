package com.enis.dataset.repositories;

import com.enis.dataset.GraphManipulation.GraphStats.BUNetStatistics;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.Collection;

/**
 * Created by amina on 16/11/2018.
 */

public interface StatsRepository extends Neo4jRepository<BUNetStatistics, Long> {
    @Query("match (n) with toString(count(n)) as totalNumberOfUsers\n" +
            "match (n)-[r]-() with totalNumberOfUsers, toString(count(r)) as relationshipsNumber\n" +
            "match (n)-[rel:Me_Edge]-() with  relationshipsNumber, toString(count(rel)) as meEdgesNumber, totalNumberOfUsers\n" +
            "match (n:facebook_User)-[fbFriends:FB_FriendOf]-() with relationshipsNumber, meEdgesNumber, totalNumberOfUsers, toString(count(fbFriends)) as fbFriendsNumber\n" +
            "match (n:twitter_User)-[twFriends:TW_FriendOf]-() return toString(count(twFriends)) as twFriendsNumber,relationshipsNumber,meEdgesNumber, totalNumberOfUsers, fbFriendsNumber")
    BUNetStatistics getDatasetStats();

    @Query("MATCH (n) RETURN distinct labels(n) as socialMedia_Website, count(*) as users_Number order by users_Number Desc")
    Collection<BUNetStatistics> getNodeLabelsStats();

}
