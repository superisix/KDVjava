import java.util.Scanner;

public class Main4 {
     public static void main(String[] args){
        double kdvOrani = 0.18; 
        double fiyat;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ürün fiyatı giriniz: ");
        fiyat = scan.nextDouble();
        double kdvTutari = fiyat * kdvOrani;
        double kdvliFiyat = fiyat + kdvTutari;
        System.out.printf("Kdvsiz fiyat %.2f, Kdv tutarı %.2f, Kdvli fiyat %.2f", fiyat, kdvTutari, kdvliFiyat);
}
}