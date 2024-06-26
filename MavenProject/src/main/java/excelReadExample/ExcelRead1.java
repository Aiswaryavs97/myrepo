package excelReadExample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

static FileInputStream file;//excelfile ne open cheyan use cheyinnu if user gives the path to fileinputstream
static XSSFWorkbook workbook;// to make changes in work book
static XSSFSheet sheet;//to access the sheets in work book , to open and access
public static String getStringData(int a, int b) throws IOException
{
	file=new FileInputStream("C:\\Users\\USER\\Downloads\\ExcelRead.xlsx");
	workbook= new XSSFWorkbook(file);
	sheet=workbook.getSheet("Sheet1");//get sheet inbuilt method aan. to get the sheet
	
XSSFRow r=sheet.getRow(a);
XSSFCell c=r.getCell(b);
return c.getStringCellValue();
	}
public static String getIntegerData(int a, int b) throws IOException
{
	file=new FileInputStream("C:\\Users\\USER\\Downloads\\ExcelRead.xlsx");
	workbook= new XSSFWorkbook(file);
	sheet=workbook.getSheet("Sheet1");//get sheet inbuilt method aan. to get the sheet
	
XSSFRow r=sheet.getRow(a);
XSSFCell c=r.getCell(b);
//typecaseting - change the data type to one data type to another
int x=(int) c.getNumericCellValue();
// return the value of x

return String.valueOf(x);

}
}