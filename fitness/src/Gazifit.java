import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Gazifit //JFrame'i extends ile kalıttık
// interface'i, butonu tiklamak, checkbox'u isaretlemek gibi islemleri yapmak için kullandık
        extends JFrame
        implements ActionListener {

    // Form değişkenlerinin tanımlanması
    private Container panel;
    private JLabel yaslabel;
    private JTextField yas;
    private JLabel boylabel;
    private JTextField boy;
    private JLabel kilolabel;
    private JTextField kilo;
    private JLabel cinsiyetlabel;
    private JRadioButton erkek;
    private JRadioButton kadin;

    private JLabel gunlabel;
    private JTextField gun;
    private JLabel planlabel;
    private JRadioButton kiloalma;
    private JRadioButton kiloverme;
    private JLabel besinplanlabel;
    private JRadioButton vejeteryan;
    private JRadioButton vegan;
    private JRadioButton hepcil;
    private JLabel seviyelabel;
    private JRadioButton aktifYapmak;

    private JRadioButton sporGecmisi;
    private JRadioButton hicyapma;
    private JButton button;
    private JTextArea sonuc;



    private ButtonGroup group1;
    private ButtonGroup group2;
    private ButtonGroup group3;
    private ButtonGroup group4;





    public Gazifit() // değişkenler oluşturuldu ve yerleri belirlendi

    {

        setTitle("GaziFit");


        setBounds(100, 0, 1400, 1080);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        panel = getContentPane();
        panel.setLayout(null);


        yaslabel = new JLabel("Yaş ");
        yaslabel.setFont(new Font("Arial", Font.PLAIN, 20));
        yaslabel.setSize(100, 20);
        yaslabel.setLocation(70, 50);
        panel.add(yaslabel);

        yas = new JTextField();
        yas.setFont(new Font("Arial", Font.PLAIN, 15));
        yas.setSize(130, 20);
        yas.setLocation(140, 50 );
        panel.add(yas);


        boylabel = new JLabel("Boy (cm)");
        boylabel.setFont(new Font("Arial", Font.PLAIN, 20));
        boylabel.setSize(100, 25);
        boylabel.setLocation(70, 100);
        panel.add(boylabel);

        boy = new JTextField();
        boy.setFont(new Font("Arial", Font.PLAIN, 15));
        boy.setSize(130, 20);
        boy.setLocation(160, 100);
        panel.add(boy);

        kilolabel = new JLabel("Kilo (kg) ");
        kilolabel.setFont(new Font("Arial", Font.PLAIN, 20));
        kilolabel.setSize(100, 25);
        kilolabel.setLocation(70, 150);
        panel.add(kilolabel);

        kilo = new JTextField();
        kilo.setFont(new Font("Arial", Font.PLAIN, 15));
        kilo.setSize(130, 20);
        kilo.setLocation(160, 150);
        panel.add(kilo);

        cinsiyetlabel = new JLabel("Cinsiyet");
        cinsiyetlabel.setFont(new Font("Arial", Font.PLAIN, 20));
        cinsiyetlabel.setSize(100, 20);
        cinsiyetlabel.setLocation(70, 200);
        panel.add(cinsiyetlabel);

        erkek = new JRadioButton("Erkek");
        erkek.setFont(new Font("Arial", Font.PLAIN, 15));
        erkek.setSelected(true);
        erkek.setSize(75, 20);
        erkek.setLocation(150, 200);
        panel.add(erkek);

        kadin = new JRadioButton("Kadın");
        kadin.setFont(new Font("Arial", Font.PLAIN, 15));
        kadin.setSelected(false);
        kadin.setSize(80, 20);
        kadin.setLocation(230, 200);
        panel.add(kadin);


        gunlabel = new JLabel("Haftada kaç gün spor yapacaksınız: ");
        gunlabel.setFont(new Font("Arial", Font.PLAIN, 20));
        gunlabel.setSize(400, 25);
        gunlabel.setLocation(70, 250);
        panel.add(gunlabel);


        gun = new JTextField();
        gun.setFont(new Font("Arial", Font.PLAIN, 15));
        gun.setSize(60, 20);
        gun.setLocation(400, 253);
        panel.add(gun);

        planlabel = new JLabel("Hedef");
        planlabel.setFont(new Font("Arial", Font.PLAIN, 20));
        planlabel.setSize(100, 20);
        planlabel.setLocation(70, 300);
        panel.add(planlabel);

        kiloalma = new JRadioButton("KiloAlma");
        kiloalma.setFont(new Font("Arial", Font.PLAIN, 15));
        kiloalma.setSelected(true);
        kiloalma.setSize(90, 20);
        kiloalma.setLocation(150, 300);
        panel.add(kiloalma);

        kiloverme = new JRadioButton("KiloVerme");
        kiloverme.setFont(new Font("Arial", Font.PLAIN, 15));
        kiloverme.setSelected(false);
        kiloverme.setSize(100, 20);
        kiloverme.setLocation(250, 300);
        panel.add(kiloverme);


        besinplanlabel = new JLabel("Beslenme");
        besinplanlabel.setFont(new Font("Arial", Font.PLAIN, 20));
        besinplanlabel.setSize(200, 25);
        besinplanlabel.setLocation(70, 350);
        panel.add(besinplanlabel);

        vejeteryan = new JRadioButton("Vejeteryan");
        vejeteryan.setFont(new Font("Arial", Font.PLAIN, 15));
        vejeteryan.setSelected(true);
        vejeteryan.setSize(106, 20);
        vejeteryan.setLocation(170, 350);
        panel.add(vejeteryan);

        vegan = new JRadioButton("Vegan");
        vegan.setFont(new Font("Arial", Font.PLAIN, 15));
        vegan.setSelected(false);
        vegan.setSize(120, 20);
        vegan.setLocation(275, 350);
        panel.add(vegan);


        hepcil = new JRadioButton("Hepçil");
        hepcil.setFont(new Font("Arial", Font.PLAIN, 15));
        hepcil.setSelected(false);
        hepcil.setSize(200, 20);
        hepcil.setLocation(220, 375);
        panel.add(hepcil);

        seviyelabel = new JLabel("Seviye ");
        seviyelabel.setFont(new Font("Arial", Font.PLAIN, 20));
        seviyelabel.setSize(200, 25);
        seviyelabel.setLocation(70, 420);
        panel.add(seviyelabel);

        hicyapma = new JRadioButton("Hiç yapmamış");
        hicyapma.setFont(new Font("Arial", Font.PLAIN, 15));
        hicyapma.setSelected(false);
        hicyapma.setSize(140, 20);
        hicyapma.setLocation(150, 420);
        panel.add(hicyapma);

        sporGecmisi = new JRadioButton("Spor Geçmişim Var");
        sporGecmisi.setFont(new Font("Arial", Font.PLAIN, 15));
        sporGecmisi.setSelected(false);
        sporGecmisi.setSize(185, 20);
        sporGecmisi.setLocation(290, 420);
        panel.add(sporGecmisi);

        aktifYapmak = new JRadioButton("Aktif Spor Yapıyorum");
        aktifYapmak.setFont(new Font("Arial", Font.PLAIN, 15));
        aktifYapmak.setSelected(true);
        aktifYapmak.setSize(200, 20);
        aktifYapmak.setLocation(210, 450);
        panel.add(aktifYapmak);

        group1=new ButtonGroup();
        group1.add(erkek);
        group1.add(kadin);

        group2=new ButtonGroup();
        group2.add(kiloalma);
        group2.add(kiloverme);

        group3 = new ButtonGroup();
        group3.add(vegan);
        group3.add(vejeteryan);
        group3.add(hepcil);

        group4 = new ButtonGroup();
        group4.add(hicyapma);
        group4.add(sporGecmisi);
        group4.add(aktifYapmak);


        button = new JButton("İLERİ");
        button.setFont(new Font("Arial", Font.PLAIN, 15));
        button.setSize(100, 50);
        button.setLocation(170, 550);
        button.addActionListener(this);
        panel.add(button);

        sonuc = new JTextArea();
        sonuc.setFont(new Font("Arial", Font.PLAIN, 15));
        sonuc.setSize(550, 850);
        sonuc.setLocation(700, 10);
        panel.add(sonuc);


        setVisible(true);

    }

    // seçimler yapıldıktan sonra ileri butonuna tıklanınca çalışacak method
    public void actionPerformed(ActionEvent e) {
        try {


            // String gelen verinin int'e çevrilidiği yer
            int yasdata = Integer.parseInt(yas.getText());
            if(yasdata<10 || yasdata>80){
                System.out.println("Yaş giriş hatası!!!");
                System.out.println("*******************************************");
                return;
            }
            int boydata = Integer.parseInt(boy.getText());
            if(boydata<100 || boydata>240){ // istenilen değerler girilmezse konsola hata çıktısı verir
                System.out.println("Boy giriş hatası!!!");
                System.out.println("*******************************************");
                return;
            }

            int kilodata = Integer.parseInt(kilo.getText());
            if (kilodata<40 || kilodata>200){ // istenilen değerler girilmezse konsola hata çıktısı verir
                System.out.println("Kilo giriş hatası!!!");
                System.out.println("*******************************************");
                return;

            }
            int cinsiyetdata;
            int gundata = Integer.parseInt(gun.getText());
            int hedefData = 0; // boş değer atadık
            int beslenmeData = 0; // boş değer atadık
            int idmandata = 0;// boş değer atadık

            if (erkek.isSelected()) {
                cinsiyetdata = 1;
            } else {
                cinsiyetdata = 2;
            }


            if (kiloalma.isSelected()) {
                hedefData = 2;
            } else if (kiloverme.isSelected()) {
                hedefData = 1;

            }

            if (hepcil.isSelected()) {
                beslenmeData = 1;
            } else if (vejeteryan.isSelected()) {
                beslenmeData = 2;

            } else if (vegan.isSelected()) {
                beslenmeData = 3;
            }

            if (hicyapma.isSelected()) {
                idmandata = 1;

            } else if (sporGecmisi.isSelected()) {
                idmandata = 2;
            } else if (aktifYapmak.isSelected()) {
                idmandata = 3;

            }



            Hesapla1 hesaplanacak = new Hesapla1(); //Hesapla1 classına eriştik
            hesaplanacak.vucutKitleHesapla(boydata, kilodata); //
            hesaplanacak.kaloriIhtiyaciHesapla(cinsiyetdata, yasdata, boydata, kilodata, gundata);


            Hesapla2 hesaplagit = new Hesapla2();
            hesaplagit.hesapla2(hedefData, kilodata, beslenmeData);


            Idman idm = new Idman();
            String yol = idm.idmanyaz(gundata, idmandata);




            String ayrac = new String(new char[15]).replace("\0", "-");
            String okunanVeri = null;
            File dosya = new File(yol);

            FileInputStream fileInputStream;
            byte veriler[] = new byte[(int) dosya.length()];

            System.out.println(ayrac + "\n< Java FileInputStream Dosya Okuma İşlemi >");

            try {
                fileInputStream = new FileInputStream(dosya);
                fileInputStream.read(veriler);
                okunanVeri = new String(veriler);
                sonuc.setText(okunanVeri);
            } catch (FileNotFoundException f) {
                System.out.println("-> Hata Mesajım: " + f.getMessage() + "\n-> Hata Kodum: " + e.hashCode());
            } catch (IOException f) {
                System.out.println("-> Hata Mesajım: " + f.getMessage() + "\n-> Hata Kodum: " + e.hashCode());
            }



        }


        catch (NumberFormatException k){
            System.out.println("Lütfen sayı giriniz!!!");
            System.out.println("*******************************************");
        }
    }
}

// Program çalıştığında başlayacak kod
class Form {

    public static void main(String[] args)
    {
        Gazifit f = new Gazifit();
    }
}