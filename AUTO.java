package com.company;

import java.util.Scanner;

public class AUTO {
    public double PassingP = 7.50;

    public String[] NameofArray = new String[25];

    public String[] PlateofArray = new String[25];

    public String[] DateofArray = new String[25];

    public String[] HourofArray = new String[25];

    public int[] TotalAccoutOfArray = new int[25];

    public int NewInteger = 0;


    public int NewIntegerW = 0;


    public void ReacherAuto() {
        Scanner scan = new Scanner(System.in);


        System.out.println("***Otomobil Kayıt Sistemi***");

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

        NameofArray(Nam, NewInteger);

        PlateofArray(Na, NewInteger);

        DateofArray(Date, NewInteger);

        HourofArray(Time, NewInteger);

        TotalAccoutOfArray(Total, this.NewInteger);

        this.NewInteger += 1;
        this.NewIntegerW += 1;

    }

    public double GetPassingP() {
        return this.PassingP;

    }

    public void NameofArray(String NameInFunction, int NumberInArrayFunction2) {
        this.NameofArray[NumberInArrayFunction2] = NameInFunction;
    }

    public void PlateofArray(String PlateInFunction, int NumberInArrayFunction3) {
        this.PlateofArray[NumberInArrayFunction3] = PlateInFunction;
    }

    public void DateofArray(String DateInFunction, int NumberInArrayFunction4) {
        this.DateofArray[NumberInArrayFunction4] = DateInFunction;
    }

    public void HourofArray(String HourInFunction, int NumberInArrayFunction5) {
        this.HourofArray[NumberInArrayFunction5] = HourInFunction;
    }

    public void TotalAccoutOfArray(int AccountInFunction6, int NumberInArrayFunction6) {
        this.TotalAccoutOfArray[NumberInArrayFunction6] = AccountInFunction6;

    }

    public double TotalAccoutOfArray(int TotalAccoutOfArray1) {
        double[] NewTotalAccoutOfArrayInTotalAccoutReturner = new double[this.TotalAccoutOfArray.length];
        for (int i = 0; i < this.TotalAccoutOfArray.length - 1; i++) {
            NewTotalAccoutOfArrayInTotalAccoutReturner[i] = this.TotalAccoutOfArray[i];

        }
        return NewTotalAccoutOfArrayInTotalAccoutReturner[TotalAccoutOfArray1];

    }

    public String PlateofArray(int PlateofArrayNumber1) {
        String[] PlateofArrayInPlateofArrayReturner = new String[this.PlateofArray.length];
        for (int i = 0; i < this.PlateofArray.length - 1; i++) {
            PlateofArrayInPlateofArrayReturner[i] = this.PlateofArray[i];
        }
        return PlateofArrayInPlateofArrayReturner[PlateofArrayNumber1];

    }

    public String DateofArrayReturner(int DateofArrayReturnerNumber1) {
        String[] DateofArrayInDateofArrayReturner = new String[this.DateofArray.length];
        for (int i = 0; i < this.DateofArray.length - 1; i++) {
            DateofArrayInDateofArrayReturner[i] = this.DateofArray[i];
        }
        return DateofArrayInDateofArrayReturner[DateofArrayReturnerNumber1];

    }

    public String HourofArrayReturner(int HourofArrayNumber1) {
        String[] HourofArrayInHourofArrayReturner = new String[this.HourofArray.length];
        for (int i = 0; i < this.HourofArray.length - 1; i++) {
            HourofArrayInHourofArrayReturner[i] = this.HourofArray[i];
        }
        return HourofArrayInHourofArrayReturner[HourofArrayNumber1];

    }

    public String NameArrayReturner(int NameOfArrayNumber) {
        String[] NewArrayInNameArrayReturner = new String[this.NameofArray.length];
        for (int i = 0; i < this.NameofArray.length - 1; i++) {
            NewArrayInNameArrayReturner[i] = this.NameofArray[i];
        }
        return NewArrayInNameArrayReturner[NameOfArrayNumber];

    }
}