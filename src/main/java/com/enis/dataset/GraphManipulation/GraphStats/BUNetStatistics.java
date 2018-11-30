package com.enis.dataset.GraphManipulation.GraphStats;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.neo4j.annotation.QueryResult;

import java.util.Collection;

/**
 * Created by amina on 16/11/2018.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@QueryResult
public class BUNetStatistics
{
    private String totalNumberOfUsers;
    private String relationshipsNumber;
    private String meEdgesNumber;
    private String fbFriendsNumber;
    private String twFriendsNumber;
    private Collection<String> socialMedia_Website;
    private Collection<BUNetStatistics> stats;
    private Long users_Number;


    public String getTotalNumberOfUsers() {
        return totalNumberOfUsers;
    }

    public String getRelationshipsNumber() {
        return relationshipsNumber;
    }

    public String getMeEdgesNumber() {
        return meEdgesNumber;
    }

    public String getFbFriendsNumber() {
        return fbFriendsNumber;
    }

    public String getTwFriendsNumber() {
        return twFriendsNumber;
    }
    public Collection<String> getSocialMedia_Website() {
        return socialMedia_Website;
    }

    public Long getUsers_Number() {
        return users_Number;
    }

    public Collection<BUNetStatistics> getStats() {
        return stats;
    }

    public void setStats(Collection<BUNetStatistics> stats) {
        this.stats = stats;
    }
}
