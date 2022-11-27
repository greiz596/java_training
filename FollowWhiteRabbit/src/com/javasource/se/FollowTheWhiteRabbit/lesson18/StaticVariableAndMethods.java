package com.javasource.se.FollowTheWhiteRabbit.lesson18;

public class StaticVariableAndMethods {
    public static int variable;
    public int varibale2;

    static {
        variable = foo();
    }

    public static int foo(){
        System.out.println(variable);
        return 1;
//        show(); - в стат. методе нельзя использовать не стат. методы
    }

    public void show(){
        foo();
    }
}
