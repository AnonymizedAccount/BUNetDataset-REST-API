package com.enis.dataset.GraphManipulation.GraphStats;

import org.springframework.data.neo4j.annotation.QueryResult;

import java.util.Collection;

/**
 * Created by amina on 17/11/2018.
 */
@QueryResult
public class SocialMediaStats {

    private Collection<String> socialMedia_Website;
    private Long users_Number;

    public Collection<String> getSocialMedia_Website() {
        return socialMedia_Website;
    }

    public Long getUsers_Number() {
        return users_Number;
    }
}
