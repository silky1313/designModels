package io.silky;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CommandHistory history = new CommandHistory();

        //发送者对接收者的操作通过命令来实现
        Command addCommand1 = new AddCommand(calculator, 5);
        history.executeCommand(addCommand1);

        Command addCommand2 = new AddCommand(calculator, 3);
        history.executeCommand(addCommand2);

        System.out.println("Result: " + calculator.getResult()); // Result: 8

        // 撤销操作
        history.undo();
        System.out.println("Result after undo: " + calculator.getResult()); // Result after undo: 5

        // 重做操作
        history.redo();
        System.out.println("Result after redo: " + calculator.getResult()); // Result after redo: 8
    }
}