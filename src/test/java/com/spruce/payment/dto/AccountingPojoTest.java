package com.spruce.payment.dto;

import com.alibaba.fastjson.JSONObject;
import com.spruce.payment.utils.JexlUtils;
import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.MapContext;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountingPojoTest {

    private AccountingPojo accounting;

    @Before
    public void setUp() throws Exception {
        accounting = new AccountingPojo();
        accounting.setId(1L);
        accounting.setRealHour(251.3);
        accounting.setNeedHour(167.0);
        accounting.setNightCount(24.0);
        accounting.setLegalHolidayHour(16.0);

    }

    @Test
    public void name() {

        String exp = "";
        MapContext modelMap = JexlUtils.getModelMap();
        modelMap.set("a", accounting);
        Expression expression = JexlUtils.getExpression(exp);
        JexlUtils.parse(expression, modelMap);
        System.out.println(JSONObject.toJSONString(accounting));
    }
}