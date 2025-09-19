package com.project.loganalyzer;

public class main {
    public static void main(String[] args) {
        LogAnalyzer analyzer = new LogAnalyzer();
        ReportWriter writer= new ReportWriter();
        analyzer.seperatingLog(); // separate logs
        writer.writeReport(analyzer.getInfoCount(), analyzer.getWarningCount(), analyzer.getErrorCount());

    }
}
