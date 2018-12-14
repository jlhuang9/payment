package com.spruce.payment.dto;

import javax.persistence.*;

/**
 * GroupPojo实体
 * table group
 * comment 
 * Created by hcq on 2018/12/11.
 */

@Entity
@Table(name = "group")
public class GroupPojo extends BaseEntry {
    
    /**
     *主键
    */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    /**
     *部门名称
    */
    @Column
    private String name;
    
    /**
     *父级id
    */
    @Column
    private Long pid;
    
    /**
     *部门等级
    */
    @Column
    private Integer level;
    
    
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
    
    public void setPid (Long pid){
        this.pid = pid;
    }

    public Long getPid (){
        return pid;
    }
    
    public void setLevel (Integer level){
        this.level = level;
    }

    public Integer getLevel (){
        return level;
    }
    
}
