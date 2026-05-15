package com.pluralsight;

public class LeaseContract extends Contract {

    private double endingValue;
    private double leaseFee;

    public LeaseContract ( String contractDate,
                           String customerName,
                           String customerEmail,
                           String vehicleSold,
                           double totalPrice,
                           double monthlyPayment) {


        super(contractDate,
                customerName,
                customerEmail,
                vehicleSold,
                totalPrice,
                monthlyPayment
        );
        // 50% residual value
        this.endingValue = totalPrice * 0.50;

        // 7% lease fee
        this.leaseFee = totalPrice * 0.07;
    }
    @Override
    public double getTotalPrice() {
        return endingValue + leaseFee;
    }

    @Override
    public double getMonthlyPayment(){

        //36 month lease
    return getTotalPrice() / 36;
    }

    public double getEndingValue() {
        return endingValue;
    }
    public double getLeaseFee() {
        return leaseFee;
    }
}
