/*
 * Methods
 * User Input, working with Methods
 * Author: Dana Vlas
 * Last Change:  23.11.2022
 */


import java.util.Scanner;
import java.util.Locale;

public class Methods {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        // call the method.getNr for both of the numbers
        int nr1 = Methods.getNr();
        int nr2 = Methods.getNr();


//calling the methods in the main Method
        int min;
        min = getMin(nr1, nr2); //cal the method getMin with 2 parameters: nr1, nr2

        int max;
        max = getMax(nr1, nr2);

        int sum;
        sum = calcSum(nr1, nr2);


        int delta;
        delta = calcDelta(max, min);

        int sumAllNumbers;
        sumAllNumbers = calcAllNumbers(max, min);

        float avg;
        avg = calcMean(nr1, nr2);


        int gcd;
        gcd = calcGcd(nr1, nr2);

        int lcm;
        lcm = calcLcm(nr1, nr2);


        System.out.printf("min (%d,%d) = %d \n", nr1, nr2, min);
        System.out.printf("max (%d,%d) = %d \n", nr1, nr2, max);
        System.out.printf("sum (%d,%d) = %d \n", nr1, nr2, sum);
        System.out.printf("summFromTo (%d,%d) = %d \n", nr1, nr2, sumAllNumbers);
        System.out.printf("delta (%d,%d) = %d \n", nr1, nr2, delta);
        System.out.printf("main(%d,%d) = %.2f \n", nr1, nr2, avg);
        System.out.printf("gcd (%d,%d) = %d \n", nr1, nr2, gcd);
        System.out.printf("lcm (%d,%d) = %d \n",nr1, nr2, lcm);


    }

    public static void welcome() {
        System.out.print("Enter a positive number: ");
    }

    //this method getNr interacts with the user and takes the input from user and saves the input in a variable ->(integer)
    public static int getNr() {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            welcome();//print("Enter a positive number: ")
            while (!sc.hasNextInt()) {
                welcome();
                sc.next();
            }
            number = sc.nextInt();
        } while (number <= 0);
        return number;
    }

    //this method computes the minimum from 2 integers
    public static int getMin(int n1, int n2) {
        int min;
        if (n1 < n2)
            min = n1;
        else
            min = n2;
        return min;
    }

    //this method computes the maximum from 2 integers
    public static int getMax(int n1, int n2) {
        int max;
        if (n1 > n2)
            max = n1;
        else
            max = n2;

        return max;
    }

    //this method computes the sum from 2 integers
    public static int calcSum(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    //this method computes the sum of all numbers( integers) between maximum and minimum
    public static int calcAllNumbers(int max, int min) {
        int sumAllNumbers = 0;
        while (max >= min) {
            sumAllNumbers += max--;
        }
        return sumAllNumbers;

    }

    //this method computes the delta from 2 integers
    public static int calcDelta(int max, int min) {
        int delta = max - min;
        return delta;

    }

    //this method computes the gcd from 2 integers
    public static int calcGcd(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    //this method computes the mean from 2 integers
    public static float calcMean(int n1, int n2) {
        float sum = n1 + n2;
        float avg = sum / 2;

        return avg;


    }
//this method computes the lcm from 2 integers
    public static int calcLcm(int n1, int n2){
        if (n1==0 && n2==0){
            return 0;}

        int absN1 = Math.abs(n1);
        int absN2 = Math.abs(n2);
        int absHigherNumber = Math.max(n1,n2);
        int absLowerNumber = Math.min(n1,n2);
        int lcm = absHigherNumber;
        while (lcm % absLowerNumber !=0){
            lcm += absHigherNumber;
        }
        return lcm ;




    }
}


