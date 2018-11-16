package com.enis.dataset.repositories;

import com.enis.dataset.domain.DatasetStatistics;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by amina on 16/11/2018.
 */

public interface DatasetRepository extends GraphRepository<DatasetStatistics> {

    @Query("MATCH (n) RETURN distinct labels(n) as labels, count(*) as nodesNumber")
    DatasetStatistics getStatistics();
}
