package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 1, 4));
        list = Main.fix34(list);
        System.out.println(list);
    }
}
