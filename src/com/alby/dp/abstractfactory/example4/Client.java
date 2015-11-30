package com.alby.dp.abstractfactory.example4;

public class Client {
    public static void main(String[] args) {


        ComputerEngineer engineer = new ComputerEngineer();
//客户选择并创建需要使用的装机方案对象
        AbstractFactory schema = new Schema2();

        engineer.makeComputer(schema);
//////////////////////////////////////////////////////////
        AbstractFactory schema3 = new Schema3();

        engineer.makeComputer(schema3);
    }
}
