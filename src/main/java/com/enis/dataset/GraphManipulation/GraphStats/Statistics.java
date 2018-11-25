package com.enis.dataset.GraphManipulation.GraphStats;

import org.springframework.data.neo4j.annotation.QueryResult;

/**
 * Created by amina on 16/11/2018.
 */
@QueryResult
public class Statistics
{
    private int totalNumberOfUsers;
    private int relationshipsNumber;
    private int meEdgesNumber;
    private int fbFriendsNumber;
    private int twFriendsNumber;

    public int getTotalNumberOfUsers() {
        return totalNumberOfUsers;
    }

    public int getRelationshipsNumber() {
        return relationshipsNumber;
    }

    public int getMeEdgesNumber() {
        return meEdgesNumber;
    }

    public int getFbFriendsNumber() {
        return fbFriendsNumber;
    }

    public int getTwFriendsNumber() {
        return twFriendsNumber;
    }
}
