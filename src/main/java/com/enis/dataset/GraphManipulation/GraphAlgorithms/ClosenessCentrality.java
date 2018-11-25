package com.enis.dataset.GraphManipulation.GraphAlgorithms;

import org.springframework.data.neo4j.annotation.QueryResult;

/**
 * Created by amina on 19/11/2018.
 */
@QueryResult
public class ClosenessCentrality extends Centrality{

    private Double closeness_Score;
    public ClosenessCentrality() {
    }

    public Double getCloseness_Score() {
        return closeness_Score;
    }
}
