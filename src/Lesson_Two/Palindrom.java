package Lesson_Two;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a word to check for Palindrom");
        String in = input.next();
        String P = "";

        for (int i= 0; i<in.length(); i++) {
            char pali = in.charAt(i);
             P = pali+P;
        }
        if (in.equals(P)){
            System.out.println("The Given word "+in+" is Palindrom");
        }
    }
}
