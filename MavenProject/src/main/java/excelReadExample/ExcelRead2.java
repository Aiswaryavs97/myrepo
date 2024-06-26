package excelReadExample;

import java.io.IOException;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String y= ExcelRead1.getStringData(1,0);
		System.out.println(y);
		String z=ExcelRead1.getIntegerData(1,1);
		System.out.println(z);

	}

}
