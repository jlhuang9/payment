package com.spruce.payment.dto;

import java.util.Date;

/**
 * StaffHourPojo实体
 * table staff_hour
 * comment 员工工时统计
 * Created by hcq on 2018/12/11.
 */
public class StaffHourPojo extends BaseEntry {
    
    /**
     *主键
    */
    private Long id;
    
    /**
     *序号
    */
    private Long code;
    
    /**
     *员工id
    */
    private Long staffId;
    
    /**
     *计薪类型：0-小时，1-综合计时
    */
    private Integer payType;
    
    /**
     *岗位
    */
    private String post;
    
    /**
     *员工类型 0-自由，1-外包
    */
    private Integer type;
    
    /**
     *员工状态 0-转正，1-试用
    */
    private Integer state;
    
    /**
     *仓库
    */
    private String storage;
    
    /**
     *部门
    */
    private String department;
    
    /**
     *分组
    */
    private String group;
    
    /**
     *年月
    */
    private Date month;
    
    /**
     *创建人
    */
    private Double day1;
    
    /**
     *创建人
    */
    private Double day2;
    
    /**
     *创建人
    */
    private Double day31;
    
    /**
     *创建人
    */
    private Double day30;
    
    /**
     *创建人
    */
    private Double day29;
    
    /**
     *创建人
    */
    private Double day28;
    
    /**
     *创建人
    */
    private Double day27;
    
    /**
     *创建人
    */
    private Double day26;
    
    /**
     *创建人
    */
    private Double day25;
    
    /**
     *创建人
    */
    private Double day24;
    
    /**
     *创建人
    */
    private Double day23;
    
    /**
     *创建人
    */
    private Double day22;
    
    /**
     *创建人
    */
    private Double day21;
    
    /**
     *创建人
    */
    private Double day20;
    
    /**
     *创建人
    */
    private Double day19;
    
    /**
     *创建人
    */
    private Double day18;
    
    /**
     *创建人
    */
    private Double day17;
    
    /**
     *创建人
    */
    private Double day16;
    
    /**
     *创建人
    */
    private Double day15;
    
    /**
     *创建人
    */
    private Double day14;
    
    /**
     *创建人
    */
    private Double day13;
    
    /**
     *创建人
    */
    private Double day12;
    
    /**
     *创建人
    */
    private Double day11;
    
    /**
     *创建人
    */
    private Double day10;
    
    /**
     *创建人
    */
    private Double day9;
    
    /**
     *创建人
    */
    private Double day8;
    
    /**
     *创建人
    */
    private Double day7;
    
    /**
     *创建人
    */
    private Double day6;
    
    /**
     *创建人
    */
    private Double day5;
    
    /**
     *创建人
    */
    private Double day4;
    
    /**
     *创建人
    */
    private Double day3;
    
    /**
     *实际出勤天数
    */
    private Double realTimes;
    
    /**
     *夜班次数
    */
    private Double nightTimes;
    
    
    public void setId (Long id){
        this.id = id;
    }

    public Long getId (){
        return id;
    }
    
    public void setCode (Long code){
        this.code = code;
    }

    public Long getCode (){
        return code;
    }
    
    public void setStaffId (Long staffId){
        this.staffId = staffId;
    }

    public Long getStaffId (){
        return staffId;
    }
    
    public void setPayType (Integer payType){
        this.payType = payType;
    }

    public Integer getPayType (){
        return payType;
    }
    
    public void setPost (String post){
        this.post = post;
    }

    public String getPost (){
        return post;
    }
    
    public void setType (Integer type){
        this.type = type;
    }

    public Integer getType (){
        return type;
    }
    
    public void setState (Integer state){
        this.state = state;
    }

    public Integer getState (){
        return state;
    }
    
    public void setStorage (String storage){
        this.storage = storage;
    }

    public String getStorage (){
        return storage;
    }
    
    public void setDepartment (String department){
        this.department = department;
    }

    public String getDepartment (){
        return department;
    }
    
    public void setGroup (String group){
        this.group = group;
    }

    public String getGroup (){
        return group;
    }
    
    public void setMonth (Date month){
        this.month = month;
    }

    public Date getMonth (){
        return month;
    }
    
    public void setDay1 (Double day1){
        this.day1 = day1;
    }

