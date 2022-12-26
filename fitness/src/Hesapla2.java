public class Hesapla2 {
    protected static double kaloriIhtiyaci;
    protected static double carbIhtiyaci;
    protected static double proteinIhtiyaci;
    protected static int yagIhtiyaci;
    public static void hesapla2(int plan,int kilo,int beslenme) {

        Hesapla1 planHesap =new Hesapla1();

        BesinProgrami besin=new BesinProgrami();

        if(plan==1){
            double i=planHesap.kaloriIhtiyaci-700;
            planHesap.cutihtiyacHesaplama(i,kilo);
            System.out.println("Cut için gerekli kalori: "+i);
            System.out.println("Cut için gerekli protein: "+planHesap.getProteinihtiyaci());
            System.out.println("Cut için gerekli yağ: "+planHesap.getYagihtiyaci());
            System.out.println("Cut için gerekli karbonhidrat: "+planHesap.getCarbihtiyaci());
        }
        else if(plan==2){
            double i=planHesap.kaloriIhtiyaci+700;
            planHesap.bulkihtiyacHesapla(i,kilo);
            System.out.println("Bulk için gerekli kalori: "+i);
            System.out.println("Bulk için gerekli protein: "+planHesap.getProteinihtiyaci() + "Gr");
            System.out.println("Bulk için gerekli yağ: "+planHesap.getYagihtiyaci()+ "Gr");
            System.out.println("Bulk için gerekli karbonhidrat: "+planHesap.getCarbihtiyaci() + "Gr");
        }

        if(beslenme==1){ //hepçil seçilirse buraya girecek
            besin.HepcilKahvalti(planHesap.getCarbihtiyaci(),planHesap.getYagihtiyaci(),planHesap.getProteinihtiyaci());
            besin.HepcilOglen(planHesap.getCarbihtiyaci(),planHesap.getYagihtiyaci(),planHesap.getProteinihtiyaci());
            besin.HepcilAksam(planHesap.getCarbihtiyaci(),planHesap.getYagihtiyaci(),planHesap.getProteinihtiyaci());
        } else if (beslenme==2) { //vejeteryan seçilirse buraya girecek
            besin.VejeteryanKahvalti(planHesap.getCarbihtiyaci(),planHesap.getYagihtiyaci(),planHesap.getProteinihtiyaci());
            besin.VejeteryanOglen(planHesap.getCarbihtiyaci(),planHesap.getYagihtiyaci(),planHesap.getProteinihtiyaci());
            besin.VejeteryanAksam(planHesap.getCarbihtiyaci(),planHesap.getYagihtiyaci(),planHesap.getProteinihtiyaci());

        } else if (beslenme==3) {//vegan seçilirse buraya girecek
            besin.VeganKahvalti(planHesap.getCarbihtiyaci(),planHesap.getYagihtiyaci(),planHesap.getProteinihtiyaci());
            besin.VeganOglen(planHesap.getCarbihtiyaci(),planHesap.getYagihtiyaci(),planHesap.getProteinihtiyaci());
            besin.VeganAksam(planHesap.getCarbihtiyaci(),planHesap.getYagihtiyaci(),planHesap.getProteinihtiyaci());

        }

    }
}