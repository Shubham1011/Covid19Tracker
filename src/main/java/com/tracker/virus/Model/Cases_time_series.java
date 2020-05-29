package com.tracker.virus.Model;

public class Cases_time_series {

    private String dailyconfirmed;
    private String date;
    private String totaldeceased;

    public String getDailyconfirmed() {
        return dailyconfirmed;
    }

    public void setDailyconfirmed(String dailyconfirmed) {
        this.dailyconfirmed = dailyconfirmed;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotaldeceased() {
        return totaldeceased;
    }

    public void setTotaldeceased(String totaldeceased) {
        this.totaldeceased = totaldeceased;
    }
}
