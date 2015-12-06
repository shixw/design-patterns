package com.alby.dp.command.example4;

public class Client {
    public static void main(String[] args) {
        OperationApi operation = new Operation();

        AddCommand addCommand = new AddCommand(operation,5);

        SubstractCommand substractCommand = new SubstractCommand(operation,3);

        Calculator calculator = new Calculator();
        calculator.setAddCmd(addCommand);
        calculator.setSubstractCmd(substractCommand);

        calculator.addPressed();

        System.out.println("一次加法运算后的结果：" + operation.getResult());

        calculator.substractPressed();
        System.out.println("一次减法运算后的结果："+operation.getResult());


        //测试撤销
        calculator.undoPressed();

        System.out.println("撤销一次后的结果"+operation.getResult());

        calculator.undoPressed();

        System.out.println("撤销一次后的结果"+operation.getResult());

        //测试恢复
        calculator.redoPressed();

        System.out.println("恢复一次后的结果"+operation.getResult());

        calculator.redoPressed();

        System.out.println("恢复一次后的结果"+operation.getResult());
    }
}
