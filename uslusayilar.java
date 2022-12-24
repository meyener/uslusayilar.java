import java.util.Scanner;

/**
 * uslusayilar
 */
public class uslusayilar {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ust,alt,val1=1,val2;
        System.out.println("lütfen üssü gir: ");
        ust=scn.nextInt();
        System.out.println("lütfen sayiyi gir: ");
        alt=scn.nextInt();

        for(int i=1; i<=ust; i++){
            val1=val1*alt;
        }
        System.out.print("sonuc : " +val1);
    }
}