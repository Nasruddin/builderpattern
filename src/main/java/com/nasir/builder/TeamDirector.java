package com.nasir.builder;

/**
 * Created by nasir on 5/3/17.
 */
public class TeamDirector {

    private TeamBuilder teamBuilder = null;

    public TeamDirector(TeamBuilder teamBuilder) {
        this.teamBuilder = teamBuilder;
    }

    public void constructTeam() {
        teamBuilder.buildOpener();
        teamBuilder.buildMiddleOrder();
        teamBuilder.buildBowler();
    }

    public CricketTeam getTeam() {
        return teamBuilder.getTeam();
    }
}
