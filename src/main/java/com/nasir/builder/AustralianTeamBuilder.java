package com.nasir.builder;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nasir on 5/3/17.
 */
public class AustralianTeamBuilder implements TeamBuilder {

    private CricketTeam cricketTeam;

    public AustralianTeamBuilder() {
        new CricketTeam();
    }

    public void buildOpener() {
        List<String> openers = Arrays.asList("David Warner", "Matt Renshaw");
        cricketTeam.setBowler(openers);
    }

    public void buildMiddleOrder() {
        List<String> middleOrder = Arrays.asList("Steve Smith", "Shaun Marsh");
        cricketTeam.setMiddleOrder(middleOrder);
    }

    public void buildBowler() {
        List<String> bowler = Arrays.asList("Nathan Lyon", "Mitchell Starc");
        cricketTeam.setBowler(bowler);
    }

    public CricketTeam getTeam() {
        return cricketTeam;
    }
}
