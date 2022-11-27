package com.javasource.se.FollowTheWhiteRabbit.lesson17;

public class Bus {
    public String model, color;
    public Engine engine;
    public Transmission transmission;
    public final String SERIAL_NUMBER = "D23HA6";
    public final int SERIAL_NUMBER_2 = 245365;

    public void go() {
        System.out.println("go");
    }

    public void showKm(int km1) {
        km1 = km1 +2 ;
        System.out.println(km1);
    }


    public Engine showKm2() {
        int km = 65;
        String str = "70km";
        engine = new Engine();
        return engine;
    }
}
