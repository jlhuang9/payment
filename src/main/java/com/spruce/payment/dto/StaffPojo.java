package com.spruce.payment.dto;

import javax.persistence.*;
import java.util.Date;

/**
 * StaffPojo实体
 * table staff
 * comment 员工表
 * Created by hcq on 2018/12/11.
 */
@Entity
@Table(name = "staff")
public class StaffPojo extends BaseEntry {
    
    /**
     *主键
    */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    /**
     *nc人员编号
    */
    @Column
    private Long ncId;
    
    /**
     *姓名
    */
    @Column
    private String name;
    
    /**
     *身份证号
    */
    @Column
    private String identityCard;
    
    /**
     *工作地
    */
    @Column
    private String city;
    
    /**
     *工作地址
    */
    @Column
    private String addr;
    
    /**
     *编制所在地
    */
    @Column
    private String compilationAddr;
    
    /**
     *一级部门id
    */
    @Column
    private Long firestGroupId;
    
    /**
     *二级部门id
    */
    @Column
    private Long secondtGroupId;
    
    /**
     *三级部门id
    */
    @Column
    private Long thirdGroupId;
    
    /**
     *司机部门id
    */
    @Column
    private Long fourthGroupId;
    
    /**
     *岗位
    */
    @Column
    private String job;
    
    /**
     *职级
    */
    @Column
    private String rank;
    
    /**
     *最后入职日期
    */
    @Column
    private Date entryDate;
    
    /**
     *是否适用 0-否，1-是
    */
    @Column
    private Integer isProbation;
    
    /**
     *转正日期
    */
    @Column
    private Date positiveDate;
    
    /**
     *离职日期
    */
    @Column
    private Date termDate;
    
    /**
     *生产性 0-否，1-是
    */
    @Column
    private Integer isProduction;
    
    /**
     *自由外包 0-自有，1-外包
    */
    @Column
    private Integer isLocal;
    
    /**
     *派遣公司
    */
    @Column
    private String dispatchCompany;
    
    
    public void setId (Long id){
        this.id = id;
    }

    public Long getId (){
        return id;
    }
    
    public void setNcId (Long ncId){
        this.ncId = ncId;
    }

    public Long getNcId (){
        return ncId;
    }
    
    public void setName (String name){
        this.name = name;
    }

    public String getName (){
        return name;
    }
    
    public void setIdentityCard (String identityCard){
        this.identityCard = identityCard;
    }

    public String getIdentityCard (){
        return identityCard;
    }
    
    public void setCity (String city){
        this.city = city;
    }

    public String getCity (){
        return city;
    }
    
    public void setAddr (String addr){
        this.addr = addr;
    }

    public String getAddr (){
        return addr;
    }
    
    public void setCompilationAddr (String compilationAddr){
        this.compilationAddr = compilationAddr;
    }

    public String getCompilationAddr (){
        return compilationAddr;
    }
    
    public void setFirestGroupId (Long firestGroupId){
        this.firestGroupId = firestGroupId;
    }

    public Long getFirestGroupId (){
        return firestGroupId;
    }
    
    public void setSecondtGroupId (Long secondtGroupId){
        this.secondtGroupId = secondtGroupId;
    }

    public Long getSecondtGroupId (){
        return secondtGroupId;
    }
    
    public void setThirdGroupId (Long thirdGroupId){
        this.thirdGroupId = thirdGroupId;
    }

    public Long getThirdGroupId (){
        return thirdGroupId;
    }
    
    public void setFourthGroupId (Long fourthGroupId){
        this.fourthGroupId = fourthGroupId;
    }

    public Long getFourthGroupId (){
        return fourthGroupId;
    }
    
    public void setJob (String job){
        this.job = job;
    }

    public String getJob (){
        return job;
    }
    
    public void setRank (String rank){
        this.rank = rank;
    }

    public String getRank (){
        return rank;
    }
    
    public void setEntryDate (Date entryDate){
        this.entryDate = entryDate;
    }

    public Date getEntryDate (){
        return entryDate;
    }
    
    public void setIsProbation (Integer isProbation){
        this.isProbation = isProbation;
    }

    public Integer getIsProbation (){
        return isProbation;
    }
    
    public void setPositiveDate (Date positiveDate){
        this.positiveDate = positiveDate;
    }

    public Date getPositiveDate (){
        return positiveDate;
    }
    
    public void setTermDate (Date termDate){
        this.termDate = termDate;
    }

    public Date getTermDate (){
        return termDate;
    }
    
    public void setIsProduction (Integer isProduction){
        this.isProduction = isProduction;
    }

    public Integer getIsProduction (){
        return isProduction;
    }
    
    public void setIsLocal (Integer isLocal){
        this.isLocal = isLocal;
    }

    public Integer getIsLocal (){
        return isLocal;
    }
    
    public void setDispatchCompany (String dispatchCompany){
        this.dispatchCompany = dispatchCompany;
    }

    public String getDispatchCompany (){
        return dispatchCompany;
    }
    
}
