package Lesson_Two;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int fb = 0;
        int num = input.nextInt();
        System.out.print("Fibonacci Series 0 1");
        for (int i =0; i<=num; i++) {
            fb = a+b;
            a = b;
            b = fb;
            System.out.print(" "+fb);
        }

    }
}
