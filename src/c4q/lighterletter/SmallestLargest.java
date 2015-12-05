package c4q.lighterletter;

import java.util.Scanner;

/**
 * Created by c4q-john on 12/5/15.
 */
public class SmallestLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program finds the largest and smallest numbers.");
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int lineNum = 0;
        int firstVal = 0;
        while (scanner.hasNextLine()) {

            String line = scanner.nextLine();
            lineNum++;
            int num = Integer.parseInt(line);
            int sentinel = 0;
            if (lineNum == 1){
            firstVal = num;
            }
            if (lineNum == 1 && num == sentinel) {
                System.out.println("No values have been entered.");
                break;
            } else if (lineNum == 2 && num == sentinel) {
                largest = firstVal;
                smallest = firstVal;
                System.out.println("largest: " + largest);
                System.out.println("smallest: " + smallest);
                break;
            } else if (num == sentinel) {
                System.out.println("largest: " + largest);
                System.out.println("smallest: " + smallest);
                break;
            } else if (num < smallest) {
                smallest = num;
            } else if (num > largest) {
                largest = num;
            }
        }
    }
}

