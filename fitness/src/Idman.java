public class Idman  {


    //3gun şeceneği 3 seviye seçeneği+1
    public static String idmanyaz(int gun,int seviye) {
        String dosya = null;

        switch (seviye){
            case 1://spor seviyesini belirten case
                switch (gun){
                    //spora gidilecek gun sayısını belirten case
                    case 1:
                    case 2:
                    case 3:
                        //koddaki karmasıklığı önlemek için spor programı yazdırılırken dosya islemleri kullandık
                        dosya =  "C:\\Users\\Emirhan\\Desktop\\fitness\\fullbody\\fullbody1.txt";
                        
                        break;
                    case 4:

                        dosya =  "C:\\Users\\Emirhan\\Desktop\\fitness\\brosplit4\\4gunluksplit1.txt";

                        break;
                    case 5:
                        dosya =  "C:\\Users\\Emirhan\\Desktop\\fitness\\ppl5gun\\ppl1.txt";
                        break;
                    default:
                        System.out.println("*******************************************");
                        System.out.println("3, 4 veya 5 gün giriniz!!!");
                        System.out.println("*******************************************");break;
            }
                    break;



            case 2:

                switch (gun){

                    case 1:
                    case 2:
                    case 3:
                        dosya =  "C:\\Users\\Emirhan\\Desktop\\fitness\\fullbody\\fullbody2.txt";
                        break;
                    case 4:

                        dosya =  "C:\\Users\\Emirhan\\Desktop\\fitness\\brosplit4\\4gunluksplit2.txt";
                        break;
                    case 5:
                        dosya =  "C:\\Users\\Emirhan\\Desktop\\fitness\\ppl5gun\\ppl2.txt";
                        break;

                    default:
                        System.out.println("*******************************************");
                        System.out.println("3, 4 veya 5 gün giriniz!!!");
                        System.out.println("*******************************************");break;
                }
                break;


            case 3:
                switch (gun){
                    case 1:
                    case 2:
                    case 3:
                        dosya =  "C:\\Users\\Emirhan\\Desktop\\fitness\\fullbody\\fullbody3.txt";
                        break;
                    case 4:
                        dosya =  "C:\\Users\\Emirhan\\Desktop\\fitness\\brosplit4\\4gunluksplit3.txt";
                        break;
                    case 5:
                        dosya =  "C:\\Users\\Emirhan\\Desktop\\fitness\\ppl5gun\\ppl3.txt";
                        break;

                    default:
                        System.out.println("*******************************************");
                        System.out.println("3, 4 veya 5 gün giriniz!!!");
                        System.out.println("*******************************************");break;
                }
                break;


        }



        return dosya;
    }


}