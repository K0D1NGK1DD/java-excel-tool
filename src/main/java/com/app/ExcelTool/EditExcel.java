package com.app.ExcelTool;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EditExcel {
	
	public void editFile() {
		
		System.out.println("Inside editFile method");
		
		String excelFilePath = "C:\\Users\\trand\\OneDrive\\Desktop\\editexcel.xlsx";
		
		try {
			
			FileInputStream fileInputStream = new FileInputStream(excelFilePath);
			
			Workbook workbook = WorkbookFactory.create(fileInputStream);
			Sheet sheet = workbook.getSheetAt(0);
			
			int lastRowCount = sheet.getLastRowNum();
			System.out.println("lastRowCount.. " + lastRowCount);
			
			List<Card> cardList = getCardList();
			for (int i = 0; i < cardList.size(); i++) {
				
				Row dataRow = sheet.createRow(++lastRowCount);
				dataRow.createCell(0).setCellValue(cardList.get(i).getCardType());
				dataRow.createCell(1).setCellValue(cardList.get(i).getCardFront());
				dataRow.createCell(2).setCellValue(cardList.get(i).getCardBack());
				dataRow.createCell(3).setCellValue(cardList.get(i).getCardExtra());
				dataRow.createCell(4).setCellValue(cardList.get(i).getCardCloze());
				
			}
			
			System.out.println("lastRowCount after Excel spreadsheet modification " + lastRowCount);
			fileInputStream.close();
			
			FileOutputStream fileOutputStream = new FileOutputStream(excelFilePath);
			workbook.write(fileOutputStream);
			fileOutputStream.close();
			System.out.println("Excel spreadsheet updated successfully");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Card> getCardList(){
		
		List<Card> cardList = new ArrayList<Card>();
		
		cardList.add(new Card("B1", "Front1", "Back1", "Extra1", "Cloze1"));
		cardList.add(new Card("B2", "Front2", "Back2", "Extra2", "Cloze2"));
		cardList.add(new Card("B3", "Front3", "Back3", "Extra3", "Cloze3"));
		cardList.add(new Card("B4", "Front4", "Back4", "Extra4", "Cloze4"));
		cardList.add(new Card("B5", "Front5", "Back5", "Extra5", "Cloze5"));
		return cardList;
	}
}
