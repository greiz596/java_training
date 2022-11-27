package com.javasource.se.FollowTheWhiteRabbit.lesson20;

public enum Music {
    CLASSIC(5), ROCK(6), POP(7);

    //объекты хранят в себе поля из конструктора
    private int i;

    Music(int i) {
        this.i = i;
    }
}
