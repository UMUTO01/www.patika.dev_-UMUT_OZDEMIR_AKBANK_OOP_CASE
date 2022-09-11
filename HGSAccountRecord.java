package com.company;

public class HGSAccountRecord  {

    public double TotalAmountGainedA = 0;

    public double TotalAmountGainedB = 0;

    public double TotalAmountGainedMB = 0;

    public double TotalAn =0;

    public void setTotalAmountGainedA(double totalAmountGainedA) {
        TotalAmountGainedA = totalAmountGainedA;
    }

    public void setTotalAmountGainedB(double totalAmountGainedB) {
        TotalAmountGainedB = totalAmountGainedB;
    }

    public void setTotalAmountGainedMB(double totalAmountGainedMB) {
        TotalAmountGainedMB = totalAmountGainedMB;
    }

    public void setTotalAn(double totalAn) {
        TotalAn = totalAn;
    }
    public void Total(){
        TotalAn+=TotalAmountGainedA+TotalAmountGainedMB+TotalAmountGainedB;
        System.out.println(TotalAn);
    }





    public  void ReturnTotalAmount(){
        HGSAccountRecord NEWRECORD = new HGSAccountRecord();

         NEWRECORD.TotalAn = NEWRECORD.TotalAmountGainedB +NEWRECORD.TotalAmountGainedA +NEWRECORD.TotalAmountGainedMB;
         System.out.println(NEWRECORD.TotalAn);
    }

}
