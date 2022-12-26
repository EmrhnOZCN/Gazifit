public class Hesapla1 extends Hesapla2 {//hesapla
                    //kalori, protein, karbonhidrat, yag ihtiyacını hesapla2 den kalıttık(inheritance)
    private int kilo;
    private double boy;

    //vucut kitle indexi hesaplama
    public void vucutKitleHesapla(double boy,int kilo) {
        double sonuc = (10000*kilo)/(boy*boy);

        System.out.println("Vucut kitlesi = " + sonuc);

        //vucut tipi hesaplayıp yazdıran if else blokları
        if(sonuc<=18.5){
            System.out.println("İdeal kilonun altında");

        } else if (sonuc>18.5 && sonuc<=24.9) {
            System.out.println("İdeal kiloda");
            
        }
        else if (sonuc>24.9 && sonuc<=29.9) {
            System.out.println("İdeal kilonun üstünde");

        }
        else if (sonuc>29.9 && sonuc<=39.9) {
            System.out.println("İdeal kilonun çok üstünde (obez)");

        }
        else{
            System.out.println("İdeal kilonun çok üstünde (morbid obez)");
        }
        System.out.println("*******************************************");
    }

    //kalori hesapla
    public  void kaloriIhtiyaciHesapla(int cinsiyet,int yas,int boy,int kilo,int gun){

        //erkek
        if(cinsiyet==1){
            switch (gun){
                case 3: kaloriIhtiyaci =(10*kilo+boy*6.25-5*yas+5)*1.3;break;
                case 4: kaloriIhtiyaci =(10*kilo+boy*6.25-5*yas+5)*1.6;break;
                case 5: kaloriIhtiyaci =(10*kilo+boy*6.25-5*yas+5)*1.8;break;
            }
        }
        //kadın
        if(cinsiyet==2){
            switch (gun){

                case 3: kaloriIhtiyaci =(10*kilo+6.25*boy-5+yas-161)*1.3;break;
                case 4: kaloriIhtiyaci =(10*kilo+6.25*boy-5+yas-161)*1.6;break;
                case 5: kaloriIhtiyaci =(10*kilo+6.25*boy-5+yas-161)*1.8;break;
            }
        }
        System.out.println("Bazal Metabolizmanız : " + kaloriIhtiyaci);
        System.out.println("*******************************************");
    }
    //bulk kalori-makro hesaplama
    public static void bulkihtiyacHesapla(double kaloriIhtiyaci,int kilo){
        double v = kaloriIhtiyaci + 700;
        proteinIhtiyaci=kilo*1.5;
        yagIhtiyaci =kilo*2;
        carbIhtiyaci = (v - (proteinIhtiyaci * 4) - (yagIhtiyaci * 8))/4;
    }
    //cut kalori-makro hesaplama
    public static void cutihtiyacHesaplama(double kaloriIhtiyaci,int kilo){
        double v = kaloriIhtiyaci - 700;
        proteinIhtiyaci =kilo*2;
        yagIhtiyaci =kilo;
        carbIhtiyaci = (v - (proteinIhtiyaci * 4) - (yagIhtiyaci * 8))/4;
    }
    public static double getCarbihtiyaci() {
        return carbIhtiyaci;
    } //getter-setter
    public static int getYagihtiyaci() {
        return yagIhtiyaci;
    }
    public static double getProteinihtiyaci() {
        return proteinIhtiyaci;
    }



}