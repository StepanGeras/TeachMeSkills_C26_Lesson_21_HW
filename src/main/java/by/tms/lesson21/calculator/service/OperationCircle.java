package by.tms.lesson21.calculator.service;

import by.tms.lesson21.calculator.model.Operation;

public class OperationCircle {

    public Operation circle (Operation operation, String string) {

        switch (string) {
            case "yes":
                operation.setCircle(true);
                return operation;
            case "no":
                operation.setCircle(false);
                return operation;
        }

        throw new IllegalArgumentException();

    }

}
