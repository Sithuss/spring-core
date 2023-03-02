package com.demo.print;

import com.demo.ds.Report;

//@Component @Profile("file")
public class FileReportPrinter implements ReportPrinter{
    @Override
    public void print(Report report) {
        System.out.println("file report formatter print():: invoked");
    }
}
