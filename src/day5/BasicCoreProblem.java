package day5;

import java.util.Scanner;

//Flip Coin And Print Percentage Of Head And Tail
public class    BasicCoreProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int head = 0;
        int tail =0;
        System.out.println("enter  no of times to flip coin");
        double n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            float random = (float) Math.random();
            if (random < 0.5) {
                System.out.println("Head :" + n);
                head++;
            } else {
                System.out.println("Tail :" + n);
                tail++;
            }
        }

        float headPercent = (float) ( head/n * 100);
        float tailPercent = (float) ( tail/n * 100);
        System.out.println(" the percentage of head is :" + headPercent + "%");
        System.out.println(" the percentage of tail is :" + tailPercent + "%");

    }
}
