package Lesson_ONE;

import java.util.Scanner;

public class Enter_x {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a input: ");
        String num = input.next();
        while(!num.equals("x")) {
            Scanner input1 = new Scanner(System.in);
            System.out.println("Please enter the correct input");
            num = input.next();
        }
        System.out.println("Congrats You have enter the correct word");


    }
}
