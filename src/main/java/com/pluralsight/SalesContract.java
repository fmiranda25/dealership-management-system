package com.pluralsight;

public class SalesContract extends Contract{
    private double salesTax;
    private double recordingFee;
    private double processingFee;
    private boolean isFinanced;

    public SalesContract(String contractDate, String customerName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment, double salesTax, double recordingFee, double processingFee, boolean isFinanced) {
        super(contractDate, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.isFinanced = isFinanced;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinanced() {
        return isFinanced;
    }

    public void setFinanced(boolean financed) {
        isFinanced = financed;
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        if (//vehicle price )



        return
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}
