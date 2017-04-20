package ru.cdv;

import java.util.Arrays;


public class MyExp {

    public static void main(String[] args) {

        System.out.println(
        Arrays.stream(new int[5])
                .map(s -> {
                    s = (int) (Math.random() * 100);
                    System.out.println(s);
                    return s;
                })
                .max()
        );


    }

}
