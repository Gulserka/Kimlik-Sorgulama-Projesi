import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class KimlikSorgulama {

    static Scanner scan = new Scanner(System.in);

    public static void KimlikSorguAnaSayfa() throws InterruptedException {


        String secim = "";
        do {

            System.out.println("**********-----Kimlik İşlemleri Ekranına Hoşgeldiniz-----**********");
            System.out.println("Lutfen yapacağınız işlemi seçiniz \n" +
                    "1 : Kimlik Kayıt \n" +
                    "2 : Kimlik Sorgu \n" +
                    "3 : Kimlik Silme \n" +
                    "4 : Çıkış");


            secim = scan.nextLine();

            switch (secim) {
                case "1":
                    Kullanici.saveInfo();
                    break;
                case "2":
                    Kullanici.getInfo();
                    break;
                case "3":
                    Kullanici.removeInfo();
                    break;
                case "4":
                    Kullanici.cikis();
                    break;
                default:
                    System.out.println("Lutfen gecerli bir giris yapiniz\n" +
                            "Giris ekranina yonlendiriliyorsunuz.");
                    Thread.sleep(3000);
                    KimlikSorguAnaSayfa();

            }
        } while (secim.equals("4"));


    }








}
