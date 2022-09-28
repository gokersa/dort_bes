import java.util.Scanner;

public class dort_bes_kuvvetler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, k;
        System.out.print("Limit sayısını giriniz:");
        k = input.nextInt();

        //4 sayısının kuvvetleri. for döngülerinden önce bir yazı çıktısı verelim ki sayılar karışmasın
        System.out.println("4 sayısının kuvvetleri");
        for (i=1; i<=k; i*=4) {
            System.out.println(i);
        }
        System.out.println("5 sayısının kuvvetleri");
        for (i=1; i<=k; i*=5) {
            System.out.println(i);
        }
    }
}
