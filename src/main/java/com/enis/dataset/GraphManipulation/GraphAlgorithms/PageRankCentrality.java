package com.enis.dataset.GraphManipulation.GraphAlgorithms;

import org.springframework.data.neo4j.annotation.QueryResult;

import java.util.Collection;

/**
 * Created by amina on 19/11/2018.
 */

@QueryResult
public class PageRankCentrality extends Centrality{

   private Double pageRank_Score;

    public PageRankCentrality() {
    }

    public Double getPageRank_Score() {
        return pageRank_Score;
    }
}
