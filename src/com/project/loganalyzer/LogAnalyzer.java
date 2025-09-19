package com.project.loganalyzer;
import java.io.*;

public class LogAnalyzer {
    int infoCount = 0;
    int warningCount = 0;
    int errorCount = 0;
   public void seperatingLog()
   {

       try (
               BufferedReader br = new BufferedReader(new FileReader("Report.log"));
               FileWriter info = new FileWriter("info.log");
               FileWriter warning = new FileWriter("warning.log");
               FileWriter error = new FileWriter("error.log")
       ) {
           String line;
           while ((line = br.readLine()) != null) {
               if (line.contains("INFO")) {
                   info.write(line + "\n");
                   infoCount++;
               } else if (line.contains("WARNING")) {
                   warning.write(line + "\n");
                   warningCount++;
               } else if (line.contains("ERROR")) {
                   error.write(line + "\n");
                   errorCount++;
               }
           }
       } catch (IOException e) {
           e.printStackTrace();
       }

   }

    public int getInfoCount() {
        return infoCount;
    }

    public int getWarningCount() {
        return warningCount;
    }

    public int getErrorCount() {
        return errorCount;
    }




}
