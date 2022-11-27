package com.javasource.se.FollowTheWhiteRabbit.lesson25;

public class Dollysheet implements Cloneable {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}




/*
public class Main  {
    public static void main(String[] args) {

        Dollysheet dollysheet = new Dollysheet();
        Dollysheet dollysheet2 = foo(dollysheet);

        dollysheet2.setName("Dolly");
        dollysheet2.setName("Sheet");

        System.out.println(dollysheet.getName());
        System.out.println(dollysheet2.getName());



        }
        public static Dollysheet foo(Dollysheet dollySheet2){
            Dollysheet sheet = null;
            try {
                sheet=(Dollysheet) dollySheet2.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
    return sheet;
    }

}
    public static void main(String[] args) {public class Main {
    public static void main(String[] args) {

        Dollysheet dollysheet = new Dollysheet();
        Dollysheet dollysheet2 = foo(dollysheet);

        dollysheet2.setName("Dolly");
        dollysheet2.setName("Sheet");

        System.out.println(dollysheet.getName());
        System.out.println(dollysheet2.getName());



        }
        public static Dollysheet foo(Dollysheet dollySheet2){
            Dollysheet sheet = null;
            try {
                sheet=(Dollysheet) dollySheet2.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
    return sheet;
    }

} */

























