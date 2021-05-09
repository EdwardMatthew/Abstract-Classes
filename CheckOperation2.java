package com.company;

public class CheckOperation2 {
    // added the static method here to make this method immediately accessible from the driver class
    static String check(String operation) {
        if (operation.equals("addition")) {
            return "This operation is an addition";
        }
        else if (operation.equals("subtraction")) {
            return "This operation is a subtraction";
        }
        else {
            return "The operation failed";
        }
    }
}
