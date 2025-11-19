package com.calci;



import java.util.Scanner;

public class CalciDriver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calci cal = new CalciImplementation();

        System.out.println("----- Simple Calculator -----");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("Enter your choice:");

        int choice = sc.nextInt();

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        int result = 0;

        switch (choice) {
            case 1:
                
                break;

            case 2:
               
                break;

            case 3:
                
                break;

            case 4:
               
                break;

            default:
               

        System.out.println("Result = " + result);
    }
}
}

