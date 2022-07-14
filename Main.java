import java.util.Scanner;


public class Main {
    static int result = 1;
    static int usluSayi(int base, int exp) {


        if (exp == 0) {
            return 1;
        } else if (base == 0) {
            return 0;

        }


        result *= base;
        usluSayi(base, exp-1);
        return result;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Taban sayiyi giriniz: ");
        int base = sc.nextInt();
        System.out.println("Us sayiyi giriniz: ");
        int exp = sc.nextInt();

        System.out.println(usluSayi(base, exp));

    }

}



