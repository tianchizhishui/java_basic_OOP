package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        test();

    }

    private static void test() {
        // create a panda
        Animal panda = new Animal("meng", 8, true);
        System.out.println(panda.getAge());

    }
}