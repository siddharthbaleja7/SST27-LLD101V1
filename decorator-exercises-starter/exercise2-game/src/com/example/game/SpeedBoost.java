package com.example.game;

public class SpeedBoost extends CharacterDecorator{
    private final int boost;

    public SpeedBoost(Character character, int boost) {
        super(character);
        this.boost = boost;
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + boost;
    }

    @Override
    public void move() {
        System.out.println("Moving at boosted speed " + getSpeed() + " with sprite " + getSprite());
    }
}
