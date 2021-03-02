package com.example.exceltopdf;

import android.util.Log;

import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;

public class ExcelToPdfUtil {

    public static void convertToPdf(String excelFile, String pdfOutputPath)  {

        try {
            // Create Workbook to load Excel file
            Workbook workbook = new Workbook(excelFile);
            // Save the document in PDF format
            workbook.save(pdfOutputPath, SaveFormat.PDF);
        }catch (Exception e){
            Log.e("ConverPdfError", e.toString());
        }

    }
}
