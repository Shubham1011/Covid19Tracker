package com.tracker.virus.Model;

import java.util.List;

public class AllData {

    private List<Cases_time_series> cases_time_series;
    private List<Statewise> statewise;


    public List<Cases_time_series> getCases_time_series() {
        return cases_time_series;
    }

    public void setCases_time_series(List<Cases_time_series> cases_time_series) {
        this.cases_time_series = cases_time_series;
    }

    public List<Statewise> getStatewise() {
        return statewise;
    }

    public void setStatewise(List<Statewise> statewise) {
        this.statewise = statewise;
    }


}
