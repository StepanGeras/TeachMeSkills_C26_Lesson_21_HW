package by.tms.lesson21.calculator.service;

import by.tms.lesson21.calculator.model.Operation;

public class OperationService {

	public Operation calculate(Operation operation) {

		double result;

		switch (operation.getOperation()) {
			case "sum":
				result = operation.getNum1() + operation.getNum2();
				operation.setResult(result);
				return operation;
			case "sub":
				result = operation.getNum1() - operation.getNum2();
				operation.setResult(result);
				return operation;
			case "mul":
				result = operation.getNum1() * operation.getNum2();
				operation.setResult(result);
				return operation;
			case "div":
				result = operation.getNum1() / operation.getNum2();
				operation.setResult(result);
				return operation;
			default:
				throw new IllegalArgumentException();
		}

	}
}
