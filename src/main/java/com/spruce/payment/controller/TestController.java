package com.spruce.payment.controller;

import com.spruce.payment.dao.StaffDao;
import com.spruce.payment.dto.StaffPojo;
import com.spruce.payment.helper.GroupHelper;
import com.spruce.payment.utils.PioUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private StaffDao staffDao;

    @Autowired
    private GroupHelper groupHelper;
    @GetMapping("test")
    public Map<String, Object> test() {
        HashMap<String, Object> m = new HashMap<>();
        m.put("123", "222");
        return m;
    }

    @GetMapping("test2")
    public Map<String, Object> test2() throws IOException {

        String fileName = "C:\\Users\\liush\\Desktop\\发送测试\\nc人员.xlsx";
        XSSFWorkbook xssfWorkbook = PioUtils.getXSSFWorkbook(fileName);
        List<StaffPojo> staffPojos = PioUtils.parseNcStaff(xssfWorkbook,groupHelper);
        List<StaffPojo> save = staffDao.save(staffPojos);
        HashMap<String, Object> m = new HashMap<>();
        m.put("123", "222");
        return m;
    }

}
