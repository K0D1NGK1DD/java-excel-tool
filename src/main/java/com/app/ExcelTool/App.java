package com.app.ExcelTool;

public class App 
{
    public static void main( String[] args )
    {
        EditExcel excelService = new EditExcel();
        
        excelService.editFile();
        
        System.out.println("Main method execution terminated");
    }
}
