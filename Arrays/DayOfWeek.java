package Java_fund_second_couse.Arrays;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int day = Integer.parseInt(console.nextLine());

        if (day > 7 || day < 1){
            System.out.println("Invalid day!");
        }else {
            System.out.println(daysOfWeek[day - 1]);
        }
    }
}