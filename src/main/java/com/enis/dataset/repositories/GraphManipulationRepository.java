package com.enis.dataset.repositories;

import com.enis.dataset.GraphManipulation.GraphAlgorithms.BetweennessCentrality;
import com.enis.dataset.GraphManipulation.GraphAlgorithms.ClosenessCentrality;
import com.enis.dataset.GraphManipulation.GraphAlgorithms.PageRankCentrality;
import com.enis.dataset.GraphManipulation.GraphAlgorithms.DegreeCentrality;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

/**
 * Created by amina on 18/11/2018.
 */
public interface GraphManipulationRepository extends Neo4jRepository<DegreeCentrality, Long> {

    @Query("start home=node(*)\n" +
            "match (home)--()\n" +
            "WITH home,count(*) as degree\n" +
            "match (home)-->()\n" +
            "WITH home,degree,count(*) as outDegree\n" +
            "match (home)<--()\n" +
            "return home.name as name, ID(home) as idUser,labels(home) as socialNetwork,degree,outDegree,count(*) as inDegree\n" +
            "order by degree desc limit {limit}")
    Collection<DegreeCentrality> getNodeDegree(@Param("limit") Integer limit);

    @Query("MATCH (node) \n" +
            "WITH collect(node) as nodes\n" +
            "CALL apoc.algo.pageRank(nodes) YIELD node, score\n" +
            "RETURN node.name as name, labels(node) as socialNetwork , score as pageRank_Score order by pageRank_Score desc limit {limit}")
    Collection<PageRankCentrality> getPageRank(@Param("limit") Integer limit);
    @Query("match (n) with collect(n) as nodes\n" +
            "call apoc.algo.betweenness({relationships},nodes, 'BOTH') YIELD node, score\n" +
            "return node.name as name, labels(node) as socialNetwork, score as betweenness_Score order by betweenness_Score desc limit {limit}")
    Collection<BetweennessCentrality> getBetweennes(@Param("limit") Integer limit, @Param("relationships") List<String> relationships);

    @Query("match (n) with collect(n) as nodes\n" +
            "call apoc.algo.closeness({relationships},nodes, 'BOTH') YIELD node, score return node.name as name," +
            " labels(node) as socialNetwork, " +
            "score as closeness_Score order by closeness_Score desc limit {limit}")
    Collection<ClosenessCentrality> getClosenessCentrality(@Param("limit")Integer limit, @Param("relationships") List<String> relationships);
}
