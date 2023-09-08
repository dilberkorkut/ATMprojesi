import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);

        int right = 3;
        int select;

        while (right>0) {
            System.out.print("Kullanici adiniz: ");
            userName = input.nextLine();
            System.out.print("Parolaniz: ");
            password = input.nextLine();
            int balance = 1500;

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz!");

                do{
                    System.out.println("1- Para Yatirma\n" +
                            "2- Para Cekme\n" +
                            "3- Bakiye sorgulama\n" +
                            "4- Cikis");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
                    select = input.nextInt();

                    if(select ==1 ) {
                        System.out.print("Para miktarini giriniz: ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Para miktarini giriniz:");
                        int price = input.nextInt();
                        if (price>balance) {
                                System.out.println("Bakiyeniz yetersizdir.");
                        }else {
                            balance -= price;
                        }
                    } else if ( select == 3 ) {
                        System.out.println("Bakiyeniz: " +balance);
                    }

                } while(select != 4);
                System.out.println("Tekrar gorusmek uzere.");
                break;

            } else {
                right --;
                System.out.println("Hatali kullanici adi ve sifre.Tekrar deneyiniz.");
            } if (right == 0) {
                System.out.println("Kartiniz bloke olmustur.Lutfen bankanizla iletisime geciniz..");
            } else {
                System.out.println("Kalan hakkiniz: " +right);
            }
        }

    }
}