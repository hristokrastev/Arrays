package Java_fund_second_couse.Arrays;

import java.sql.Array;
import java.util.Scanner;
import java.util.StringJoiner;

public class LastKnumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int k = Integer.parseInt(console.nextLine());

        int numbers[] = new int[n];
        numbers[0] = 1;




        for (int i = 1; i < n; i++) {
            int sum = 0;

            for (int j = i - 1; j >= 0 && j > i - k; j--) {

                sum += numbers[j];
            }
numbers[i] = sum;

        }

    }
}

