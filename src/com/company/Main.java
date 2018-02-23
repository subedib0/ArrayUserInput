package com.company;

import java.util.Scanner;
//write a progranm which asks user how many movies they want to enter
//than declare the array to hold that many items
//Next promt user to enter each movie
//Add each movie to Array
//print the list of movies using for loop

public class Main {

    public static void main(String[] args) {


        String[] movie = new String[5];

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a movie name here :");


        for (int i = 0; i < movie.length; i++) {
           //reading the movie that user enter and assign to the array
            movie[i] = scan.nextLine();

        }
        System.out.println("There are " + ((movie.length)) + " movie in array");
//
//        System.out.println(movie[0]);
//        System.out.println(movie[1]);
//        System.out.println(movie[2]);
//        System.out.println(movie[3]);
//        System.out.println(movie[4]);

//if you put i<5 it will work the same way movie length is the number you define in array
        for (int i = 0; i < movie.length; i++) {
            //printing the Movie that user enter
            System.out.println(movie[i]);




        }

    }
}

