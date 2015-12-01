package com.alby.dp.builder.example4;

/**
 * Created by xianwei on 2015/12/1.
 * 够早保险合同对象的构建器
 */
public class ConcreteBuilder {
    private String contractId;
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String otherDate;

    public ConcreteBuilder(String contractId, long beginDate, long endDate) {
        this.contractId = contractId;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public ConcreteBuilder setPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    public ConcreteBuilder setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public ConcreteBuilder setOtherDate(String otherDate) {
        this.otherDate = otherDate;
        return this;
    }

    /**
     * 构建真正的对象并返回
     * @return  对象
     */
    public InsuranceContract build(){
        return new InsuranceContract(this);
    }
    public String getContractId() {
        return contractId;
    }

    public String getPersonName() {
        return personName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public long getBeginDate() {
        return beginDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public String getOtherDate() {
        return otherDate;
    }
}
