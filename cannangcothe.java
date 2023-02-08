import java.util.Scanner;

public class cannangcothe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cannang , chieucao, bmi;

        System.out.println("nhap can nang: ");
        cannang = sc.nextDouble();

        System.out.println("nhap chieu cao: ");
        chieucao = sc.nextDouble();

        bmi = cannang / Math.pow(chieucao, 2);
        System.out.println("chi so trung binh: " + bmi);
        if (bmi < 18) {
            System.out.println("ban dang bi gay");
        }else if (bmi < 25.0) {
            System.out.println("ban binh thuong");
        }else  if ( bmi < 30.0) {
            System.out.println("ban nen giam can");
        }else {
            System.out.println(" ban phai giam cam ngay");
        }
    }
}
