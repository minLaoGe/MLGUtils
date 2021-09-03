/*
package com.minfengyu.cn.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

*/
/**
 * @Author: Tom.Min
 * @Date: 2021/8/18 16:36
 * @Desc:
 *//*

public class TestJstack {
    public static void createBuysThread(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) ;
            }
        },"testBusyThread");
        thread.start();
    }
    public static void createLockThread(final Object lock){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock){
                    try {
                        lock.wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        },"testLockedThread");
        thread.start();
    }

    public static void main(String[] args) throws IOException {
        public static void main(String args[]) throws IOException
        {
//obtaining input bytes from a file
            FileInputStream fis=new FileInputStream(new File("C:\\demo\\student.xls"));
//creating workbook instance that refers to .xls file
            HSSFWorkbook wb=new HSSFWorkbook(fis);
//creating a Sheet object to retrieve the object
            HSSFSheet sheet=wb.getSheetAt(0);
//evaluating cell type
            FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();
            for(Row row: sheet)     //iteration over row using for each loop
            {
                for(Cell cell: row)    //iteration over cell using for each loop
                {
                    switch(formulaEvaluator.evaluateInCell(cell).getCellType())
                    {
                        case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type
//getting the value of the cell as a number
                            System.out.print(cell.getNumericCellValue()+ "\t\t");
                            break;
                        case Cell.CELL_TYPE_STRING:    //field that represents string cell type
//getting the value of the cell as a string
                            System.out.print(cell.getStringCellValue()+ "\t\t");
                            break;
                    }
                }
                System.out.println();
            }
        }
    }
}
*/
