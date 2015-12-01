package com.alby.dp.builder.example5;

public class Client {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder("001",12346L,111111L);
        InsuranceContract contract = builder.setPersonName("战三").setCompanyName("asd").setOtherDate("test").build();
        contract.someOperation();
    }
}
