package com.javasource.se.FollowTheWhiteRabbit.lesson19;



//https://metanit.com/java/tutorial/2.17.php  return

public class Encapsulation {

    private int a , b;

    public int showResult(){
        return a+b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
