package com.spruce.payment.dto;

import javax.persistence.*;

/**
 * StorageStandardPojo实体
 * table storage_standard
 * comment 仓库工资标准
 * Created by hcq on 2018/12/14.
 */
@Entity
@Table(name = "storage_standard")
public class StorageStandardPojo extends BaseEntry {
    
    /**
     *主键
    */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    /**
     *仓库
    */
    @Column
    private String storage;
    
    /**
     *组织
    */
    @Column
    private String goup;
    
    /**
     *综合计时基本工资
    */
    @Column
    private Double basicWage;
    
    /**
     *综合计时岗位工资
    */
    @Column
    private Double postWage;
    
    /**
     *综合计时绩效基数
    */
    @Column
    private Double performanceBonus;
    
    /**
     *最低工资
    */
    @Column
    private Double minimumWage;
    
    /**
     *应出勤工时
    */
    @Column
    private Double needHour;
    
    /**
     *夜班补助标准（默认标准）
    */
    @Column
    private Double nightShift;
    
    /**
     *全勤奖
    */
    @Column
    private Double fullAttendanceAward;
    
    /**
     *外包服务
    */
    @Column
    private Double outsourcingService;
    
    /**
     *小时工时薪
    */
    @Column
    private Double hourlyWage;
    
    /**
     *非外包服务费
    */
    @Column
    private Double otherService;
    
    
    public void setId (Long id){
        this.id = id;
    }

    public Long getId (){
        return id;
    }
    
    public void setStorage (String storage){
        this.storage = storage;
    }

    public String getStorage (){
        return storage;
    }
    
    public void setGoup (String goup){
        this.goup = goup;
    }

    public String getGoup (){
        return goup;
    }
    
    public void setBasicWage (Double basicWage){
        this.basicWage = basicWage;
    }

    public Double getBasicWage (){
        return basicWage;
    }
    
    public void setPostWage (Double postWage){
        this.postWage = postWage;
    }

    public Double getPostWage (){
        return postWage;
    }
    
    public void setPerformanceBonus (Double performanceBonus){
        this.performanceBonus = performanceBonus;
    }

    public Double getPerformanceBonus (){
        return performanceBonus;
    }
    
    public void setMinimumWage (Double minimumWage){
        this.minimumWage = minimumWage;
    }

    public Double getMinimumWage (){
        return minimumWage;
    }
    
    public void setNeedHour (Double needHour){
        this.needHour = needHour;
    }

    public Double getNeedHour (){
        return needHour;
    }
    
    public void setNightShift (Double nightShift){
        this.nightShift = nightShift;
    }

    public Double getNightShift (){
        return nightShift;
    }
    
    public void setFullAttendanceAward (Double fullAttendanceAward){
        this.fullAttendanceAward = fullAttendanceAward;
    }

    public Double getFullAttendanceAward (){
        return fullAttendanceAward;
    }
    
    public void setOutsourcingService (Double outsourcingService){
        this.outsourcingService = outsourcingService;
    }

    public Double getOutsourcingService (){
        return outsourcingService;
    }
    
    public void setHourlyWage (Double hourlyWage){
        this.hourlyWage = hourlyWage;
    }

    public Double getHourlyWage (){
        return hourlyWage;
    }
    
    public void setOtherService (Double otherService){
        this.otherService = otherService;
    }

    public Double getOtherService (){
        return otherService;
    }
    
}
