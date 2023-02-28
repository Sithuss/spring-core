package com.demo;

import com.demo.beans.*;

public class Main {
    public static void main(String[] args) {

        Knight knight = new Knight();
        knight.setQuest(new GreatMatrimonyQuest());
        System.out.println(knight.goQuest());
    }
}
