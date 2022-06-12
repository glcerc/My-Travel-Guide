package com.company;

import java.util.Scanner;

public class ProfileManager {
    Scanner scanner = new Scanner(System.in);

    public void createProfile(Profile profile){

        System.out.println("Please give your name ");
        String name=scanner.nextLine();
        System.out.println("Please give your surname ");
        String surname=scanner.nextLine();
        System.out.println("Please give your age ");
        int age=scanner.nextInt();
        System.out.println("Please give your nickname ");
        String nickname=scanner.nextLine();
        System.out.println("Please create password");
        String password=scanner.nextLine();
        System.out.println("Your profile has been successfully created");
        System.out.println("Your profile"+profile.details);

    }
    public void addFavorites(){
         System.out.println("Welcome to your favorites.");
         System.out.println("Please write your favorite you want to add. For example, Kemeraltı.");
         Scanner scanner1 = new Scanner(System.in);
         String favorite=scanner1.nextLine();

    }


    public void addmyPlaces(){
        System.out.println("Welcome to your My Places.");
        System.out.println("Please write your favorite you want to add. For example, Burger King or Efes Ancient City.");
        Scanner scanner3= new Scanner(System.in);
        String myPlace=scanner3.nextLine();
    }

    public void mustGo(){
        System.out.println("Welcome to your Must Go.");
        System.out.println("Please write your Must Go place you want to add");
        Scanner scanner4= new Scanner(System.in);
        String mustgo=scanner4.nextLine();
    }


    public void haveGone(){
        System.out.println("Welcome to your Have Gone.");
        System.out.println("Please write your Have Gone place you want to add");
        Scanner scanner5= new Scanner(System.in);
        String havegone=scanner5.nextLine();


    }
}



