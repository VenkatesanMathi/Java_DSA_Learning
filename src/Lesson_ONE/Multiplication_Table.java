package Lesson_ONE;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        System.out.print("Please input a Number to see the Multiplication Table ");
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        System.out.print("Please input a number till which you want to see the Multiplication table want ");
        Scanner input1 = new Scanner(System.in);
        int i = input1.nextInt();
        int Total ;
        for (int j= 1; j<=i; j++) {
            Total = M*j;
            System.out.println(M+"*"+j+"="+Total);
        }
    }
}
