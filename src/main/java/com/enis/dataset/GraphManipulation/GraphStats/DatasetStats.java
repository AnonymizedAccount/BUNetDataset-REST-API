package com.enis.dataset.GraphManipulation.GraphStats;

import java.util.Collection;

/**
 * Created by amina on 17/11/2018.
 */
public class DatasetStats {
    private Statistics stats;
    private Collection<SocialMediaStats> nodeLabelStats;

    public Statistics getStats() {
        return stats;
    }

    public Collection<SocialMediaStats> getLabelStats() {
        return nodeLabelStats;
    }

    public void setLabelStats(Collection<SocialMediaStats> nodeLabelStats) {
        this.nodeLabelStats = nodeLabelStats;
    }

    public void setStats(Statistics stats) {
        this.stats = stats;
    }
}
