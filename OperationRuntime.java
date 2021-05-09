package com.company;
import java.util.Scanner;

class OperationRuntime {
    // added the static keyword here so the method is immediately accessible from the driver class
    static int doOperation(Operation operation) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        operation.x = sc.nextInt();
        System.out.print("Enter the second number: ");
        operation.y = sc.nextInt();
        return operation.calculate();
    }
}
