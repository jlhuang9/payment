package com.spruce.payment.dto;

import com.spruce.payment.utils.PioUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class StorageStandardPojoTest {



    @Test
    public void name() throws IOException {
        String filePath = "C:\\Users\\liush\\Desktop\\发送测试\\标准.xlsx";
        XSSFWorkbook xssfWorkbook = PioUtils.getXSSFWorkbook(filePath);
    }
}