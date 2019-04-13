package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Team {
    private String nameTeam;
    private int numberOfPlayers;
    private ArrayList<Player> roster;
    private ArrayList<Player> playerArrayList;

    public Team(String nameTeam){
        this.nameTeam=nameTeam;
        this.roster = new ArrayList<>();
    }
    public void addPlayer(Player player){
        roster.add(player);
        this.numberOfPlayers++;
    }
    public ArrayList<Player> findPlayerByName(String name){
        ArrayList<Player> foundPlayerByName =new ArrayList<>();
        /* ciclo e condizione per recuperare i giocatori con le caratteristiche corrispondenti*/
        for (Player players:
                roster)
              {
                  playerArrayList = roster;
                  if(playerArrayList.equals(Player.getName())) {
                  for (Player player:
                       foundPlayerByName) {
                      foundPlayerByName.add(player);
                  }
              }
        }
        /* appena trovati aggiungerli all'array FoundPlayer*/
        return foundPlayerByName;
    }

    public ArrayList<Player> findPlayerByRole(String role){
        ArrayList<Player> foundPlayerByRole =new ArrayList<>();
        int numberOfPlayerFound=0;
        /* ciclo e condizione per recuperare i giocatori con le caratteristiche corrispondenti*/
        for (Player players:
                roster)
        {
            playerArrayList = roster;
            if(playerArrayList.equals(Player.getRole())) {
                for (Player player:
                        foundPlayerByRole) {
                    foundPlayerByRole.add(player);
                    numberOfPlayerFound++;
                }
            }
        }
        /* appena trovati aggiungerli all'array FoundPlayer*/
        System.out.println("Player: " + numberOfPlayerFound + " found.");
        return foundPlayerByRole;
    }
}
