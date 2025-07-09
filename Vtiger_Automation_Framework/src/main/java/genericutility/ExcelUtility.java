package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Rashmipriya
 */

public class ExcelUtility {
	/**
	 * This method is used to read data from excel file in String format
	 * @param sheetName
	 * @param rowIndex
	 * @param coloumnIndex
	 * @return value in String
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringDataFromExcel(String sheetName,int rowIndex,int coloumnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScript1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(coloumnIndex).getStringCellValue();
	}
	
	/**
	 * This method is used to read  boolean data from excel file 
	 * @param sheetName
	 * @param rowIndex
	 * @param coloumnIndex
	 * @return value in Boolean
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public boolean getBooleanDataFromExcel(String sheetName,int rowIndex,int coloumnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScript1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(coloumnIndex).getBooleanCellValue();
	}
	
	/**
	 * This method is used to read number data from excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param coloumnIndex
	 * @return value in Double
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public double getNumberDataFromExcel(String sheetName,int rowIndex,int coloumnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScript1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(coloumnIndex).getNumericCellValue();
	}
	
	/**
	 * This method is used to read date and time data from excel file
	 * @param sheetName
	 * @param rowIndex
	 * @param coloumnIndex
	 * @return value in LocalDateTime
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public LocalDateTime getDateAndTimeDataFromExcel(String sheetName,int rowIndex,int coloumnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScript1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(coloumnIndex).getLocalDateTimeCellValue();
	}



}
