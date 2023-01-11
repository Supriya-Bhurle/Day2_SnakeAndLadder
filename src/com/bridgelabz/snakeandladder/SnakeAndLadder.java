package com.bridgelabz.snakeandladder;

public class SnakeAndLadder {
    static public final int Starting_Position_Of_Player = 0;
    static public final int Ending_Position_Of_Player = 100;
    public static final int Ladder = 2;
    public static final int Snake = 1;
    public static final int NoPlay = 0;
    public static int rolldie(){
        int dievalue =(int)Math.floor(Math.random()*10)%6+1;
        return dievalue;
    }
    public static void main(String[] args) {
        System.out.println("welcome message added");

     int rolldie = rolldie();
     int presentPlayerPosition = 0;
    while ( presentPlayerPosition <= Ending_Position_Of_Player) {
    int currentPosition = 0;
    int checkPosition= (int)Math.floor(Math.random()*10)%3;
        switch (checkPosition){
        case Snake:
            currentPosition = rolldie - Snake;
            System.out.println("player is on Snake " +checkPosition);
            break;
        case  Ladder:
            currentPosition = Ladder + rolldie;
            System.out.println("player is on Ladder " +currentPosition);
            break;
        default:
            System.out.println("player is not playing " );
        }
        presentPlayerPosition = presentPlayerPosition + currentPosition;
        System.out.println("Player " + presentPlayerPosition);
    }
}}
