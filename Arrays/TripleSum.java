package Java_fund_second_couse.Arrays;

import java.util.Scanner;

public class TripleSum {

        public static void main(String[] args) {

            Scanner console = new Scanner(System.in);

            String[] n = console.nextLine ().split ( " " );

            int[] numbers = new int[n.length];


            boolean isFound = false;

            for (int i = 0; i < n.length; i++) {
                numbers[i] = Integer.parseInt ( n[i] );

            }
            for (int i = 0; i <numbers.length -1 ; i++) {
                for (int j = i+1; j < numbers.length; j++) {
                    for (int k = 0; k <  numbers.length; k++) {

                        if (numbers[i] + numbers[j] == numbers[k]){
                            System.out.println (numbers[i] + " + " + numbers[j] + " == " + numbers[k]);
                            isFound = true;
                            break;
                        }

                    }

                }

            }
            if (!isFound){
                System.out.println ("No");
            }




        }


    }

