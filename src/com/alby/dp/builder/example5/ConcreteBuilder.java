package com.alby.dp.builder.example5;

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
        if(contractId ==null || contractId.trim().length() == 0){
            throw new IllegalArgumentException("合同编号不能为空");
        }
        boolean signPerson = personName!=null && personName.trim().length()>0;
        boolean signCompant = companyName!=null && companyName.trim().length()>0;
        if (signPerson && signCompant){
            throw new IllegalArgumentException("一份保险合同不能同时与人和公司签订");
        }
        if (!signPerson && !signCompant){
            throw new IllegalArgumentException("一份保险合同不能没有签订对象");
        }
        if(endDate<=0){
            throw new IllegalArgumentException("合同必须有保险失效日期");
        }
        if(beginDate<=0){
            throw new IllegalArgumentException("合同必须有保险生效日期");
        }
        if(endDate<=beginDate){
            throw new IllegalArgumentException("保险失效日期必须大于保险生效日期");
        }
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
