package com.cognizant.springconcept;

public class ImplementTwoClasses {
    PayFees payFees;

    public PayFees getPayFees() {
        return payFees;
    }

    public void setPayFees(PayFees payFees) {
        this.payFees = payFees;
    }
    public void printInfo()
    {
        payFees.welcomeMessage();
    }

    public static void main(String[] args) {
        ImplementTwoClasses itc=new ImplementTwoClasses();
        PayFees pf=new School();
        itc.setPayFees(pf);
        itc.printInfo();
    }
}
