package scriptUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

    static XSSFWorkbook wb;
    static XSSFSheet sh;
    static XSSFRow row;
    static XSSFCell Col;
    public static String readDataByIndexVal(int p, int q) throws IOException {
    FileInputStream FIS = null;
    try{
        //FIS = new FileInputStream(new File("D:\\Selenium\\TestProject\\src\\main\\resources\\TestData2.xlsx"));
        File f = new File("D:\\SeleniumFramework_Cucumber\\SeleniumTestProject-master-Orginal\\SeleniumTestProject-master\\src\\test\\resources\\TestData2.xlsx");

        //FIS = new FileInputStream(new File("D:\\SeleniumFramework_Cucumber\\SeleniumTestProject-master (2)\\SeleniumTestProject-master\\src\\test\\resourcesTestData2.xlsx"));
        System.out.println(f.getAbsolutePath());
        FIS = new FileInputStream(new File(f.getAbsolutePath()));
        System.out.println("File Found");

    }
    catch(Exception e){
        System.out.println("File Not Found");
        e.printStackTrace();
    }
     wb = new XSSFWorkbook(FIS);
    sh = wb.getSheetAt(0);

        int rownum = sh.getPhysicalNumberOfRows();
        System.out.println(rownum);
        int colNum = sh.getRow(0).getPhysicalNumberOfCells();
        System.out.println(colNum);
        String[][] Data = new String [rownum][colNum];
        for(int i=0; i<rownum; i++){
            row = sh.getRow(i);
            for(int j=0; j<colNum; j++){
                Col = row.getCell(j);
                String value = Col.getStringCellValue();
                Data[i][j] = value;
            }
        }
        String value=null;
//        for(int i=0;i<rownum;i++)
//        {
//            for(int j=0;j<colNum;j++)
//                 value =  Data[i][j];
//
//        }
     return Data[p][q];

}

    public static String getCellData(String colName){
        try{
            int colNum = -1;
            sh = wb.getSheetAt(0);
            //sh = wb.getSheet(sheetName);
            row = sh.getRow(0);
            for(int i =0; i<row.getLastCellNum(); i++){
                if(row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(colName)){
                    colNum =i;
                }

            }
            row = sh.getRow(1);
            Col = row.getCell(colNum);
            return Col.getStringCellValue();

        }catch(Exception e){
            e.printStackTrace();
        }
        return Col.getStringCellValue();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(readDataByIndexVal(2,2));
        System.out.println(getCellData("Tab1"));
    }
}
