package com.spruce.payment.utils;

import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;

import java.util.Map;

public class JexlUtils {

    public static void parse(Expression expr, MapContext ctxt) {
        expr.evaluate(ctxt);
    }

    public static MapContext getModelMap() {
        MapContext ctxt = new MapContext();
        ctxt.set("math", new BigDecimalUtils());
        return ctxt;
    }

    public static Expression getExpression(String exp) {
        JexlEngine jexl = new JexlEngine();
        return jexl.createExpression(exp);
    }
}
