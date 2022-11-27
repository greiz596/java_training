package com.javasource.se.FollowTheWhiteRabbit.lesson21;

public class Birds {
    private String name;
    private Wings wings;

    public void walk () {
        System.out.println("Ho-ho-ho");
    }

    public Birds(String name, Wings wings) {
        this.name = name;
        this.wings = wings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }
}
