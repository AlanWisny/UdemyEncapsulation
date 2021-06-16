package com.company;

public class enhancedPlayer {
    private String name;
    private int hp;
    private String weapon;

    public enhancedPlayer(String name, int hp, String weapon) {
        this.name = name;
        if (hp >0 && hp <= 200) {
            this.hp = hp;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hp = this.hp - damage;
        if (this.hp <= 0){
            System.out.println("Player knocked out.");
        }
    }

    public int getHp() {
        return hp;
    }
}
