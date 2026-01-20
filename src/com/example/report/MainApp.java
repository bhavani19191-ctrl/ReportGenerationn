package com.example.report;

public class MainApp {

    public static void main(String[] args) {

        ReportGenerator reportGenerator = new ReportGenerator();
        EmailService emailService = new EmailService();

        String report = reportGenerator.generateReport();
        emailService.sendEmail(report);
    }
}