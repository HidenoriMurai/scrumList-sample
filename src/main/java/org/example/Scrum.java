package org.example;

public class Scrum {
    private String role;
    private String teamName;
    private int numberOfPeople;

    public Scrum(String teamName, String role, int numberOfPeople) {
        this.teamName = teamName;
        this.role = role;
        this.numberOfPeople = numberOfPeople;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getRole() {
        return role;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
