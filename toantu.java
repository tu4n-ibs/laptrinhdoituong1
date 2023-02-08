import java.util.Scanner;
public class toantu {
    public static void main(String[] args) {
        double heght;
        double with;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai: ");
        heght = sc.nextDouble();

        System.out.println("nhap chieu rong: ");
        with = sc.nextDouble();

        double area = heght * with ;
        System.out.println("tong la: " + area);
    }
}
