package com.nasir.builder;

import java.util.List;

/**
 * Created by nasir on 5/3/17.
 */
public class CricketTeam {
    private List<String> opener;
    private List<String> middleOrder;
    private List<String> bowler;

    public void setOpener(List<String> opener) {
        this.opener = opener;
    }

    public void setMiddleOrder(List<String> middleOrder) {
        this.middleOrder = middleOrder;
    }

    public void setBowler(List<String> bowler) {
        this.bowler = bowler;
    }

    public List<String> getOpener() {
        return opener;
    }

    public List<String> getMiddleOrder() {
        return middleOrder;
    }

    public List<String> getBowler() {
        return bowler;
    }

}
