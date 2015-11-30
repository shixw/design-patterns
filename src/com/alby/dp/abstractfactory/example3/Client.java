package com.alby.dp.abstractfactory.example3;

public class Client {
    public static void main(String[] args) {


        ComputerEngineer engineer = new ComputerEngineer();
//客户选择并创建需要使用的装机方案对象
        AbstractFactory schema = new Schema1();

        engineer.makeComputer(schema);
    }
}
