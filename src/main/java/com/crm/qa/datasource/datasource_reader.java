package com.crm.qa.datasource;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.Baseclass;

import jxl.Cell;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;


public class datasource_reader extends Baseclass{
 String[][] data;

 public datasource_reader() throws IOException {
  super();
  PageFactory.initElements(driver, this);
  // TODO Auto-generated constructor stub
 }
 
 @DataProvider(name="datasource")
 public Object exceldata() throws JXLException, IOException {
  File f = new File("./src\\main\\java\\com\\crm\\qa\\datasource\\FREECRMDATA.xls");
  Workbook wb = Workbook.getWorkbook(f);
  Sheet sh = wb.getSheet("ct_newcontact");
  int row =sh.getRows();
  int column =sh.getColumns();
   data=new String[4][4];
  for (int i=1;i<row;i++) {
   for(int j=0;j<column;j++) {
   data[i-1][j]=sh.getCell(j,i).getContents();
     
   }
  
   }
  return data;
  
 }
  }