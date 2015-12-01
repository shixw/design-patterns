package com.alby.dp.builder.example5;


/**
 * Created by xianwei on 2015/12/1.
 * 保险合同对象
 */
public class InsuranceContract {
    private String contractId;
    /**
     * 被保险人员的名称，同一份合同，要么和人员签订，要么和公司签订
     * 也就是说，“被保险人员”和“被保险公司”这两个属性，不可能同时有值
     */
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String otherData;

    /**
     * 反问级别是同包可以访问
     */
    InsuranceContract(ConcreteBuilder builder){
        this.contractId = builder.getContractId();
        this.personName = builder.getPersonName();
        this.companyName = builder.getCompanyName();
        this.beginDate = builder.getBeginDate();
        this.endDate = builder.getEndDate();
        this.otherData = builder.getOtherDate();
    }

    public void someOperation(){
        System.out.println("now + "+this.contractId);
    }


}
