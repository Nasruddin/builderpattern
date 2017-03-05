package com.nasir.builder;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nasir on 5/3/17.
 */
public class IndianCricketTeam implements TeamBuilder{
    private CricketTeam cricketTeam;

    public IndianCricketTeam() {
        this.cricketTeam = new CricketTeam();
    }

    public void buildOpener() {
        List<String> opener = Arrays.asList("Sachin Tendulkar", "Virender Sehwag");
        cricketTeam.setOpener(opener);
    }

    public void buildMiddleOrder() {
        List<String> middleOrder = Arrays.asList("MS Dhoni", "Yuvraj Singh");
        cricketTeam.setMiddleOrder(middleOrder);
    }

    public void buildBowler() {
        List<String> bowler = Arrays.asList("Zaheer Khan", "Anil Kumble");
        cricketTeam.setBowler(bowler);
    }

    public CricketTeam getTeam() {
        return cricketTeam;
    }
}
