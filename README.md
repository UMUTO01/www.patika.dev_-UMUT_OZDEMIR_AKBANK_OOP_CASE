# www.patika.dev_-UMUT_OZDEMIR_AKBANK_OOP_CASE
Merhaba case im birazcik karisik bir sekilde yapıldı ama elimden gelenin en iyisini sunmaya çalıştım şimdi size nasıl yaptığımı anlatayım.


Öncelikle case yi yapmadan önce nasil yaklaşmam gerektiğini çok düşündüm class ları extend ile mi yapsam yoksa tek bir class in içine field o
larak yerleştirerek compositon olarak mi yapsam

Buna karar verdikten sonra hangi class in ana class olacağına karar verdim ardından diğer class ları onun içine fields olarak yazdım.

Ana class in içine işlem limiti olan bir while döngüsü olan bir metot ekledim ve onun sayesinde kullanıcıdanan istediğim kadar veri aldım.

Bunlar dışında benden istenmese de eklediğim birkaç özellik oldu.

Herşeyi control eden ana class imin içerisinde gelen bütün veriyi depolayan ardından istenildğinde listeleyebilen bir metot yazdım ve bence burası benim için en iyi kısımdı


Herşeyi listeleyecek olan dizi eklenen veri boyutu kadar listeleme kapasitesine sahip. NewInteger Değerleri bunu simgeliyor.

Yani eğer  10 araç bilgisi girildiyse 10 araç listelenecek böylece kalan bölümler null olarak yazdırılmıyıcak yani istenmeyen sonuçlar çıkmayacak.

HGSAuto.NewInteger + HGSBus.NewIntegerWB+ HGSMinibus.NewIntegerWMB-1; Özellikle kodun bu kısmı bahsettiğim işlevi görüyüor.

public void AmountOfVehicleReturner(){
        for(int di = 0; di <= HGSAuto.NewInteger + HGSBus.NewIntegerWB+ HGSMinibus.NewIntegerWMB-1;di++){
            System.out.println("");
            System.out.println(this.AmountOfCarsThatPassed[di]);
            System.out.println("");
        }
        



Bunların dışında girdileri önce Bus, Auto ve Minibus sınıflarında Aldım ve o kısımlardaki arraylerde depoladım ardından Ana Gişe sınıfımda depolamayı tercih ettim.

Çünkü bu şekilde benim açımdan daha kolay oldu girdileri ayrı ayrı kendi class larında depolayıp ardından ana bir classda depolamak.

Bunun dışında arraylerimin çalışma mantığı şöyle


Her class daki field olarak tanimlanan arrayler 0 dan başlar ve aynı sıradaki dizeler aynı şeyi temsil eder örneğin NameArray[0] ve PlateArray[0] aynı aracın değerleridir
ve istenildiğinde birlikte çalıştırılırlar.

Array isimlerim değişken isimlerim ve class larimin hepsi İngilizce olarak tanımlandı bunun sebebi benim buna olan aşinağlığım :)

Türkce isimler yerine İngilizce olarak tanımlarken daha hızlı işlem yapabiliyorun.

Bunların dışında fields lara Geliyim:
 Örneğin kullanıcı bir otobüs kaydı yapıcaksa Bus class ındaki arrayler çalışacak ve bilgiler Bus sınıfının fields ları olan arraylerde kayıte edilicek ve kayıdın ardından
 
 NewIntegerB +1 olarak değiştirilicek yani kontrol değişkenim çalışmış olucak. Bunun dışında NewIntegerWB adlı bir  variable diye tanımladım w ile biten variable larımın
 kontrol variable ları olmasını istemiştim ardından planım değişti ancak yine de kalmalarını istedim ve gerektiğinde kullandım.
 
 
 Benim için en zor olan nokta ikinci field yani kayıtları tutan HGSAccountRecord burda birazcık zorlandım ancak sonunda yapmayı başardım bunların dışında
 
 B ler busları yani otobüsleri temsil eder
 MB ler minibüsleri temsil eder
 Auto lar da otomobilleri temsil eder


Objeleremin ismi HGS ile başlar ve Account record yani toplam bakiyeyi gösteren objem de HGS ve random  sayılardan oluşur bunun sebebi benim için daha akılda kalmasıdır.


Kullanıcıdan kayıt yapılırken önce reacher metodu çağırılır örneğin bir otobüs geçiş kaydı yapalım önce reacher methodu Control.Bus üzerinden çağırılır
Yani control, ana classin obje hali önce ana classima ulaşır ardından onun bir fields ı olarak hazırlanmış Bus classina ulaşır burda

Returner methodu aktif hale getirirlir ve kullanıcıdan teker teker veriler alınır.

Ardından ad soyadı NameofArray field ına kayıt edecek olan  ardından plaka için plate of array ardından tarih için date of ve hour için Hour of array B methodları çağırılır
NameofArrayB(Nam,NewIntegerB);

            PlateofArrayB(Na,NewIntegerB);

            DateofArrayB(Date,NewIntegerB);

            HourofArrayB(Time,NewIntegerB);

            TotalAccountOfArrayB(Total,NewIntegerB); 
            
            
            
            New integer yani kontrol değişkenlerim her zaman sıfırdan başlar ve hangi bilgiyi hangi sırayla kayıt etmem için önemlidir
            
            
            Her bir method aynı sıradaki arraye aynı bilgiyi depolar burası çok önemlidir
            
            Böylece yanlış bir bilgi yanlış sıraya kayıt edilmez
             
             
             Plaka ad soyad saat ve tarih aynı bölüme kayıt edilir.
             
             TotalAccountofArray i bakiyeyi saklaması için tasarlamıştım ancak sonradan benden kalan bakiyelerin gösterilmesi istenilmediği için onun listeye eklenilmesini
             istemedim.
             
             
             Bunun dışında Returner methodları aslında  public void NameofArrayB(String NameInFunctionB1, int NumberInArrayFunctionB1){
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


Bu methodların birer kopyaları ve programın çalışp çalışmadığını kontrol etmek için yapıldılar
Ancak sonrasında çok kullanılmadılar.
      
      
      Lütfen Öncelikle Akbank OOP CASE dosyasına bakın orada tüm kodu bulacaksınız ardından istetseniz Main Auto Bus Account gibi class ların orjinal çıktılarına bakabilirsiniz ama öcelikle Akbank OOP CASE bakmanızı önererim. Şimdiden değerlendirmeniz için teşekkür ederim
 
 
 
 


        
        
        
        
     
