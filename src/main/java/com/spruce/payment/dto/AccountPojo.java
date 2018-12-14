package com.spruce.payment.dto;

import java.util.Date;

/**
 * AccountPojo实体
 * table account
 * comment 用户表
 * Created by hcq on 2018/12/11.
 */
public class AccountPojo extends BaseEntry {
    
    /**
     *主键
    */
    private Long id;
    
    /**
     *用户名
    */
    private String name;
    
    /**
     *密码
    */
    private String pass;
    
    /**
     *用户类型；0-系统管理员，1-总部薪酬，2仓库HRBP
    */
    private Integer type;
    
    /**
     *昵称
    */
    private String nick;
    
    /**
     *创建时间
    */
    private Date cTime;
    
    /**
     *创建人
    */
    private String cName;
    
    
    public void setId (Long id){
        this.id = id;
    }

    public Long getId (){
        return id;
    }
    
    public void setName (String name){
        this.name = name;
    }

    public String getName (){
        return name;
    }
    
    public void setPass (String pass){
        this.pass = pass;
    }

    public String getPass (){
        return pass;
    }
    
    public void setType (Integer type){
        this.type = type;
    }

    public Integer getType (){
        return type;
    }
    
    public void setNick (String nick){
        this.nick = nick;
    }

    public String getNick (){
        return nick;
    }
    
    public void setCTime (Date cTime){
        this.cTime = cTime;
    }

    public Date getCTime (){
        return cTime;
    }
    
    public void setCName (String cName){
        this.cName = cName;
    }

    public String getCName (){
        return cName;
    }
    
}
