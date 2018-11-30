package com.enis.dataset.services;

import com.enis.dataset.GraphManipulation.GraphStats.BUNetStatistics;
import com.enis.dataset.repositories.StatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by amina on 16/11/2018.
 */
@Service
public class StatsService {
    @Autowired
    StatsRepository datasetRep;

    public BUNetStatistics getStatistics(){

        Collection<BUNetStatistics> labelsStats;
        BUNetStatistics complexStats;
        labelsStats=datasetRep.getNodeLabelsStats();
        complexStats=datasetRep.getDatasetStats();
        complexStats.setStats(labelsStats);
        return complexStats;
    }

}
