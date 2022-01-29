package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num = 1;
        switch (num){
            case 1:
                System.out.println("Тест-1");
                System.out.println(advice(ageOfMan(),tempurature()));
            case 2:
                System.out.println("Тест-2");
                System.out.println(advice(ageOfMan(),tempurature()));
            case 3:
                System.out.println("Тест-3");
                System.out.println(advice(ageOfMan(),tempurature()));
            case 4:
                System.out.println("Тест-4");
                System.out.println(advice(ageOfMan(),tempurature()));
            case 5:
                System.out.println("Тест-5");
                System.out.println(advice(ageOfMan(),tempurature()));
                break;
        }
    }
    public static String advice (int ageOfMan, int tempuratureOfStreet){
        String res;
        if ((ageOfMan>=20 && ageOfMan<=45) && (tempuratureOfStreet>=-20 && tempuratureOfStreet<=30)) {
            res = "Можно идти гулять";
        } else if (ageOfMan<20 && (tempuratureOfStreet>=0 && tempuratureOfStreet<=28)) {
            res = "Можно идти гулять";
        } else if (ageOfMan>45 && (tempuratureOfStreet>=-10 && tempuratureOfStreet<=25)) {
            res = "Можно идти гулять";
        } else {
            res ="Оставайтесь дома";
        }
        return res;
    }
    public static int ageOfMan(){
        int a = 0, b = 100;
        int age = a + (int) (Math.random() * b);
        System.out.println("Возраст человека: " + age);
        return age;
    }
    public static int tempurature(){
        int a = -100, b = 100;
        int temp = a + (int) (Math.random() * b);
        System.out.println("Tемпература на улице: " + temp);
        return temp;
    }
}
