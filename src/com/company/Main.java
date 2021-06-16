package com.company;

public class Main {

    public static void main(String[] args) {
//	Player player = new Player();
//	player.name = "Alan";
//	player.health = 20;
//	player.weapon = "Zweihander";
//
//	int damage = 10;
//	player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

	enhancedPlayer player = new enhancedPlayer("Alan", 50, "Getsuga");
	System.out.println("Initial hp is " + player.getHp());



    }
}
