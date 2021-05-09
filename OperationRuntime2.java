package com.company;
import java.util.Scanner;

public class OperationRuntime2 {
    static int doOperation(String operate) {
        Scanner sc = new Scanner(System.in);
        AdditionOperation plus = new AdditionOperation();
        SubtractionOperation minus = new SubtractionOperation();

        if (operate.equals("addition")) {
            System.out.print("Enter the first number: ");
            plus.x = sc.nextInt();
            System.out.print("Enter the second number: ");
            plus.y = sc.nextInt();
            return plus.calculate();
        }
        else if (operate.equals("subtraction")) {
            System.out.print("Enter the first number: ");
            minus.x = sc.nextInt();
            System.out.print("Enter the second number: ");
            minus.y = sc.nextInt();
            return minus.calculate();
        }
        else {
            System.out.println("The operation failed");
            return 0;
        }
    }
}
