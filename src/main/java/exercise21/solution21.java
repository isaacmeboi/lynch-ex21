/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Isaac Lynch
 */
package exercise21;

import java.util.*;

class NTN {
    public void scn() {
        Scanner sc = new Scanner(System.in);

        NTN ntn = new NTN();

        System.out.print("Please enter the month number: ");
        int m = sc.nextInt();

        String r = ntn.months(m);

        if (m > 0 && m < 12)
            System.out.print("That month is " + r);
        else
            System.out.print(r + ": That is an invalid number. Please try again.");

    }

    public String months(int m) {
        return switch (m) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "ERROR:";
        };
    }

}
public class solution21 {

    public static void main(String[] args) {
        NTN ca = new NTN();
        ca.scn();
    }
}
/*
the first thing done in this code is that there is a class call NTN which holds both
the public void for scn and the public string titled months. scn reads in the user's
inputs as well as the if else to determine whether or not the user put in a valid
number. if the user doesn't it prints an error message and terminates the program.
otherwise scn runs the months public string which holds a switch statement to see
which month the user picked. there are thirteen cases in total, one for each month
and then a defaut for the error message. the main function then calls the scn function
from the NTN class which executes both the scan functions and the switch statements.
*/