import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int adet,n;
        int maxDeger = Integer.MIN_VALUE;
        int minDeger = Integer.MAX_VALUE;
        System.out.print("kac tane sayi gireceksiniz : ");
        adet = scan.nextInt();
                for(int i=0; i<adet; i++) {
                    System.out.print("Sayi giriniz : ");
                    n = scan.nextInt();

                    if(n > maxDeger)
                        maxDeger = n;
                    else if(n < minDeger)
                        minDeger = n;


                }

        System.out.println("en buyuk sayi : "+maxDeger);
        System.out.println("en kucuk sayi : "+minDeger);



    }
}