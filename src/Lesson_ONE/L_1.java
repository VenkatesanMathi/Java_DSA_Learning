package Lesson_ONE;

import java.util.Scanner;

public class L_1 {
    public static void main(String[] args) {
        System.out.print("Input a Year to check the leap year ");
        Scanner Leapyear = new Scanner(System.in);
        int Leap = Leapyear.nextInt();
                if (Leap % 4 == 0) System.out.println("This year " + Leap + " is Leap Year");
                else System.out.println("This year " + Leap + " is not Leap Year");
    }
}
