
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year:  ");
        year = sc.nextInt();

        if (year % 4 ==0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(" no la nam nhuan ");
                }else {
                    System.out.println("khong phai la nam nhuan");
                }
            }else {
                System.out.println("no la nam nhuan");
            }
        }else {
            System.out.println("khong phai la nam nhuan");
        }

    }
}
