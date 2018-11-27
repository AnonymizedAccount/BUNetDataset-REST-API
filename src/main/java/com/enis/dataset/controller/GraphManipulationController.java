package com.enis.dataset.controller;
import com.enis.dataset.GraphManipulation.GraphAlgorithms.BetweennessCentrality;
import com.enis.dataset.GraphManipulation.GraphAlgorithms.ClosenessCentrality;
import com.enis.dataset.GraphManipulation.GraphAlgorithms.PageRankCentrality;
import com.enis.dataset.GraphManipulation.GraphAlgorithms.DegreeCentrality;
import com.enis.dataset.services.GraphManipulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * Created by amina on 18/11/2018.
 */
@RestController
@RequestMapping("/rest/BUNet")
public class GraphManipulationController {
    @Autowired
    GraphManipulationService graphManipServ;

    @GetMapping("/graphProperties/Degree")
    public Collection<DegreeCentrality> getNodeDegree(@RequestParam(value="limit", required = false) Integer limit) {
        return graphManipServ.getNodeDegree(limit == null ? 100: limit);
    }
    @GetMapping("/graphProperties/PageRank")
    public Collection<PageRankCentrality> getPageRank(@RequestParam(value="limit", required=false) Integer limit) {
        return graphManipServ.getPageRank(limit== null ? 100: limit);
    }
    @GetMapping("/graphProperties/Betweenness")
    public Collection<BetweennessCentrality> getBetweenness(@RequestParam(value="limit", required=false) Integer limit,@RequestParam (value="relationships") List<String> relationships) {
        return graphManipServ.getBetweenness(limit== null ? 10: limit, relationships);
    }
    @GetMapping("/graphProperties/Closeness")
    public Collection<ClosenessCentrality> getCloseness(@RequestParam(value="limit", required=false) Integer limit, @RequestParam(value="relationships")List<String> relationships) {
        return graphManipServ.getCloseness(limit== null ? 10: limit, relationships);
    }

}
