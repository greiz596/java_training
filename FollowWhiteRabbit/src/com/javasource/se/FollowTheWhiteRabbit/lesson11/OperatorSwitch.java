package com.javasource.se.FollowTheWhiteRabbit.lesson11;

//https://metanit.com/java/tutorial/2.5.php условные конструкции

public class OperatorSwitch {
   final int VALUE = 2, firstvalue = 1, secondvalue = 2, thirdvalue = 3;
public void foo () {
    // оператор множественного выбора
    // byte short int char enum String

    switch (41){
        case 47:
            System.out.println(47);
            break;
        case 73:
            System.out.println(73);
            break;
        case 25:
            System.out.println(25);
            break;
        default:
            System.out.println("Not Found");

switch(VALUE){
    case firstvalue:
        System.out.println(firstvalue);
        break;
    case secondvalue:
        System.out.println(secondvalue);
        break;
    case thirdvalue:
        System.out.println(thirdvalue);
        break;
    default:
        System.out.println("Default");
}
    }
}
}
