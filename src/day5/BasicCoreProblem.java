package day5;

import java.util.Scanner;

//Leap Year
public class    BasicCoreProblem {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any year to check its leap year or not");
        year = scanner.nextInt();

        if (year %2 == 0 && year%4 == 0 && year%100 != 0 || year%400 == 0 ){
            System.out.println(" Leap Year :" + year);
        }
        else {
            System.out.println("Not Leap Year :" + year );
        }
    }
}
