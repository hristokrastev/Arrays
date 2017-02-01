package Java_fund_second_couse.Arrays;

import java.util.Scanner;

public class LargestCommonEnd {
    public static void main(String[] args) {

        Scanner console = new Scanner ( System.in );

        String[] n = console.nextLine ().split ( " " );
        String[] n1 = console.nextLine ().split ( " " );

        int shorterLenght = Math.min ( n.length, n1.length );

        int countLeft = 0;
        int countRight = 0;
        for (int i = 0; i < shorterLenght; i++) {

            if (n[i].equals ( n1[i] )) {
                countLeft++;
                continue;
            }
            break;
        }
                for (int i = 1; i <= shorterLenght; i++) {
                        if (n[n.length - i].equals ( n1[n1.length - i] ) ) {
                            countRight++;
                            continue;
                        }
                            break;
                    }
        System.out.println (Math.max ( countLeft, countRight ));
        }
    }