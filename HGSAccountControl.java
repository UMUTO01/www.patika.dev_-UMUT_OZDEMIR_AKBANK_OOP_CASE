package com.company;

public class HGSAccountControl{
    public Bus Bus;
    public AUTO Auto;
    public Minibus Minibus;
    public HGSAccountRecord Art;
    public double TotalAmount=0;

    Bus HGSBus = new Bus();
    AUTO HGSAuto = new AUTO();
    Minibus HGSMinibus = new Minibus();
    HGSAccountRecord HGSACCOUNT23 = new HGSAccountRecord();



    public String[] AmountOfCarsThatPassed = new String[(HGSAuto.NameofArray.length + HGSBus.NameofArrayB.length + HGSMinibus.NameofArrayMB.length)];



    public  void SetPrice(){
        HGSACCOUNT23.Total();
    }

    public void LeftAccount(int NumberOfLeftAccount){
        int noun = 0;
        int ba = 0;
        int dcv = 0;
        if(NumberOfLeftAccount==2){
            double NewTotal = HGSAuto.TotalAccoutOfArray(HGSAuto.NewInteger-1) - this.HGSAuto.PassingP;
            System.out.println("Kalan Bakiye = "+NewTotal);
            noun +=1;





        }

        if(NumberOfLeftAccount==1){
            double NewTotal = HGSBus.TotalAccoutOfArrayB(HGSBus.NewIntegerB-1) - this.HGSBus.PassingPB;
            System.out.println("Kalan Bakiye = "+NewTotal);
            ba += 1;


        }

        if(NumberOfLeftAccount==3){
            double NewTotal = HGSAuto.TotalAccoutOfArray(HGSAuto.NewInteger-1) - this.HGSAuto.PassingP;
            System.out.println("Kalan Bakiye = "+NewTotal);
            dcv += 1;


        }

        HGSACCOUNT23.setTotalAmountGainedA(noun*7.50);
        HGSACCOUNT23.setTotalAmountGainedB(ba*20.75);

        HGSACCOUNT23.setTotalAmountGainedMB(dcv*15.75);

    }

    public void AmountOfCarsThatPassedReturner(){

        for(int i = 0 ; i <= (HGSAuto.NewIntegerW - 1); i++){
            this.AmountOfCarsThatPassed[i] = HGSAuto.NameofArray[i] + "  Adına Kayıtlı ,  " + HGSAuto.PlateofArray[i]+ "  Plakaya Sahip Otomobil ,  "+
                    HGSAuto.DateofArray[i] + "  Tarihinde ve  " + HGSAuto.HourofArray[i] + "  Saatinde" +  "  Geçiş Yapmıştır. ";
        }
        for(int ei = HGSAuto.NewIntegerW; ei <= (HGSAuto.NewIntegerW + HGSBus.NewIntegerWB - 1) ; ei+=1){
            this.AmountOfCarsThatPassed[ei] = HGSBus.NameofArrayB[ei]+ "  Adına Kayıtlı ," + HGSBus.PlateofArrayB[ei]+ "  Plakaya Sahip Otobüs ,  "+
                     HGSBus.DateofArrayB[ei] + "  Tarihinde ve  " + HGSBus.HourofArrayB[ei] + "  Saatinde Geçiş Yapmıştır  ";
        }
        for(int ci = HGSAuto.NewIntegerW + HGSBus.NewIntegerWB; ci <= (HGSBus.NewIntegerWB + HGSAuto.NewInteger + HGSMinibus.NewIntegerWMB - 1 ); ci ++){
            this.AmountOfCarsThatPassed[ci] = HGSMinibus.NameofArrayMB[ci]+ "  Adına Kayıtlı ," + HGSMinibus.PlateofArrayMB[ci]+ " Plakaya Sahip Minibüs , "+
                    HGSMinibus.DateofArrayMB[ci] + "  Tarihinde ve  " + HGSMinibus.HourofArrayMB[ci] + " Saatinde Geçiş Yapmıştır ";
        }
        AmountOfVehicleReturner();
    }


    public void AmountOfVehicleReturner(){
        for(int di = 0; di <= HGSAuto.NewInteger + HGSBus.NewIntegerWB+ HGSMinibus.NewIntegerWMB-1;di++){
            System.out.println("");
            System.out.println(this.AmountOfCarsThatPassed[di]);
            System.out.println("");
        }


    }

    public HGSAccountRecord getArt() {
        return Art;
    }

    public Bus GetBus(){
        return  this.Bus;
    }

    public AUTO GetAuto(){
        return  this.Auto;
    }

    public Minibus GetMinibus(){
        return this.Minibus;
    }



}
