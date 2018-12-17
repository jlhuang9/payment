package com.spruce.payment.dto;

import com.spruce.payment.BaseTest;
import com.spruce.payment.dao.StorageStandardDao;
import com.spruce.payment.helper.RowToBean;
import com.spruce.payment.utils.DoubleUtils;
import com.spruce.payment.utils.PioUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class StorageStandardPojoTest extends BaseTest {

    @Autowired
    private StorageStandardDao storageStandardDao;

    @Test
    public void name() throws IOException {
        String filePath = "C:\\Users\\liush\\Desktop\\发送测试\\标准.xlsx";
        XSSFWorkbook xssfWorkbook = PioUtils.getXSSFWorkbook(filePath);
        List<StorageStandardPojo> storageStandardPojos = PioUtils.parseDefalt(xssfWorkbook, 2, new RowToBean<StorageStandardPojo>() {
            @Override
            public StorageStandardPojo rowToBean(Row row) {
                StorageStandardPojo model = new StorageStandardPojo();
                String storageName = PioUtils.getStringValue(row, 4);
                String group = PioUtils.getStringValue(row, 1);
                double basicWage = DoubleUtils.getDoubleIfErrorZero((PioUtils.getStringValue(row, 6)));
                double postWage = DoubleUtils.getDoubleIfErrorZero((PioUtils.getStringValue(row, 7)));
                double performanceBonus = DoubleUtils.getDoubleIfErrorZero((PioUtils.getStringValue(row, 8)));
                double minimumWage = DoubleUtils.getDoubleIfErrorZero((PioUtils.getStringValue(row, 15)));
                double needHour = DoubleUtils.getDoubleIfErrorZero((PioUtils.getStringValue(row, 19)));
                double nightShift = DoubleUtils.getDoubleIfErrorZero((PioUtils.getStringValue(row, 21)));
                double fullAttendanceAward = DoubleUtils.getDoubleIfErrorZero((PioUtils.getStringValue(row, 20)));
                double outsourcingService = DoubleUtils.getDoubleIfErrorZero((PioUtils.getStringValue(row, 10)));
                double hourlyWage = DoubleUtils.getDoubleIfErrorZero((PioUtils.getStringValue(row, 9)));
                model.setStorage(storageName);
                model.setGoup(group);
                model.setBasicWage(basicWage);
                model.setPostWage(postWage);
                model.setPerformanceBonus(performanceBonus);
                model.setMinimumWage(minimumWage);
                model.setNeedHour(needHour);
                model.setNightShift(nightShift);
                model.setFullAttendanceAward(fullAttendanceAward);
                model.setOutsourcingService(outsourcingService);
                model.setHourlyWage(hourlyWage);
                return model;
            }
        });

        storageStandardDao.save(storageStandardPojos);

    }
}