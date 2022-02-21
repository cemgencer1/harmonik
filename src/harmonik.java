import java.util.Scanner;
public class harmonik {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        double toplam=0,sayi =0;
        System.out.print("Haarmoniği Bulunacak Sayıyı Giriniz:");
        int number = inp.nextInt();
        for (int i =1;i<=number;i++){
            toplam += (1.0/i);

        }
        System.out.println("Harmonik :" + toplam);
    }

}
