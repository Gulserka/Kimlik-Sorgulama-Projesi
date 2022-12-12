import java.util.*;

public class Kullanici {

    static Scanner scan = new Scanner(System.in);
    static Map<String, Kimlik_Pojo> kullanici = new HashMap<>();
    static Set<String> kimlikNumaralariSet = kullanici.keySet();

    public static void getInfo() throws InterruptedException {


        System.out.println("-----------<<< KİMLİK SORGU EKRANINA HOŞGELDİNİZ >>>-----------\n" +
                "Lutfen sorgulamak istediğiniz Kimlik Nosunu giriniz");

            String arananKimlik= scan.nextLine();

            if(kimlikNumaralariSet.contains(arananKimlik)) {
                Kimlik_Pojo kimlik = kullanici.get(arananKimlik);
                System.out.println(kimlik);
                System.out.println("Kişi aramaya devam etmek için 1 'e basiniz\n" +

                        "Anasayfaya dönmek için 2' basınız\n"+
                        "Çıkmak için herhangi bir tuşa basınız");


                String secim = scan.nextLine();
                if (secim.equals("1")) {
                    getInfo();
                } else if(secim.equals("2")) {
                    KimlikSorgulama.KimlikSorguAnaSayfa();
                } else{
                    cikis();
                }
            } else {
                System.out.println("Böyle bir kimlik numarası yoktur.");
                getInfo();
            }

        }

    static void saveInfo() throws InterruptedException {
        String secim = "";


        System.out.println("-----------<<< KİMLİK KAYIT EKRANINA HOŞGELDİNİZ >>>-------");
        System.out.println("Lutfen 4 haneli kimlik numaranızı giriniz..");

        String kimlikNo = scan.nextLine();
        scan.nextLine();

        if (kimlikNo.matches("[0-9]{4}")) {

            if (kimlikNumaralariSet.contains(kimlikNo)) {
                System.out.println("Kayıtlı bir kimlik numarası ile işlem yapmaya çalışıyorsunuz. " +
                        "Yeni bir kimlik no giriniz");
                Thread.sleep(2000);
                saveInfo();

            } else {

                System.out.println("Lutfen isim ve soyisminizi giriniz");
                String isim = scan.nextLine();
                System.out.println("Lutfen adresinizi giriniz");
                String adres = scan.nextLine();
                System.out.println("Lutfen telefon numaranizi giriniz");
                String telefonNo = scan.nextLine();


                Kimlik_Pojo kimlik = new Kimlik_Pojo(kimlikNo, isim, adres, telefonNo);
                kullanici.put(kimlikNo, kimlik);
                System.out.println(kullanici);

                System.out.println("Kayıt işlemi başarılı...");
                System.out.println(kullanici);
                System.out.println(" Kayıt İşlemine Devam Etmek için  : 1 \n" +
                        " Kayıt İşlemini Sonlandırmak için : 2 ");
                int secim2 = scan.nextInt();

                switch (secim2) {

                    case 1:
                        saveInfo();
                    case 2:
                        System.out.println("Anasayfaya yönlendiriliyorsunuz\n");
                        Thread.sleep(3000);
                        KimlikSorgulama.KimlikSorguAnaSayfa();
                        break;
                }
            }

        } else {
            System.out.println("Hatalı giriş!...Lutfen 4 haneli kimlik numaranızı giriniz");
            saveInfo();
        }

    }

    static void removeInfo() throws InterruptedException {
        System.out.println("----------# KİŞİ SİLME SAYFASI #----------");
        System.out.println("Silmek istediğiniz kişinin kimlik numarasını giriniz");
        String silinecekKimlik =scan.nextLine();

        if (kimlikNumaralariSet.contains(silinecekKimlik)) {
            System.out.println(kullanici.get(silinecekKimlik));
            kullanici.remove(silinecekKimlik);
            System.out.println(kullanici);
            System.out.println("İstediğiniz kişi başarıyla silindi\n" +
                    "Kişi silmeye devam etmek için 1 'e basiniz\n" +
                    "Anasayfaya dönmek için 2' basınız\n"+
                    "Çıkmak için herhangi bir tuşa basınız");


            String secim = scan.nextLine();
            if (secim.equals("1")) {
                removeInfo();
            } else if(secim.equals("2")) {
                KimlikSorgulama.KimlikSorguAnaSayfa();
            } else{
                cikis();
            }
            //    }
        } else {
            System.out.println("Böyle bir kimlik numarası yoktur.");
            removeInfo();
        }

    }

    static void cikis() throws InterruptedException {
        System.out.println("Cikis yapiliyor...");
        Thread.sleep(2000);
        System.exit(0);

    }
}
