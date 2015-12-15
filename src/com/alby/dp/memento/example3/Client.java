package com.alby.dp.memento.example3;

public class Client {
    public static void main(String[] args) {
//        FlowAMock mock = new FlowAMock("TestFlow");

        FlowAMockPrototype mock = new FlowAMockPrototype("TestFlow");
        //运行流程的第一个阶段
        mock.runPhaseOne();

        //创建一个管理者
//        FlowAMementoCaretaker caretaker = new FlowAMementoCaretaker();
        FlowAMementoFileCaretaker caretaker = new FlowAMementoFileCaretaker();
        //创建此时的对象的备忘录对象，并保存到管理者对象里面
        FlowAMockMemento mockMemento = mock.createMemento();
        caretaker.saveMemento(mockMemento);

        //运行方案一
        mock.schema1();

        //从管理者获取备忘录的对象，然后设置回去
        mock.setMemento(caretaker.retriveMemento());

        //运行方案二
        mock.schema2();
    }
}
