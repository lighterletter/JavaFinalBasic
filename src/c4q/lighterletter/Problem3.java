package c4q.lighterletter;

import java.util.Scanner;

/**
 * Created by c4q-john on 12/5/15.
 *
 * The problem can be expressed as follows: Pick some positive integer and call it n.
 * If n is even, divide it by two. If n is odd, multiply it by three and add one.
 * Continue this process until n is equal to one.
 *
 *
 *
 */
public class Problem3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int stepCount=0;
        while(n != 1){
            System.out.print(n+" is ");
            if (n % 2 == 0){
                n = n/2;
                System.out.print("even, so i take half: " + n);
            } else{
                n = n*3+1;
                System.out.print("odd, so I make 3n+1: " +n);
            }
            System.out.println();
            stepCount++;
        }
        System.out.println("The process took " + stepCount + " steps to reach 1");
    }

}
