package com.company;

public class Driver {
    public static void main(String[] args) {
        AdditionOperation add = new AdditionOperation();
        SubtractionOperation subtract = new SubtractionOperation();

        System.out.print(OperationRuntime.doOperation(add));
        System.out.println(CheckOperation.check(add));

        System.out.print(OperationRuntime.doOperation(subtract));
        System.out.println(CheckOperation.check(subtract));

        System.out.println(OperationRuntime2.doOperation("addition"));
        System.out.println(CheckOperation2.check("addition"));
        System.out.println(OperationRuntime2.doOperation("subtraction"));
        System.out.println(CheckOperation2.check("subtraction"));
    }
}
