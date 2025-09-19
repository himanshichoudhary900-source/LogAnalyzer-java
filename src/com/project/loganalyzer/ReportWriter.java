package com.project.loganalyzer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReportWriter {

    public void writeReport(int infoCount, int warningCount, int errorCount) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("report.txt"))) {
            bw.write("Log Analysis Report\n");
            bw.write("-------------------\n");
            bw.write("INFO logs   : " + infoCount + " (saved in info.log)\n");
            bw.write("WARNING logs: " + warningCount + " (saved in warning.log)\n");
            bw.write("ERROR logs  : " + errorCount + " (saved in error.log)\n");

            System.out.println("Summary report written to report.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
