/*
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

        Çin Zodyağı nedir?

        4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

        Çin Zodyağı nasıl hesaplanır?

        Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

        Doğum Tarihi %12 = 0 ➜ Maymun

        Doğum Tarihi %12 = 1 ➜ Horoz

        Doğum Tarihi %12 = 2 ➜ Köpek

        Doğum Tarihi %12 = 3 ➜ Domuz

        Doğum Tarihi %12 = 4 ➜ Fare

        Doğum Tarihi %12 = 5 ➜ Öküz

        Doğum Tarihi %12 = 6 ➜ Kaplan

        Doğum Tarihi %12 = 7 ➜ Tavşan

        Doğum Tarihi %12 = 8 ➜ Ejderha

        Doğum Tarihi %12 = 9 ➜ Yılan

        Doğum Tarihi %12 = 10 ➜ At

        Doğum Tarihi %12 = 11 ➜ Koyun
*/



import java.util.Scanner;

public class China {
    public static void main(String[] args) {

        int birthYear;
        String animal="";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz.");
        birthYear=scanner.nextInt();

        switch (birthYear%12) {
            case 0:
                animal="Maymun";
                break;
            case 1:
                animal="Horoz";
                break;

            case 2:
                animal="Köpek";
                break;

            case 3:
                animal="Domuz";
                break;

            case 4:
                animal="Fare";
                break;

            case 5:
                animal="Öküz";
                break;

            case 6:
                animal="Kaplan";
                break;

            case 7:
                animal="Tavşan";
                break;
            case 8:
                animal="Ejderha";
                break;

            case 9:
                animal="Yılan";
                break;

            case 10:
                animal="At";
                break;

            case 11:
                animal="Koyun";
                break;
        }
        if (animal.isEmpty()){
            System.out.println("Hatalı giriş.");
        }
        else{
            System.out.println("Çin zodyağı burcunuz : "+animal);
        }

    }
}
