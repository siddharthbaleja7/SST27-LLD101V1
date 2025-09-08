package com.example.game;

public class GoldenAura extends CharacterDecorator{
    public GoldenAura(Character character) {
        super(character);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + 2;
    }

    @Override
    public int getDamage() {
        return super.getDamage() + 5;
    }

    @Override
    public String getSprite() {
        return "golden_" + super.getSprite();
    }

    @Override
    public void move() {
        System.out.println("Golden Aura active");
        System.out.println("Moving at speed with sprite" + getSpeed() + getSprite());
    }
    @Override
    public void attack() {
        System.out.println("Golden Aura acctive!");
        System.out.println("Attacking with damage with sprite" + getDamage() + getSprite());
    }

}
