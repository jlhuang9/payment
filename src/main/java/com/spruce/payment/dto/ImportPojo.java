package com.spruce.payment.dto;

/**
 * ImportPojo实体
 * table import
 * comment 导入参数
 * Created by hcq on 2018/12/11.
 */
public class ImportPojo extends BaseEntry {
    
    /**
     *主键
    */
    private Long id;
    
    /**
     *员工id
    */
    private Long staffId;
    
    /**
     *带薪假(天)
    */
    private Integer payLeave;
    
    /**
     *病假
    */
    private Integer sickLeave;
    
    /**
     *绩效分数
    */
    private Double score;
    
    /**
     *菜种子
    */
    private Double spruceRewards;
    
    /**
     *补发补扣
    */
    private Double payRetroactively;
    
    /**
     *绩效补扣
    */
    private Double performance;
    
    /**
     *计件工资
    */
    private Double countPay;
    
    /**
     *社保
    */
    private Double socialSecurity;
    
    /**
     *残保金
    */
    private Double disabilitySecurity;
    
    
    public void setId (Long id){
        this.id = id;
    }

    public Long getId (){
        return id;
    }
    
    public void setStaffId (Long staffId){
        this.staffId = staffId;
    }

    public Long getStaffId (){
        return staffId;
    }
    
    public void setPayLeave (Integer payLeave){
        this.payLeave = payLeave;
    }

    public Integer getPayLeave (){
        return payLeave;
    }
    
    public void setSickLeave (Integer sickLeave){
        this.sickLeave = sickLeave;
    }

    public Integer getSickLeave (){
        return sickLeave;
    }
    
    public void setScore (Double score){
        this.score = score;
    }

    public Double getScore (){
        return score;
    }
    
    public void setSpruceRewards (Double spruceRewards){
        this.spruceRewards = spruceRewards;
    }

    public Double getSpruceRewards (){
        return spruceRewards;
    }
    
    public void setPayRetroactively (Double payRetroactively){
        this.payRetroactively = payRetroactively;
    }

    public Double getPayRetroactively (){
        return payRetroactively;
    }
    
    public void setPerformance (Double performance){
        this.performance = performance;
    }

    public Double getPerformance (){
        return performance;
    }
    
    public void setCountPay (Double countPay){
        this.countPay = countPay;
    }

    public Double getCountPay (){
        return countPay;
    }
    
    public void setSocialSecurity (Double socialSecurity){
        this.socialSecurity = socialSecurity;
    }

    public Double getSocialSecurity (){
        return socialSecurity;
    }
    
    public void setDisabilitySecurity (Double disabilitySecurity){
        this.disabilitySecurity = disabilitySecurity;
    }

    public Double getDisabilitySecurity (){
        return disabilitySecurity;
    }
    
}
