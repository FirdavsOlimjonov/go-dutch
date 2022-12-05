package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scanner = new Scanner(System.in);

        int bill = scanner.nextInt();
        if (bill<0){
            System.out.println("Bill total amount cannot be negative");
            return;
        }

        int numberOfFriends = scanner.nextInt();
        if (numberOfFriends<=0) {
            System.out.println("Number of friends cannot be negative or zero");
            return;
        }

        bill += bill/10;
        System.out.println(bill/numberOfFriends);
    }
}
