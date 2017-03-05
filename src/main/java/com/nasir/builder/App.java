package com.nasir.builder;

/**
 * Created by nasir on 5/3/17.
 */
public class App {
    public static void main(String[] args) {
        TeamBuilder teamBuilder = new IndianCricketTeam();
        TeamDirector teamDirector = new TeamDirector(teamBuilder);
        teamDirector.constructTeam();
        CricketTeam cricketTeam = teamDirector.getTeam();
        System.out.println("Indian Cricket :: " + cricketTeam);
    }
}
