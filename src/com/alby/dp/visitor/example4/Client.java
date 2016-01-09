package com.alby.dp.visitor.example4;

public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        Customer cm1 = new EnterpriseCustomer();
        cm1.setName("ABC集团");
        os.addElement(cm1);

        Customer cm2 = new EnterpriseCustomer();
        cm2.setName("CDE集团");
        os.addElement(cm2);

        Customer cm3 = new PersonalCustomer();
        cm3.setName("张三");
        os.addElement(cm3);


        ServiceRequestVisitor srv = new ServiceRequestVisitor();

        os.handleRequest(srv);

        PredilectionAnalyzeVisitor pav = new PredilectionAnalyzeVisitor();

        os.handleRequest(pav);

        WorthAnalyzeVisitor wav = new WorthAnalyzeVisitor();

        os.handleRequest(wav);

    }
}
