package com.spruce.payment.dto;

/**
 * AccountingPojo实体
 * table accounting
 * comment 核算表
 * Created by hcq on 2018/12/11.
 */
public class AccountingPojo extends BaseEntry {

    /**
     *主键
     */
    private Long id;

    /**
     *员工id
     */
    private Long staffId;

    /**
     *实际工时
     */
    private Double realHour;

    /**
     *应出勤工时
     */
    private Double needHour;

    /**
     *夜班次数
     */
    private Double nightCount;

    /**
     *法定加班工时
     */
    private Double legalHolidayHour;

    /**
     *应发岗位工资
     */
    private Double realPostWage;

    /**
     *绩效工资
     */
    private Double performanceWage;

    /**
     *平时加班费
     */
    private Double overtimePay;

    /**
     *平时加班费补差
     */
    private Double overtimePayOther;

    /**
     *标准应发
     */
    private Double standardPay;

    /**
     *法定假日加班费
     */
    private Double legalHolidayPay;

    /**
     *夜班补贴
     */
    private Double nightPay;

    /**
     *司龄补贴
     */
    private Double yearPay;

    /**
     *全勤奖
     */
    private Double fullAttendancePay;

    /**
     *自有带薪假工资
     */
    private Double paidLeave;

    /**
     *转岗津贴
     */
    private Double jobTransfer;

    /**
     *组长津贴
     */
    private Double leaderAllowance;

    /**
     *冻库津贴
     */
    private Double iceStorage;

    /**
     *特殊工种津贴
     */
    private Double specialAllowance;

    /**
     *标品津贴
     */
    private Double standardAllowance;

    /**
     *其他津贴1
     */
    private Double otherAllowance1;

    /**
     *其他津贴2
     */
    private Double otherAllowance2;

    /**
     *其他津贴3
     */
    private Double otherAllowance3;

    /**
     *津贴标准合计
     */
    private Double totalAllowance;

    /**
     *应发津贴
     */
    private Double realAllowance;

    /**
     *菜种子激励
     */
    private Double spruceMotivate;

    /**
     *补发补扣
     */
    private Double payRetroactively;

    /**
     *绩效补扣
     */
    private Double performance;

    /**
     *计时工资
     */
    private Double timePay;

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

    /**
     *应付服务费
     */
    private Double realServicePay;

    /**
     *费用合计
     */
    private Double totalPay;


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

    public void setRealHour (Double realHour){
        this.realHour = realHour;
    }

    public Double getRealHour (){
        return realHour;
    }

    public void setNeedHour (Double needHour){
        this.needHour = needHour;
    }

    public Double getNeedHour (){
        return needHour;
    }

    public void setNightCount (Double nightCount){
        this.nightCount = nightCount;
    }

    public Double getNightCount (){
        return nightCount;
    }

    public Double getLegalHolidayHour() {
        return legalHolidayHour;
    }

    public void setLegalHolidayHour(Double legalHolidayHour) {
        this.legalHolidayHour = legalHolidayHour;
    }

    public void setRealPostWage (Double realPostWage){
        this.realPostWage = realPostWage;
    }

    public Double getRealPostWage (){
        return realPostWage;
    }

    public void setPerformanceWage (Double performanceWage){
        this.performanceWage = performanceWage;
    }

    public Double getPerformanceWage (){
        return performanceWage;
    }

    public void setOvertimePay (Double overtimePay){
        this.overtimePay = overtimePay;
    }

    public Double getOvertimePay (){
        return overtimePay;
    }

    public void setOvertimePayOther (Double overtimePayOther){
        this.overtimePayOther = overtimePayOther;
    }

    public Double getOvertimePayOther (){
        return overtimePayOther;
    }

    public void setStandardPay (Double standardPay){
        this.standardPay = standardPay;
    }

    public Double getStandardPay (){
        return standardPay;
    }

    public void setLegalHolidayPay (Double legalHolidayPay){
        this.legalHolidayPay = legalHolidayPay;
    }

    public Double getLegalHolidayPay (){
        return legalHolidayPay;
    }

    public void setNightPay (Double nightPay){
        this.nightPay = nightPay;
    }

    public Double getNightPay (){
        return nightPay;
    }

    public void setYearPay (Double yearPay){
        this.yearPay = yearPay;
    }

    public Double getYearPay (){
        return yearPay;
    }

    public void setFullAttendancePay (Double fullAttendancePay){
        this.fullAttendancePay = fullAttendancePay;
    }

    public Double getFullAttendancePay (){
        return fullAttendancePay;
    }

    public void setPaidLeave (Double paidLeave){
        this.paidLeave = paidLeave;
    }

    public Double getPaidLeave (){
        return paidLeave;
    }

    public void setJobTransfer (Double jobTransfer){
        this.jobTransfer = jobTransfer;
    }

    public Double getJobTransfer (){
        return jobTransfer;
    }

    public void setLeaderAllowance (Double leaderAllowance){
        this.leaderAllowance = leaderAllowance;
    }

    public Double getLeaderAllowance (){
        return leaderAllowance;
    }

    public void setIceStorage (Double iceStorage){
        this.iceStorage = iceStorage;
    }

    public Double getIceStorage (){
        return iceStorage;
    }

    public void setSpecialAllowance (Double specialAllowance){
        this.specialAllowance = specialAllowance;
    }

    public Double getSpecialAllowance (){
        return specialAllowance;
    }

    public void setStandardAllowance (Double standardAllowance){
        this.standardAllowance = standardAllowance;
    }

    public Double getStandardAllowance (){
        return standardAllowance;
    }

    public void setOtherAllowance1 (Double otherAllowance1){
        this.otherAllowance1 = otherAllowance1;
    }

    public Double getOtherAllowance1 (){
        return otherAllowance1;
    }

    public void setOtherAllowance2 (Double otherAllowance2){
        this.otherAllowance2 = otherAllowance2;
    }

    public Double getOtherAllowance2 (){
        return otherAllowance2;
    }

    public void setOtherAllowance3 (Double otherAllowance3){
        this.otherAllowance3 = otherAllowance3;
    }

    public Double getOtherAllowance3 (){
        return otherAllowance3;
    }

    public void setTotalAllowance (Double totalAllowance){
        this.totalAllowance = totalAllowance;
    }

    public Double getTotalAllowance (){
        return totalAllowance;
    }

    public void setRealAllowance (Double realAllowance){
        this.realAllowance = realAllowance;
    }

    public Double getRealAllowance (){
        return realAllowance;
    }

    public void setSpruceMotivate (Double spruceMotivate){
        this.spruceMotivate = spruceMotivate;
    }

    public Double getSpruceMotivate (){
        return spruceMotivate;
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

    public void setTimePay (Double timePay){
        this.timePay = timePay;
    }

    public Double getTimePay (){
        return timePay;
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

    public void setRealServicePay (Double realServicePay){
        this.realServicePay = realServicePay;
    }

    public Double getRealServicePay (){
        return realServicePay;
    }

    public void setTotalPay (Double totalPay){
        this.totalPay = totalPay;
    }

    public Double getTotalPay (){
        return totalPay;
    }

}
