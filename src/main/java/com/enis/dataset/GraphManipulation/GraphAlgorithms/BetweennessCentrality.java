package com.enis.dataset.GraphManipulation.GraphAlgorithms;

import org.springframework.data.neo4j.annotation.QueryResult;

/**
 * Created by amina on 19/11/2018.
 */
@QueryResult
public class BetweennessCentrality extends Centrality{

    private Double betweenness_Score;

    public BetweennessCentrality() {
    }

    public Double getBetweenness_Score() {
        return betweenness_Score;
    }
}
