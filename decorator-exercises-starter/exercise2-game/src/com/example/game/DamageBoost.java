package com.example.game;

public class DamageBoost extends CharacterDecorator{
    private final int boost;
    public DamageBoost(Character character, int boost){
        super(character);
        this.boost = boost;
    }
    @Override
    public int getDamage() {
        return super.getDamage() + boost;
    }

    @Override
    public void attack() {
        System.out.println("Attacking with boosted damage " + getDamage() + " using sprite " + getSprite());
    }
    
}
