package by.tms.lesson21.calculator.console;

import by.tms.lesson21.calculator.model.Operation;
import by.tms.lesson21.calculator.service.OperationCircle;
import by.tms.lesson21.calculator.service.OperationService;

public class ConsoleApplication {

	private final OperationService operationService = new OperationService();
	private final ConsoleReader consoleReader = new ConsoleReader();
	private final ConsoleWriter consoleWriter = new ConsoleWriter();
	private final OperationCircle consoleCircle = new OperationCircle();

	public void run() {

		consoleWriter.write("Enter num 1");
		double num1 = consoleReader.readNum();
		consoleWriter.write("Enter num 2");
		double num2 = consoleReader.readNum();
		consoleWriter.write("Enter operation");
		String type = consoleReader.readOperationType();
		Operation operation = new Operation(num1, num2, type);
		Operation calculate = operationService.calculate(operation);
		consoleWriter.write("Result = " + calculate.getResult());
		consoleWriter.write("Would you like to continue? " + "(Yes or no)");
		Operation circle = consoleCircle.circle(operation, consoleReader.readBoolean());

		if (circle.isCircle()) {
			run();
		}

	}
}
