import java.util.ArrayList;

//1. b
public class Team {


    //1.c
    private String teamName;

    //1.d
    private int rank;

    //1.e
    private ArrayList<String> teamPlayerNames = new ArrayList<String>();

    //1.f
    public Team(String teamName) {
        this.teamName = teamName;
    }

    //1.h
    public void setRank(int rank) {
        this.rank = rank;
    }

    //1.j & 1.m
    public String toString() {
        String playersNewLine = "";
        for (String player : teamPlayerNames) {
            playersNewLine += player + "\n" + "\t";
        }
        return "TEAM: " + teamName + "\nRank: " + rank + "\nTeam Members: \n" + "\t" + playersNewLine;
    }

    //1.l
    public void addPlayer(String teamPlayerName) {
        teamPlayerNames.add(teamPlayerName);
        
    }
}