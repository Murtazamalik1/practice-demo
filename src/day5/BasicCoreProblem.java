package day5;

import java.util.Scanner;

//Harmonic Number
public class    BasicCoreProblem {
    public static void main(String[] args) {
        double n;
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Harmonic Number");
        n = scanner.nextInt();

        if (n > 0) {
            for (double i = 0; i <= n; i++) {
                sum = n + (1 / i);
            }
            System.out.println(sum);
        }
        else {
            System.out.println("enter  the positive number");
        }
    }
}
