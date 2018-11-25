package com.enis.dataset.services;

import com.enis.dataset.GraphManipulation.GraphAlgorithms.BetweennessCentrality;
import com.enis.dataset.GraphManipulation.GraphAlgorithms.ClosenessCentrality;
import com.enis.dataset.GraphManipulation.GraphAlgorithms.PageRankCentrality;
import com.enis.dataset.GraphManipulation.GraphAlgorithms.DegreeCentrality;
import com.enis.dataset.repositories.GraphManipulationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * Created by amina on 18/11/2018.
 */
@Service
public class GraphManipulationService {
    @Autowired
    GraphManipulationRepository graphManipRep;

    public Collection<DegreeCentrality> getNodeDegree(Integer limit) {

        return graphManipRep.getNodeDegree(limit);
    }
    public Collection<PageRankCentrality> getPageRank(Integer limit) {
        return graphManipRep.getPageRank(limit);}
    public Collection<BetweennessCentrality> getBetweenness(Integer limit, List<String> relationships) {
        return graphManipRep.getBetweennes(limit,relationships);}
    public Collection<ClosenessCentrality> getCloseness(Integer limit, List<String> relationships){
        return graphManipRep.getClosenessCentrality(limit, relationships);
    }

}
