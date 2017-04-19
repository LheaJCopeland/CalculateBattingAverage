package com.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Step1 Ask user to enter # of times at bat
        double timesAtBat;
        double numOfBases;
        int i;
        String choice;
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Women's Softball Batting Average Calculator");
        System.out.println(" ");

        // Step2 Ask user for number of bases earned
        do {
            System.out.print("Please enter the number of times at bat: ");

            timesAtBat = scan.nextInt();

            //Step3 get user input for number of bases earned

            ArrayList<Double> basesEarnedList = new ArrayList<>();
            ArrayList<Double> slugBasesList = new ArrayList<>();

            for (i = 0; i < (timesAtBat); i++) {
                System.out.println("Please enter the number of bases earned for bat # " + (i + 1) + ":");
                System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
                numOfBases = scan.nextInt();
                scan.nextLine();
                basesEarnedList.add(numOfBases);

                if (numOfBases != 0) {
                    slugBasesList.add(numOfBases);
                }
            }

        /* I used this code to make sure the right elements were being added to the arrayList
        System.out.println("Current elements in arrayList: " + basesEarnedList);
        System.out.println();
        System.out.println("Slug arrayList: " + slugBasesList); */


            // Step4 display batting average
            System.out.println("The Batting Average is: " + findBatAverage(timesAtBat, basesEarnedList));

            // Step5 display slugging percentage
            System.out.println("The Slugging Percentage is: " + findSlugPercentage(slugBasesList));

            System.out.println();
            System.out.println("Would you like to know about another student?");
            System.out.println("Please enter yes or no");
            choice = scan.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
        System.out.println("Goodbye!");

    }
    public static double findBatAverage(double timesAtBat, ArrayList basesEarnedList){

        double sum1 = 0;
        double battingAverage;
        for (int i = 0 ; i < timesAtBat ; i++) {
            sum1 += (Double) basesEarnedList.get(i);
        }
        battingAverage = sum1/timesAtBat;
        return battingAverage;
    }

    public static double findSlugPercentage(ArrayList slugBasesList){
        double sum2 = 0;
        double slugPercentage;
        for (int i = 0; i < slugBasesList.size() ; i++) {
            sum2 += (Double) slugBasesList.get(i);
        }
        slugPercentage = sum2/ (slugBasesList.size());
        return slugPercentage;
    }
}

