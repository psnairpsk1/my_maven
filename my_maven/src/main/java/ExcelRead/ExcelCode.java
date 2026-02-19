package ExcelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	
	public static FileInputStream f;//non-premitive data type
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	
	public static String readStringData(int i,int j) throws IOException//i for row and j for column
	{
		f = new FileInputStream("C:\\Users\\ASUS\\Desktop\\OnlyForJava\\ExcelFile\\ExcelRead.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("Sheet1");
		XSSFRow r = s.getRow(i);
		XSSFCell c = r.getCell(j);
		return c.getStringCellValue();
	}
	
	//For reading column data in excel
	public static double readIntegerData(int i, int j) throws IOException
	{
		f = new FileInputStream("C:\\Users\\ASUS\\Desktop\\OnlyForJava\\ExcelFile\\ExcelRead.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("Sheet1");
		XSSFRow r = s.getRow(i);
		XSSFCell c = r.getCell(j);
		return c.getNumericCellValue();//for returning integer value
	}
	
	

}
