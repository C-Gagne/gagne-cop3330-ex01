package org.example.ex1;

import java.util.Scanner;


public class App
{
    public static void main(String[] args)
    {
        String name;
        System.out.println("What is your name?");
        name = getName();

        Greeter greet = new Greeter();
        String finalString = greet.genGreet(name);
        System.out.println(finalString);
    }

    public static String getName()
    {
        Scanner newName = new Scanner(System.in);
        return newName.nextLine();
    }
}