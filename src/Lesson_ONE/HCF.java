package Lesson_ONE;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        System.out.print("Please input first number ");
        Scanner input =  new Scanner(System.in);
        int a =  input.nextInt();
        System.out.print("Please input second number ");
        Scanner input1 = new Scanner(System.in);
        int b = input1.nextInt();
        int max = (a>b) ? a:b;
        int HCF = 0;
        for(int i = 1; i<=max; i++) {
            if((a%i==0) && (b%i==0)) {
              HCF = i;
            }
        }
        System.out.println(HCF);
    }
}
