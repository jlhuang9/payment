package com.spruce.payment.utils;

import com.alibaba.fastjson.JSONObject;
import com.spruce.payment.dto.StaffPojo;
import com.spruce.payment.helper.GroupHelper;
import com.spruce.payment.helper.RowToBean;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PioUtils {


    public static void main(String[] args) {
//        String fileName = "C:\\Users\\liush\\Desktop\\发送测试\\nc人员.xlsx";
//        try {
//            XSSFWorkbook xssfWorkbook = getXSSFWorkbook(fileName);
//            List<StaffPojo> staffPojos = parseNcStaff(xssfWorkbook);
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        }
    }

    public static XSSFWorkbook getXSSFWorkbook(String fileName) throws IOException {
        File file = new File(fileName);
        return getXSSFWorkbook(new FileInputStream(file));
    }

    public static XSSFWorkbook getXSSFWorkbook(InputStream inputStream) throws IOException {
        return new XSSFWorkbook(inputStream);
    }

    public static <T> List<T> parseDefalt(XSSFWorkbook wb, int startRow, RowToBean<T> rowToBean) {
        List<T> result = new ArrayList<>();
        XSSFSheet sheet = wb.getSheetAt(0);
        int columnNum = 0;
        if (sheet.getRow(0) != null) {
            columnNum = sheet.getRow(0).getLastCellNum()
                    - sheet.getRow(0).getFirstCellNum();
        }
        if (columnNum > 0) {
            int num = 0;
            for (Row cells : sheet) {
                if (num < startRow) {
                    num++;
                    continue;
                }
                T t = rowToBean.rowToBean(cells);
//                System.out.println(num + "    >>>>>>>    " + JSONObject.toJSONString(staffPojo));
                result.add(t);
                num++;
            }
        }
        return result;
    }

    public static List<StaffPojo> parseNcStaff(XSSFWorkbook wb, GroupHelper groupHelper) {
        List<StaffPojo> result = new ArrayList<>();
        XSSFSheet sheet = wb.getSheetAt(0);
        int columnNum = 0;
        if (sheet.getRow(0) != null) {
            columnNum = sheet.getRow(0).getLastCellNum()
                    - sheet.getRow(0).getFirstCellNum();
        }
        if (columnNum > 0) {
            int num = 0;
            for (Row cells : sheet) {
                if (num == 0) {
                    num++;
                    continue;
                }
                StaffPojo staffPojo = parseToStaff(cells, groupHelper);
//                System.out.println(num + "    >>>>>>>    " + JSONObject.toJSONString(staffPojo));
                result.add(staffPojo);
                num++;
            }
        }
        return result;
    }

    public static StaffPojo parseToStaff(Row row, GroupHelper groupHelper) {
        StaffPojo staffPojo = new StaffPojo();
        staffPojo.setNcId(Long.parseLong(getStringValue(row, 0)));
        staffPojo.setName(getStringValue(row, 1));
        staffPojo.setIdentityCard(getStringValue(row, 2));
        staffPojo.setCity(getStringValue(row, 3));
        staffPojo.setAddr(getStringValue(row, 4));
        staffPojo.setCompilationAddr(getStringValue(row, 5));

        String first = getStringValue(row, 7);
        String second = getStringValue(row, 8);
        String third = getStringValue(row, 9);
        String fourth = getStringValue(row, 10);
        staffPojo.setFirestGroupId(groupHelper.getFirestGroupId(first));
        staffPojo.setFirestGroupId(groupHelper.getSecondGroupId(second, first));
        staffPojo.setFirestGroupId(groupHelper.getThirdGroupId(third, second));
        staffPojo.setFirestGroupId(groupHelper.getFourthGroupId(fourth, third));

        staffPojo.setJob(getStringValue(row, 11));
        staffPojo.setRank(getStringValue(row, 12));
        staffPojo.setEntryDate(row.getCell(13).getDateCellValue());
        staffPojo.setIsProbation(getStringValue(row, 14).equals("是") ? 1 : 0);
        staffPojo.setPositiveDate(row.getCell(15).getDateCellValue());
        staffPojo.setTermDate(row.getCell(16).getDateCellValue());
        staffPojo.setIsProduction(getStringValue(row, 23).equals("是") ? 1 : 0);
        staffPojo.setIsLocal(getStringValue(row, 24).equals("自有") ? 0 : 1);
        staffPojo.setDispatchCompany(getStringValue(row, 25));
        return staffPojo;
    }

    public static String getStringValue(Row row, int index) {
        return getStringValue(row.getCell(index));
    }

    public static synchronized String getStringValue(Cell cell) {
        String result = "";
        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_BLANK:
//                if (cell == null || cell.equals("") || cell.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
//                } else {
//                    ;
//                }
                break;
            case Cell.CELL_TYPE_BOOLEAN:
                result = Boolean.toString(cell
                        .getBooleanCellValue());
                break;
            // 数值
            case Cell.CELL_TYPE_NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    SimpleDateFormat sdf = null;
                    if (cell.getCellStyle().getDataFormat() == HSSFDataFormat
                            .getBuiltinFormat("h:mm")) {
                        sdf = new SimpleDateFormat("HH:mm");
                    } else {// 日期
                        sdf = new SimpleDateFormat("yyyy/MM/dd");
                    }
                    Date date = cell.getDateCellValue();
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    String temp = cell.getStringCellValue();
                    // 判断是否包含小数点，如果不含小数点，则以字符串读取，如果含小数点，则转换为Double类型的字符串
                    if (temp.indexOf(".") > -1) {
                        result = String.valueOf(new Double(temp))
                                .trim();
                        ;
                    } else {
                        result = temp.trim();
                        ;
                    }
                }
                break;
            case Cell.CELL_TYPE_STRING:
                result = cell.getStringCellValue().trim();

                break;
            case Cell.CELL_TYPE_ERROR:
                result = "";

                break;
            case Cell.CELL_TYPE_FORMULA:
                cell.setCellType(Cell.CELL_TYPE_STRING);
                String temp = cell.getStringCellValue();
                // 判断是否包含小数点，如果不含小数点，则以字符串读取，如果含小数点，则转换为Double类型的字符串
                if (temp.indexOf(".") > -1) {
                    temp = String.valueOf(new Double(temp))
                            .trim();
                    Double cny = Double.parseDouble(temp);//6.2041
                    DecimalFormat df = new DecimalFormat("0.00");
                    String CNY = df.format(cny);
                    System.out.print(CNY);
                } else {
                    result = temp.trim();

                }
                break;
            default:
                result = "";
                break;
        }
        return result;
    }

}
