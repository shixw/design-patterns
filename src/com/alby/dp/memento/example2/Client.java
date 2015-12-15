package com.alby.dp.memento.example2;

public class Client {

    public static void main(String[] args) {
        FlowAMock mock = new FlowAMock("TestFlow");

        mock.runPhaseOne();

        int tempResult = mock.getTempResult();
        String tempState = mock.getTempState();

        mock.schema1();

        mock.setTempResult(tempResult);
        mock.setTempState(tempState);

        mock.schema2();
    }
}
