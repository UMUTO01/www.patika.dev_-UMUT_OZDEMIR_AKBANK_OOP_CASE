package com.company;

import java.util.Scanner;

public class Bus {




        public double PassingPB = 20.75;

        public String[] NameofArrayB = new String[25];

        public String[] PlateofArrayB = new String[25];

        public String[] DateofArrayB = new String[25];

        public String[] HourofArrayB = new String[25];

        public int[] TotalAccoutOfArrayB = new int[25];

        public int NewIntegerWB = 0;

        public int NewIntegerB = 0;

        public void ReacherBus(){


            Scanner scan = new Scanner(System.in);


            System.out.println("***Otobüs Kayıt Sistemi***");

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



            NameofArrayB(Nam,NewIntegerB);

            PlateofArrayB(Na,NewIntegerB);

            DateofArrayB(Date,NewIntegerB);

            HourofArrayB(Time,NewIntegerB);

            TotalAccountOfArrayB(Total,NewIntegerB);

            this.NewIntegerB+=1;
            this.NewIntegerWB+=1;

        }


        public double GetPassingP(){
            return this.PassingPB;
        }

        public void NameofArrayB(String NameInFunctionB1, int NumberInArrayFunctionB1){
            this.NameofArrayB[NumberInArrayFunctionB1] = NameInFunctionB1;
        }
        public void PlateofArrayB(String PlateInFunctionB2, int NumberInArrayFunctionB2){
            this.PlateofArrayB[NumberInArrayFunctionB2] = PlateInFunctionB2;
        }
        public void DateofArrayB(String DateInFunctionB3, int NumberInArrayFunctionB3){
            this.DateofArrayB[NumberInArrayFunctionB3] = DateInFunctionB3;
        }
        public void HourofArrayB(String HourInFunctionB4, int NumberInArrayFunctionB4){
            this.HourofArrayB[NumberInArrayFunctionB4] = HourInFunctionB4;
        }
        public void TotalAccountOfArrayB(int AccountInFunctionB5, int NumberInArrayFunctionB5){
            this.TotalAccoutOfArrayB[NumberInArrayFunctionB5] = AccountInFunctionB5;
        }

        public String NameArrayReturnerB(int NameOfArrayNumberB){
            String[] NewArrayInNameArrayReturner = new String[this.NameofArrayB.length];
            for (int i = 0; i<this.NameofArrayB.length-1;i++){
                NewArrayInNameArrayReturner[i] = this.NameofArrayB[i];

            }
            return NewArrayInNameArrayReturner[NameOfArrayNumberB];

        }

        public double TotalAccoutOfArrayB(int TotalAccoutOfArray1) {
            double[] NewTotalAccoutOfArrayInTotalAccoutReturnerB = new double[this.TotalAccoutOfArrayB.length];
            for (int i = 0; i < this.TotalAccoutOfArrayB.length - 1; i++) {
                NewTotalAccoutOfArrayInTotalAccoutReturnerB[i] = this.TotalAccoutOfArrayB[i];

        }
        return NewTotalAccoutOfArrayInTotalAccoutReturnerB[TotalAccoutOfArray1];

    }
    public String PlateofArrayBReturnerB(int PlateofArrayBNumberB){
        String[] PlateofArrayBInPlateofArrayBReturner = new String[this.PlateofArrayB.length];
        for (int i = 0; i<this.PlateofArrayB.length-1;i++){
            PlateofArrayBInPlateofArrayBReturner[i] = this.PlateofArrayB[i];

        }
        return PlateofArrayBInPlateofArrayBReturner[PlateofArrayBNumberB];

    }
    public String DateofArrayBReturnerB(int DateofArrayNumberB){
        String[] DateofArrayInDateofArrayReturner = new String[this.DateofArrayB.length];
        for (int i = 0; i<this.DateofArrayB.length-1;i++){
            DateofArrayInDateofArrayReturner[i] = this.DateofArrayB[i];

        }
        return DateofArrayInDateofArrayReturner[DateofArrayNumberB];

    }
    public String HourofArrayBReturnerB(int HourofArrayBNumberB){
        String[] HourofArrayBInHourofArrayBReturner = new String[this.HourofArrayB.length];
        for (int i = 0; i<this.HourofArrayB.length-1;i++){
            HourofArrayBInHourofArrayBReturner[i] = this.HourofArrayB[i];

        }
        return HourofArrayBInHourofArrayBReturner[HourofArrayBNumberB];

    }


    }
