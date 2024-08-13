package Lesson_Two;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number to check Armstrong number or not: ");
        int in = input.nextInt();
        int cream = in;
        String te = Integer.toString(in);
        int length = te.length();
        int dummy = 0;
        while(in>0){
            int rem = in%10;
            in /=10;
            dummy = dummy + ((rem) * (rem) * (rem));
            }
        if(dummy == cream){
            System.out.println("Given number is a Armstrong number");
        }else {
            System.out.println("Given number is not a Armstrong number");
        }
    }
}
