package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        FirstProgram();

	// write your code here


    }
    public static void FirstProgram(){

        Scanner scan = new Scanner(System.in);
        HGSAccountControl Control = new HGSAccountControl();
        int dasAA = 1;
        int a;
        boolean Falsch;

        boolean Enable = true;
        while(Enable == true){
            if(Control.HGSBus.NewIntegerWB == 0 || Control.HGSAuto.NewIntegerW == 0 || Control.HGSMinibus.NewIntegerWMB == 0){

                System.out.println("*******************************************************************");

                System.out.println("");

                System.out.println("Otobüs geçişi için 1, Araba için 2, Minibüs için 3'e basınız: ");

                System.out.println("");

                System.out.println("***Uyarı Eğer Hafızada Araç Kaydı Bulunmuyorsa Araç Kaydı ve Bakiye GÖRÜNTÜLENEMEZ ve Sadece 100 işlem Yapılabilir***");

                a = scan.nextInt();
            }

            else{
                System.out.println("*******************************************************************");

                System.out.println("");

                System.out.println("Otobüs geçişi için 1, Araba için 2, Minibüs için 3'e basınız: ");

                System.out.println("");

                System.out.println("Araç Kayıtlarını Görmek için 4'e");

                System.out.println("");

                System.out.println("Toplamda Kazanılan Bakiyeyi Görmek için 5'e Basınız: ");
                a = scan.nextInt();
            }


            int b = a;

                 if(b == 2) {
                     Control.HGSAuto.ReacherAuto();
                     Control.LeftAccount(a);
                     System.out.println("");
                     System.out.println("Araç Kaydına Devam Etmek için  1, Kayıtlı Bakiyeyi Görmek için 2, Geçen Araç Listesi için 3");
                     int d = scan.nextInt();

                     switch (d) {
                         case 1:
                             Falsch = true;
                             break;
                         case 2:
                             System.out.println("Toplamda Elde Edilen Kazanç : ");
                             Control.SetPrice();


                             break;

                         case 3:
                             Control.AmountOfCarsThatPassedReturner();
                             System.out.println("Başa Yönlendiriliyorsunuz");
                             break;


                         default:
                             System.out.println("Yanlış Tuş, Başa Yönlendiriliyorsunuz");

                     }


                 }

                 if(b == 1){
                     Control.HGSBus.ReacherBus();
                     Control.LeftAccount(b);
                     System.out.println("");
                     System.out.println("Araç Kaydına Devam Etmek için  1, Kayıtlı Bakiyeyi Görmek için 2, Geçen Araç Listesi için 3");
                     int da = scan.nextInt();

                     switch (da) {
                         case 1:
                             Falsch = true;
                             break;
                         case 2:
                             System.out.println("Toplamda Elde Edilen Kazanç : ");
                             Control.SetPrice();


                             break;

                         case 3:
                             Control.AmountOfCarsThatPassedReturner();
                             System.out.println("Başa Yönlendiriliyorsunuz");
                             break;

                         default:
                             System.out.println("Yanlış Tuş, Başa Yönlendiriliyorsunuz");

                     }


                 }

                 if(b==3){
                     Control.HGSMinibus.ReacherMB();
                     System.out.println("Araç Kaydına Devam Etmek için  1, Kayıtlı Bakiyeyi Görmek için 2, Geçen Araç Listesi için 3, Çıkış için 4");

                     int das = scan.nextInt();
                     switch (das) {
                         case 1:
                             Falsch = true;
                             break;
                         case 2:
                             System.out.println("Toplamda Elde Edilen Kazanç : ");
                             Control.SetPrice();

                             break;

                         case 3:
                             Control.AmountOfCarsThatPassedReturner();
                             System.out.println("Başa Yönlendiriliyorsunuz");
                             break;


                         default:
                             System.out.println("Yanlış Tuş, Başa Yönlendiriliyorsunuz");

                     }


                }
                 dasAA++;
                if(dasAA>100){
                    Enable =false;
                }







        }

    }

}
