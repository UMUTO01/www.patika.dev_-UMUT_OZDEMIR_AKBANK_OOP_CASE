package com.company;

import java.util.Scanner;

public class Minibus {
    public double PassingPMB = 15.75;

    public String[] NameofArrayMB = new String[25];

    public String[] PlateofArrayMB = new String[25];

    public String[] DateofArrayMB = new String[25];

    public String[] HourofArrayMB = new String[25];

    public int[] TotalAccoutOfArrayMB = new int[25];

    private int IntegerMB =0;

    public int NewIntegerWMB = 0;

    public void ReacherMB(){
        Scanner scan = new Scanner(System.in);



        System.out.println("***Minibüs Kayıt Sistemi***");

        System.out.println("Plaka girişi yapınız: ");

        String Na = scan.nextLine();

        System.out.println("Ad Soyad girişi yapınız: ");
        String Nam = scan.nextLine();


        System.out.println("Tarih  girişi yapınız: ");
        String Date = scan.nextLine();

        System.out.println("Saat girişi yapınız: ");
        String Time = scan.nextLine();

        System.out.println("Aracin gişe öncesi bakiyesini yaziniz: ");
        int Total = scan.nextInt();

        NameofArrayMB(Nam,this.IntegerMB);

        PlateofArrayMB(Na,this.IntegerMB);

        DateofArrayMB(Date,this.IntegerMB);

        HourofArrayMB(Time,this.IntegerMB);

        TotalAccoutOfArrayMB(Total,this.IntegerMB);

        this.IntegerMB +=1;
        this.NewIntegerWMB+=1;

    }


    public double GetPassingP(){
        return this.PassingPMB;
    }

    public void NameofArrayMB(String NameInFunctionMB1, int NumberInArrayFunctionMB1){
        this.NameofArrayMB[NumberInArrayFunctionMB1] = NameInFunctionMB1;
    }
    public void PlateofArrayMB(String PlateInFunctionMB2, int NumberInArrayFunctionMB2){
        this.PlateofArrayMB[NumberInArrayFunctionMB2] = PlateInFunctionMB2;
    }
    public void DateofArrayMB(String DateInFunctionMB3, int NumberInArrayFunctionMB3){
        this.DateofArrayMB[NumberInArrayFunctionMB3] = DateInFunctionMB3;
    }
    public void HourofArrayMB(String HourInFunctionMB4, int NumberInArrayFunctionMB4){
        this.HourofArrayMB[NumberInArrayFunctionMB4] = HourInFunctionMB4;
    }
    public void TotalAccoutOfArrayMB(int AccountInFunctionMB5, int NumberInArrayFunctionMB5){
        this.TotalAccoutOfArrayMB[NumberInArrayFunctionMB5] = AccountInFunctionMB5;

    }

    public String HourofArrayMBReturnerB(int HourofArrayMB3){
        String[] NewArrayInNameArrayReturner = new String[this.HourofArrayMB.length];
        for (int i = 0; i<this.HourofArrayMB.length-1;i++){
            NewArrayInNameArrayReturner[i] = this.HourofArrayMB[i];

        }
        return NewArrayInNameArrayReturner[HourofArrayMB3];

    }

    public String PlateofArrayMB(int PlateofArrayMBNumbermB1){
        String[] PlateofArrayMBInPlateofArrayMBReturner = new String[this.PlateofArrayMB.length];
        for (int i = 0; i<this.PlateofArrayMB.length-1;i++){
            PlateofArrayMBInPlateofArrayMBReturner[i] = this.PlateofArrayMB[i];

        }
        return PlateofArrayMBInPlateofArrayMBReturner[PlateofArrayMBNumbermB1];

    }

    public String DateofArrayMBReturnerB(int DateofArrayMB){
        String[] DateofArrayMBInDateofArrayMBReturner = new String[this.DateofArrayMB.length];
        for (int i = 0; i<this.DateofArrayMB.length-1;i++){
            DateofArrayMBInDateofArrayMBReturner[i] = this.DateofArrayMB[i];

        }
        return DateofArrayMBInDateofArrayMBReturner[DateofArrayMB];

    }

    public String NameofArrayMB(int NameOfArrayNumberM3B){
        String[] NameofArrayMBReturner = new String[this.NameofArrayMB.length];
        for (int i = 0; i<this.NameofArrayMB.length-1;i++){
            NameofArrayMBReturner[i] = this.NameofArrayMB[i];

        }
        return NameofArrayMBReturner[NameOfArrayNumberM3B];

    }

    public double TotalAccoutOfArrayMB(int TotalAccoutOfArrayMB){
        double [] TotalAccoutOfArrayMBInTotalAccoutOfArrayMBReturner = new double[this.TotalAccoutOfArrayMB.length];
        for (int i = 0; i<this.TotalAccoutOfArrayMB.length-1;i++){
            TotalAccoutOfArrayMBInTotalAccoutOfArrayMBReturner[i] = this.TotalAccoutOfArrayMB[i];

        }
        return TotalAccoutOfArrayMBInTotalAccoutOfArrayMBReturner[TotalAccoutOfArrayMB];

    }


}