    public Double getDay1 (){
        return day1;
    }
    
    public void setDay2 (Double day2){
        this.day2 = day2;
    }

    public Double getDay2 (){
        return day2;
    }
    
    public void setDay31 (Double day31){
        this.day31 = day31;
    }

    public Double getDay31 (){
        return day31;
    }
    
    public void setDay30 (Double day30){
        this.day30 = day30;
    }

    public Double getDay30 (){
        return day30;
    }
    
    public void setDay29 (Double day29){
        this.day29 = day29;
    }

    public Double getDay29 (){
        return day29;
    }
    
    public void setDay28 (Double day28){
        this.day28 = day28;
    }

    public Double getDay28 (){
        return day28;
    }
    
    public void setDay27 (Double day27){
        this.day27 = day27;
    }

    public Double getDay27 (){
        return day27;
    }
    
    public void setDay26 (Double day26){
        this.day26 = day26;
    }

    public Double getDay26 (){
        return day26;
    }
    
    public void setDay25 (Double day25){
        this.day25 = day25;
    }

    public Double getDay25 (){
        return day25;
    }
    
    public void setDay24 (Double day24){
        this.day24 = day24;
    }

    public Double getDay24 (){
        return day24;
    }
    
    public void setDay23 (Double day23){
        this.day23 = day23;
    }

    public Double getDay23 (){
        return day23;
    }
    
    public void setDay22 (Double day22){
        this.day22 = day22;
    }

    public Double getDay22 (){
        return day22;
    }
    
    public void setDay21 (Double day21){
        this.day21 = day21;
    }

    public Double getDay21 (){
        return day21;
    }
    
    public void setDay20 (Double day20){
        this.day20 = day20;
    }

    public Double getDay20 (){
        return day20;
    }
    
    public void setDay19 (Double day19){
        this.day19 = day19;
    }

    public Double getDay19 (){
        return day19;
    }
    
    public void setDay18 (Double day18){
        this.day18 = day18;
    }

    public Double getDay18 (){
        return day18;
    }
    
    public void setDay17 (Double day17){
        this.day17 = day17;
    }

    public Double getDay17 (){
        return day17;
    }
    
    public void setDay16 (Double day16){
        this.day16 = day16;
    }

    public Double getDay16 (){
        return day16;
    }
    
    public void setDay15 (Double day15){
        this.day15 = day15;
    }

    public Double getDay15 (){
        return day15;
    }
    
    public void setDay14 (Double day14){
        this.day14 = day14;
    }

    public Double getDay14 (){
        return day14;
    }
    
    public void setDay13 (Double day13){
        this.day13 = day13;
    }

    public Double getDay13 (){
        return day13;
    }
    
    public void setDay12 (Double day12){
        this.day12 = day12;
    }

    public Double getDay12 (){
        return day12;
    }
    
    public void setDay11 (Double day11){
        this.day11 = day11;
    }

    public Double getDay11 (){
        return day11;
    }
    
    public void setDay10 (Double day10){
        this.day10 = day10;
    }

    public Double getDay10 (){
        return day10;
    }
    
    public void setDay9 (Double day9){
        this.day9 = day9;
    }

    public Double getDay9 (){
        return day9;
    }
    
    public void setDay8 (Double day8){
        this.day8 = day8;
    }

    public Double getDay8 (){
        return day8;
    }
    
    public void setDay7 (Double day7){
        this.day7 = day7;
    }

    public Double getDay7 (){
        return day7;
    }
    
    public void setDay6 (Double day6){
        this.day6 = day6;
    }

    public Double getDay6 (){
        return day6;
    }
    
    public void setDay5 (Double day5){
        this.day5 = day5;
    }

    public Double getDay5 (){
        return day5;
    }
    
    public void setDay4 (Double day4){
        this.day4 = day4;
    }

    public Double getDay4 (){
        return day4;
    }
    
    public void setDay3 (Double day3){
        this.day3 = day3;
    }

    public Double getDay3 (){
        return day3;
    }
    
    public void setRealTimes (Double realTimes){
        this.realTimes = realTimes;
    }

    public Double getRealTimes (){
        return realTimes;
    }
    
    public void setNightTimes (Double nightTimes){
        this.nightTimes = nightTimes;
    }

    public Double getNightTimes (){
        return nightTimes;
    }
    
}
