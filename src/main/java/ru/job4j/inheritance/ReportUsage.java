package ru.job4j.inheritance;

public class ReportUsage {

    public static void main(String[] args) {
            HtmlReport report = new HtmlReport();
            JSONReport jreport = new JSONReport();
            String jtext = jreport.generate("Report's name", "Report's body");
            String text = report.generate("Report's name", "Report's body");
            System.out.println(jtext);
        }
}
