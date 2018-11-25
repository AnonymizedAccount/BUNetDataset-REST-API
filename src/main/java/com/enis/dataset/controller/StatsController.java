package com.enis.dataset.controller;

import com.enis.dataset.GraphManipulation.GraphStats.DatasetStats;
import com.enis.dataset.services.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by amina on 16/11/2018.
 */
@RestController
@RequestMapping("/rest/dataset")
public class StatsController {
    @Autowired
    StatsService datasetSer;
    @RequestMapping("/statistics")
    DatasetStats getStatistics(){
        return datasetSer.getStatistics();}

}
