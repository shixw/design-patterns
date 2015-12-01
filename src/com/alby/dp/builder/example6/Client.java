package com.alby.dp.builder.example6;


public class Client {
    public static void main(String[] args) {
        InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("001",12346L,111111L);
        InsuranceContract contract = builder.setPersonName("战三").setCompanyName("asd").setOtherDate("test").build();
        contract.someOperation();
    }
}
