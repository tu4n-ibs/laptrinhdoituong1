import java.util.Scanner;

public class USDtoVND {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao day de doi tien");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("gia tri vnd ; " + quydoi);
    }
}
