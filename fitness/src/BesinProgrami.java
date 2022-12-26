public class BesinProgrami {



    public void HepcilKahvalti(double carbIhtiyac,double yagIhtiyac,double proteinIhtiyac) {
        int proteinGram1, carbGram1, yagGram1;
        double p = 0, y = 0, k = 0;

        for (proteinGram1 = 1; p < proteinIhtiyac/5 ; proteinGram1++) {
            p = proteinGram1 * 0.13;
        }
        yagIhtiyac=yagIhtiyac-(proteinGram1*0.10);//yumurta yağ da içerdiği için yağ ihtiyacından çıkarmamız gerekti
        for (carbGram1 = 1; k < carbIhtiyac/5 ; carbGram1++) {
            k = carbGram1 * 0.66;

        }

        for (yagGram1 = 1; y < yagIhtiyac/5 ; yagGram1++) {
            y = yagGram1 * 1;
        }
        System.out.println("-------Kahvaltı Programınız--------");
        System.out.println(proteinGram1+" Gram yumurta");
        System.out.println(carbGram1+" Gram yulaf");
        System.out.println(yagGram1+" Gram zeytin yağı");




    }

    public void HepcilOglen(double carbIhtiyac,double yagIhtiyac,double proteinIhtiyac) {
        int proteinGram2, carbGram2, yagGram2;
        double p = 0, y = 0, k = 0;
        //2.5 e bölme sebebimiz günkük makro ihtiyacin %40ını öğle yemeğinden karşılamak
        for (proteinGram2 = 1; p < proteinIhtiyac/2.5; proteinGram2++) {
            p = proteinGram2 * 0.23;//tavuğun protein oranı

        }


        for (carbGram2 = 1; k < carbIhtiyac/2.5; carbGram2++) {
            k = carbGram2 * 0.8;//pirincin karb oranı

        }

        for (yagGram2 = 1; y < yagIhtiyac/2.5; yagGram2++) {
            y = yagGram2 ;//zeytin yağının yağ oranı

        }
        System.out.println("-------Öğle Yemeği Programınız--------");
        System.out.println(proteinGram2+" Gram tavuk");
        System.out.println(carbGram2+" Gram pirinç");
        System.out.println(yagGram2+" Gram zeytin yağı");
    }


    public void HepcilAksam(double carbIhtiyac,double yagIhtiyac,double proteinIhtiyac) {
        int proteinGram3, carbGram3, yagGram3;
        double p = 0, y = 0, k = 0;
        for (proteinGram3 = 1; p < proteinIhtiyac/2.5; proteinGram3++) {
            p = proteinGram3 * 0.23;

        }
        for (carbGram3 = 1; k < carbIhtiyac/2.5; carbGram3++) {
            k = carbGram3 * 0.8;

        }

        for (yagGram3 = 1; y < yagIhtiyac/2.5; yagGram3++) {
            y = yagGram3 ;
        }

        System.out.println("-------Akşam Yemeği Programınız--------");
        System.out.println(proteinGram3+" Gram tavuk");
        System.out.println(carbGram3+" Gram pirinç");
        System.out.println(yagGram3+" Gram zeytin yağı");
    }
    public void VejeteryanKahvalti(double carbIhtiyac,double yagIhtiyac,double proteinIhtiyac) {
        int proteinGram1, carbGram1, yagGram1;
        double p = 0, y = 0, k = 0;

        for (proteinGram1 = 1; p < proteinIhtiyac*0.3 ; proteinGram1++) {
            p = proteinGram1 * 0.13;
        }
        yagIhtiyac=yagIhtiyac-(proteinGram1*0.10);

        for (carbGram1 = 1; k < carbIhtiyac*0.3 ; carbGram1++) {
            k = carbGram1 * 0.66;

        }

        for (yagGram1 = 1; y < yagIhtiyac*0.3 ; yagGram1++) {
            y = yagGram1 * 1;
        }
        System.out.println("-------Kahvaltı Programınız--------");
        System.out.println(proteinGram1+" Gram yumurta");
        System.out.println(carbGram1+" Gram yulaf");
        System.out.println(yagGram1+" Gram zeytin yağı");
    }
    public void VejeteryanOglen(double carbIhtiyac,double yagIhtiyac,double proteinIhtiyac) {
        int proteinGram2, carbGram2, yagGram2;
        double p = 0, y = 0, k = 0;

        for (proteinGram2 = 1; p < proteinIhtiyac*0.3 ; proteinGram2++) {
            p = proteinGram2 * 0.21;
        }
        carbIhtiyac=carbIhtiyac-(proteinGram2*0.40);

        for (carbGram2 = 1; k < carbIhtiyac*0.3 ; carbGram2++) {
            k = carbGram2 * 0.8;
        }

        for (yagGram2 = 1; y < yagIhtiyac*0.3 ; yagGram2++) {
            y = yagGram2 * 1;
        }
        System.out.println("-------Öğle Yemeği Programınız--------");
        System.out.println(proteinGram2+" Gram nohut");
        System.out.println(carbGram2+" Gram pirinç ");
        System.out.println(yagGram2+" Gram zeytin yağı");
    }
    public void VejeteryanAksam(double carbIhtiyac,double yagIhtiyac,double proteinIhtiyac) {
        int proteinGram3, carbGram3, yagGram3;
        double p = 0, y = 0, k = 0;

        for (proteinGram3 = 1; p < proteinIhtiyac*0.4 ; proteinGram3++) {
            p = proteinGram3 * 0.22;
        }
        carbIhtiyac=carbIhtiyac-(proteinGram3*0.30);
        for (carbGram3 = 1; k < carbIhtiyac*0.4 ; carbGram3++) {
            k = carbGram3 * 0.8;
        }

        for (yagGram3 = 1; y < yagIhtiyac*0.4 ; yagGram3++) {
            y = yagGram3 * 1;
        }
        System.out.println("-------Akşam Yemeği Programınız--------");
        System.out.println(proteinGram3+" Gram kuru fasulye");
        System.out.println(carbGram3+" Gram pirinç");
        System.out.println(yagGram3+" Gram zeytin yağı");
    }
    public void VeganKahvalti(double carbIhtiyac,double yagIhtiyac,double proteinIhtiyac) {
        int proteinGram1, carbGram1, yagGram1;
        double p = 0, y = 0, k = 0;

        for (proteinGram1 = 1; p < proteinIhtiyac*0.3 ; proteinGram1++) {
            p = proteinGram1 * 0.23;
        }
        carbIhtiyac=carbIhtiyac-(proteinGram1*0.30);

        for (carbGram1 = 1; k < carbIhtiyac*0.3 ; carbGram1++) {
            k = carbGram1 * 0.66;
        }

        for (yagGram1 = 1; y < yagIhtiyac*0.3 ; yagGram1++) {
            y = yagGram1 * 1;
        }
        System.out.println("-------Kahvaltı Programınız--------");
        System.out.println(proteinGram1+" Gram mercimek");
        System.out.println(carbGram1+" Gram yulaf");
        System.out.println(yagGram1+" Gram zeytin yağı");
    }
    public void VeganOglen(double carbIhtiyac,double yagIhtiyac,double proteinIhtiyac) {
        int proteinGram2, carbGram2, yagGram2;
        double p = 0, y = 0, k = 0;

        for (proteinGram2 = 1; p < proteinIhtiyac*0.3 ; proteinGram2++) {
            p = proteinGram2 * 0.21;
        }
        carbIhtiyac=carbIhtiyac-(proteinGram2*0.40);

        for (carbGram2 = 1; k < carbIhtiyac*0.3 ; carbGram2++) {
            k = carbGram2 * 0.8;
        }

        for (yagGram2 = 1; y < yagIhtiyac*0.3 ; yagGram2++) {
            y = yagGram2 * 1;
        }
        System.out.println("-------Öğle Yemeği Programınız--------");
        System.out.println(proteinGram2+" Gram nohut");
        System.out.println(carbGram2+" Gram pirinç ");
        System.out.println(yagGram2+" Gram zeytin yağı");
    }
    public void VeganAksam(double carbIhtiyac,double yagIhtiyac,double proteinIhtiyac) {
        int proteinGram3, carbGram3, yagGram3;
        double p = 0, y = 0, k = 0;

        for (proteinGram3 = 1; p < proteinIhtiyac*0.4 ; proteinGram3++) {
            p = proteinGram3 * 0.22;
        }
        carbIhtiyac=carbIhtiyac-(proteinGram3*0.30);
        for (carbGram3 = 1; k < carbIhtiyac*0.4 ; carbGram3++) {
            k = carbGram3 * 0.8;
        }

        for (yagGram3 = 1; y < yagIhtiyac*0.4 ; yagGram3++) {
            y = yagGram3 * 1;
        }
        System.out.println("-------Akşam Yemeği Programınız--------");
        System.out.println(proteinGram3+" Gram kuru fasulye");
        System.out.println(carbGram3+" Gram pirinç");
        System.out.println(yagGram3+" Gram zeytin yağı");
    }

}