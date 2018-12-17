package com.spruce.payment.helper;

import org.apache.poi.ss.usermodel.Row;

public interface RowToBean<T> {
    T rowToBean(Row row);
}
