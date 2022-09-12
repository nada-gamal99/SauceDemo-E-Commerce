package Utilities;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class Read_Excel_Sheet {
    public Object[][] read_sheet() throws IOException, InvalidFormatException {
        File my_file = new File(".//test_data//Employees.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(my_file);
        XSSFSheet my_sheet = wb.getSheet("sheet1");
        int num_of_rows = my_sheet.getPhysicalNumberOfRows();
        int num_of_columns = my_sheet.getRow(0).getLastCellNum();
        String[][] my_array = new String[num_of_rows - 1][num_of_columns];
        for (int i = 1; i < num_of_rows; i++) {
            for (int j = 0; j < num_of_columns; j++) {
                XSSFRow row = my_sheet.getRow(i);
                my_array[i - 1][j] = row.getCell(j).getStringCellValue();
            }
        }
        return my_array;
    }
}