package com.pluralsight;

public class SalesContract extends Contract{
    private double salesTax;
    private double recordingFee;
    private double processingFee;
    private boolean isFinanced;

    public SalesContract(String contractDate, String customerName, String customerEmail, Vehicle vehicleSold,
                         double totalPrice, double monthlyPayment, double salesTax, boolean isFinanced) {
        super(contractDate, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        setProcessingFee(vehicleSold);
        setRecordingFee();
        setSalesTax();
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.isFinanced = isFinanced;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax() {
        this.salesTax = .05;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee() {
        this.recordingFee = 100;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(Vehicle vehicle) {
        if(vehicle.getPrice() < 10000) this.processingFee = 295;
        else {
            this.processingFee = 495;
        }
    }

    public boolean isFinanced() {
        return isFinanced;
    }

    public void setFinanced(boolean financed) {
        isFinanced = financed;
    }

    public double getLoanRate(boolean isFinanced){
        if (this.getVehicleSold().getPrice() >= 10000){
            return .0425; // 48 months
        }else {
            return .0525; //24 months
        }
    }

    @Override
    public double getTotalPrice() {
        double initialValue = this.getVehicleSold().getPrice();
        double totalPrice = initialValue +  getRecordingFee() + getProcessingFee();
        totalPrice += (totalPrice * getSalesTax());

        return totalPrice;


    }

    @Override
    public double getMonthlyPayment() {
        if(isFinanced()) {
            double loanAmount = getTotalPrice();
            double annualRate;
            int numberOfMonths;

            if (loanAmount >= 10_000) {
                annualRate = 4.25;
                numberOfMonths = 48;
            } else {
                annualRate = 5.25;
                numberOfMonths = 24;
            }

            double monthlyRate = (annualRate / 100) / 12;

            double monthlyPayment =
                    loanAmount *
                            (monthlyRate * Math.pow(1 + monthlyRate, numberOfMonths)) /
                            (Math.pow(1 + monthlyRate, numberOfMonths) - 1);

            System.out.printf("Monthly Payment: $%.2f", monthlyPayment);

            return monthlyPayment;
        }

        return 0;
    }
}

//A SalesContract will include the following additional information:
//        • Sales Tax Amount (5%)
//• Recording Fee ($100)
//• Processing fee ($295 for vehicles under $10,000 and $495 for all others

//        • Whether they want to finance (yes/no)
//• Monthly payment (if financed) based on:
//        • All loans are at 4.25% for 48 months if the price is $10,000 or more
//• Otherwise they are at 5.25% for 24 month

//4
//Methods will include a constructor and getters and setters for all fields except total
//price and monthly payment.
//You should provide overrides for getTotalPrice() and getMonthlyPayment() that will
//return computed values based on the rules above. It is possible that
//getMonthlyPayment() would return 0 if they chose the NO loan option.


//A Contract will hold information common to all contacts. It should be an abstract
//class as you can't create a generic contract.
//        • Date (as string) of contract
//• Customer name
//• Customer email
//• Vehicle sold
//• Total price
//• Monthly payment
//Methods will include a constructor and getters and setters for all fields except total
//price and monthly payment.
//You should define abstract methods for getTotalPrice() and
//getMonthlyPayment() that will return computed values based on contract type.






//A LeaseContract will include the following additional information:
//        • Expected Ending Value (50% of the original price)
//• Lease Fee (7% of the original price)
//• Monthly payment based on
//• All leases are financed at 4.0% for 36 months
//Methods will include a constructor and getters and setters for all fields except total
//price and monthly payment.
//You should provide overrides for getTotalPrice() and getMonthlyPayment()
//that will return computed values based on the rules above.