package com.company;

public class CheckOperation {
    // added the static keyword here to make this method immediately accessible from the driver class
    static String check(Operation operation) {
        if (operation instanceof AdditionOperation) {
            System.out.println();
            return "The operation type is addition";
        }
        else if (operation instanceof SubtractionOperation) {
            System.out.println();
            return "The operation type is subtraction";
        }
        else {
            return "The operation is neither addition nor subtraction";
        }
    }
}
