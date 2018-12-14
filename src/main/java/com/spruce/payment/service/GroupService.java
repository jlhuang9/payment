package com.spruce.payment.service;

import com.spruce.payment.dao.GroupDao;
import com.spruce.payment.dto.GroupPojo;
import com.spruce.payment.helper.GroupHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GroupService implements GroupHelper {

    @Autowired
    private GroupDao groupDao;

    private Map<String, Long> cache = new HashMap<>();

    @Override
    public Long getFirestGroupId(String name) {
        Long result;
        GroupPojo groupPojo = groupDao.getByNameAndLevel(name, 1);
        if (groupPojo == null) {
            GroupPojo groupPojo1 = new GroupPojo();
            groupPojo1.setName(name);
            groupPojo1.setPid(0L);
            groupPojo1.setLevel(1);
            GroupPojo save = groupDao.save(groupPojo1);
            result = save.getId();
            cache.put(name, result);
        } else {
            result = groupPojo.getId();
        }
        return result;
    }

    @Override
    public Long getSecondGroupId(String name, String pName) {

        return getConcurrentGroupId(name,pName,2);
    }

    @Override
    public Long getThirdGroupId(String name, String pName) {
        return getConcurrentGroupId(name,pName,3);
    }

    @Override
    public Long getFourthGroupId(String name, String pName) {
        return getConcurrentGroupId(name,pName,4);
    }

    public Long getConcurrentGroupId(String name, String pName, int level) {
        Long result;
        GroupPojo groupPojo = groupDao.getByNameAndLevel(name, level);
        if (groupPojo == null) {
            GroupPojo groupPojo1 = new GroupPojo();
            groupPojo1.setLevel(level);
            groupPojo1.setPid(cache.get(pName));
            groupPojo1.setName(name);
            GroupPojo save = groupDao.save(groupPojo1);
            result = save.getId();
            cache.put(name, result);
        } else {
            result = groupPojo.getId();
        }
        return result;
    }
}
