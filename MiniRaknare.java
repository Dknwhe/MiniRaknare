package se.ecutb.cai;

import java.util.Scanner;

public class MiniRaknare {

    public static void main(String[] args) {

        String yn;
        do
        {
            Scanner calc = new Scanner(System.in);
            System.out.println("Enter first number: ");
            double n1;
            n1 = calc.nextDouble();

            System.out.println("Enter second number: ");
            double n2;
            n2 = calc.nextDouble();

            System.out.println("Enter an operator (+, -, *, /): ");
            String operator = calc.next();


            switch (operator) {

                case "+":
                    System.out.println(add(n1,n2));
                    break;

                case "-":
                    System.out.println(sub(n1,n2));
                    break;

                case "*":
                    System.out.println(multi(n1,n2));
                    break;


                case "/":
                    System.out.println(div(n1,n2));
                    break;

                default:
                    System.out.println("is not supported\n");


                    return;

            } System.out.println("Again? y/n");
            yn= calc.next();

        } while(yn.equals("y") || yn.equals("Y"));


    }public static double add(double n1, double n2){

        double result;

        result = n1 + n2;

        return  result;

    }

    public static double sub(double n1, double n2){

        double result ;

        result = n1 - n2;

        return  result;

    }

    public static double multi(double n1, double n2){

        double result ;

        result = n1*n2;

        return  result;

    }

    public static double div(double n1, double n2) {

        double result;

        result = n1 / n2;

        return result;
    }
}
