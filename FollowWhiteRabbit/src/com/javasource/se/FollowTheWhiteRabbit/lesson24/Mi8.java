package com.javasource.se.FollowTheWhiteRabbit.lesson24;


//implements - "реализуем данный интерфейс"

public class Mi8 extends Helicopter implements VerticalTakeoff {
    @Override
    public void fly() {
        System.out.println("mi8");
    };

    @Override
    public void verticalTakeoff() {
        System.out.println("vertical");

    }
}
