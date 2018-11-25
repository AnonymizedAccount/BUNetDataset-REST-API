package com.enis.dataset.GraphManipulation.GraphAlgorithms;

import org.springframework.data.neo4j.annotation.QueryResult;

import java.util.Collection;

/**
 * Created by amina on 17/11/2018.
 */
@QueryResult
public class DegreeCentrality extends Centrality{

    private Long idUser;
    private Integer degree;
    private Integer outDegree;
    private Integer inDegree;

    public Integer getDegree() {
        return degree;
    }

    public Integer getOutDegree() {
        return outDegree;
    }

    public int getInDegree() {
        return inDegree;
    }

    public Long getIdUser() {
        return idUser;
    }
/*public int getNodeConnectivity() {
        return nodeConnectivity;
    }

    public int getNodeCentrality() {
        return nodeCentrality;
    }*/
}
