package c4q.lighterletter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values to compute the Pythagorean theorem");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + calculatePythagorean(a,b));
    }
    public static double calculatePythagorean(double a, double b){
        return  Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }
}
