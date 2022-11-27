package com.javasource.se.FollowTheWhiteRabbit.lesson23;

public abstract class Weapon {  //на основе этого класса нельзя создать экземпляр класса
    private String name;

    public abstract void foo(); //абстрактные методы не имеют тела.

    public void show(){
        System.out.println("hello");
    }
}
